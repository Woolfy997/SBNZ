package ftn.siit.sbnz.SBNZ.repository;

import ftn.siit.sbnz.SBNZ.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
    Car findById(int id);
}
