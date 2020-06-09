package ftn.siit.sbnz.SBNZ.services;

import ftn.siit.sbnz.SBNZ.model.Car;
import ftn.siit.sbnz.SBNZ.model.Filter;
import ftn.siit.sbnz.SBNZ.model.Query;
import ftn.siit.sbnz.SBNZ.util.Sorter;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Collections;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    public SessionService sessionService;

    public void test(ArrayList<Car> cars, Query query, Filter filter) {
        KieSession kieSession =  sessionService.getKieSession();
        kieSession.setGlobal("q", query);
        kieSession.setGlobal("cars", new ArrayList<Car>());
        kieSession.setGlobal("filter", filter);
        for (Car car: cars) {
            kieSession.insert(car);
        }
        kieSession.fireAllRules();
        kieSession.dispose();
        Collections.sort(cars, new Sorter());
        System.out.println("Top 3");
        for (int i = 0; i < 3; i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("");
        System.out.println("Rest");
        for (int i = 3; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println(kieSession.getGlobal("cars"));
    }
}
