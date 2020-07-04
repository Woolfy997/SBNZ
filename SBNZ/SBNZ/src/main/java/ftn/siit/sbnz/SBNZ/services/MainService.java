package ftn.siit.sbnz.SBNZ.services;

import ftn.siit.sbnz.SBNZ.model.Car;
import ftn.siit.sbnz.SBNZ.model.Filter;
import ftn.siit.sbnz.SBNZ.model.Query;
import ftn.siit.sbnz.SBNZ.repository.CarRepository;
import ftn.siit.sbnz.SBNZ.util.Sorter;
import ftn.siit.sbnz.SBNZ.web.dto.RuleDTO;
import org.apache.maven.shared.invoker.*;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

@org.springframework.stereotype.Service
public class MainService {

    @Autowired
    private KieContainer kieContainer;

    @Autowired
    private CarRepository carRepository;

    public ArrayList<Car> bestMatches(Query query) {
        KieSession kieSession =  kieContainer.newKieSession("kars");
        kieSession.getAgenda().getAgendaGroup("recommendation").setFocus();
        ArrayList<Car> cars = (ArrayList<Car>) carRepository.findAll();
        kieSession.setGlobal("q", query);
        //kieSession.setGlobal("filter", new Filter());
        //kieSession.setGlobal("filtered", new ArrayList<Car>());
        for (Car car: cars) {
            kieSession.insert(car);
        }
        kieSession.fireAllRules();
        kieSession.dispose();
        Collections.sort(cars, new Sorter());
        ArrayList<Car> best = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            best.add(cars.get(i));
        }
        return best;
    }

    public Car getById(int id) {
        return carRepository.findById(id);
    }

    public ArrayList<Car> getAll() {
        return (ArrayList<Car>) carRepository.findAll();
    }

    private void cleanInstall () throws RuntimeException, MavenInvocationException {
        InvocationRequest request = new DefaultInvocationRequest();
        request.setPomFile( new File( "..\\drools-spring-kjar\\pom.xml" ) );
        ArrayList<String> goals = new ArrayList<String>();
        goals.add("clean");
        goals.add("install");
        request.setGoals(goals);
        Invoker invoker = new DefaultInvoker();
        invoker.setMavenHome(new File(System.getenv("M2_HOME")));
        invoker.execute( request );
    }

    public void addRule(RuleDTO ruleDTO){
        String path = "..\\drools-spring-kjar\\src\\main\\resources\\sbnz\\integracija\\" + ruleDTO.getName() + ".drl";
        try {
            if(new File(path).exists()){
                return;
            }
            PrintWriter out = new PrintWriter(new File(path));
            out.println(ruleDTO.getCode());
            out.close();
            cleanInstall();
            return;
        } catch (MavenInvocationException | FileNotFoundException e){
            return;
        } catch (RuntimeException e){
            new File(path).delete();
            return;
        }
    }

    public ArrayList<Car> filter(Filter filter) {
        KieSession kieSession =  kieContainer.newKieSession("kars");
        kieSession.getAgenda().getAgendaGroup("filtering").setFocus();
        ArrayList<Car> cars = (ArrayList<Car>) carRepository.findAll();
        ArrayList<Car> filtered = new ArrayList<>();
        kieSession.setGlobal("filter", filter);
        kieSession.setGlobal("filtered", filtered);
        Query query = new Query();
        query.setAge(0);
        query.setBudget(0);
        query.setExperience(0);
        query.setFamilySize(0);
        kieSession.setGlobal("q", query);
        for (Car car: cars) {
            kieSession.insert(car);
        }
        kieSession.fireAllRules();
        filtered = (ArrayList<Car>) kieSession.getGlobal("filtered");
        kieSession.dispose();
        return filtered;
    }

    public void addCar(Car car) {
        carRepository.save(car);
    }


}
