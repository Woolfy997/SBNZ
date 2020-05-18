package ftn.siit.sbnz.SBNZ.util;

import ftn.siit.sbnz.SBNZ.model.Car;

import java.util.Comparator;

public class Sorter implements Comparator<Car> {

    @Override
    public int compare(Car c1, Car c2) {
        return c2.getScore() - c1.getScore();
    }
}
