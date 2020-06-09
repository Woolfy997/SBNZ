package ftn.siit.sbnz.SBNZ.web.controller;

import ftn.siit.sbnz.SBNZ.model.Car;
import ftn.siit.sbnz.SBNZ.model.Filter;
import ftn.siit.sbnz.SBNZ.model.Query;
import ftn.siit.sbnz.SBNZ.services.MainService;
import ftn.siit.sbnz.SBNZ.web.dto.FilterDTO;
import ftn.siit.sbnz.SBNZ.web.dto.QueryDTO;
import ftn.siit.sbnz.SBNZ.web.dto.RuleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

@CrossOrigin("http://localhost:3000")
@RestController
public class QueryController {

    @Autowired
    private MainService mainService;

    @PostMapping("/query")
    public ResponseEntity<ArrayList<Car>> query(@RequestBody QueryDTO queryDTO) {
        Query query = new Query(queryDTO);
        ArrayList<Car> bestMatch = mainService.bestMatches(query);
        return new ResponseEntity<>(bestMatch, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Car> getById(@PathVariable("id") int id) {
        Car car = mainService.getById(id);
        return new ResponseEntity<>(car, HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<ArrayList<Car>> getAll() {
        ArrayList<Car> cars  = mainService.getAll();
        return new ResponseEntity<>(cars, HttpStatus.OK);
    }

    @PostMapping("/filter")
    public ResponseEntity<ArrayList<Car>> filter(@RequestBody FilterDTO filterDTO) {
        Filter filter = new Filter(filterDTO);
        ArrayList<Car> filtered = mainService.filter(filter);
        return new ResponseEntity<>(filtered, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/addRule")
    public ResponseEntity<String> addRule(@RequestBody RuleDTO ruleDTO) {
        mainService.addRule(ruleDTO);
        return new ResponseEntity<>("Rule added", HttpStatus.OK);
    }
}
