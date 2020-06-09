package ftn.siit.sbnz.SBNZ;

import ftn.siit.sbnz.SBNZ.model.Car;
import ftn.siit.sbnz.SBNZ.model.Filter;
import ftn.siit.sbnz.SBNZ.model.Query;
import ftn.siit.sbnz.SBNZ.services.MainService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class SbnzApplicationTests {

	@Autowired
	private MainService mainService;
/*
	@Test
	void mainTest() {
		Car car1 = new Car();
		car1.setId(1);
		car1.setMake("Volkswagen");
		car1.setModel("Passat B5");
		car1.setCountry(Car.Country.GERMANY);
		car1.setFuel(Car.Fuel.DIESEL);
		car1.setYear(2000);
		car1.setPrice(1800.0);
		car1.setType(Car.Type.STATIONWAGON);
		car1.setLuxury(false);
		car1.setDoors(4);
		car1.setSeats(5);
		car1.setCc(1900);
		car1.setKw(85);
		car1.setKm(300000);
		car1.setEngine("TDI");
		car1.setRating(9.2);
		car1.setFuelConsumption(7.0);
		car1.setRegPrice(20000);
		car1.setGear(Car.Gear.MANUAL);

		Car car2 = new Car();
		car2.setId(2);
		car2.setMake("Fiat");
		car2.setModel("Punto");
		car2.setCountry(Car.Country.ITALY);
		car2.setFuel(Car.Fuel.GAS);
		car2.setYear(2006);
		car2.setPrice(1300.0);
		car2.setType(Car.Type.HATCHBACK);
		car2.setLuxury(false);
		car2.setDoors(2);
		car2.setSeats(5);
		car2.setCc(1400);
		car2.setKw(60);
		car2.setKm(150000);
		car2.setEngine("JTD");
		car2.setRating(7.9);
		car2.setFuelConsumption(9.0);
		car2.setRegPrice(15000);
		car2.setGear(Car.Gear.MANUAL);

		Car car3 = new Car();
		car3.setId(3);
		car3.setMake("Toyota");
		car3.setModel("Hilux");
		car3.setCountry(Car.Country.JAPAN);
		car3.setFuel(Car.Fuel.DIESEL);
		car3.setYear(2014);
		car3.setPrice(10000.0);
		car3.setType(Car.Type.PICKUP);
		car3.setLuxury(false);
		car3.setDoors(4);
		car3.setSeats(5);
		car3.setCc(2200);
		car3.setKw(100);
		car3.setKm(50000);
		car3.setEngine("HLX");
		car3.setRating(8.5);
		car3.setFuelConsumption(10.0);
		car3.setRegPrice(30000);
		car3.setGear(Car.Gear.AUTOMATIC);

		Car car4 = new Car();
		car4.setId(4);
		car4.setMake("Land Rover");
		car4.setModel("Range Rover");
		car4.setCountry(Car.Country.UK);
		car4.setFuel(Car.Fuel.DIESEL);
		car4.setYear(2016);
		car4.setPrice(30000.0);
		car4.setType(Car.Type.SUV);
		car4.setLuxury(true);
		car4.setDoors(4);
		car4.setSeats(5);
		car4.setCc(3500);
		car4.setKw(130);
		car4.setKm(70000);
		car4.setEngine("RNG");
		car4.setRating(8.7);
		car4.setFuelConsumption(15.0);
		car4.setRegPrice(100000);
		car4.setGear(Car.Gear.AUTOMATIC);

		Car car5 = new Car();
		car5.setId(5);
		car5.setMake("Lamborghini");
		car5.setModel("Aventador");
		car5.setCountry(Car.Country.ITALY);
		car5.setFuel(Car.Fuel.GAS);
		car5.setYear(2020);
		car5.setPrice(100000.0);
		car5.setType(Car.Type.COUPE);
		car5.setLuxury(true);
		car5.setDoors(2);
		car5.setSeats(2);
		car5.setCc(4000);
		car5.setKw(150);
		car5.setKm(0);
		car5.setEngine("LMB");
		car5.setRating(8.9);
		car5.setFuelConsumption(17.0);
		car5.setRegPrice(200000);
		car5.setGear(Car.Gear.MANUAL);

		Car car6 = new Car();
		car6.setId(6);
		car6.setMake("Mini");
		car6.setModel("Cooper");
		car6.setCountry(Car.Country.UK);
		car6.setFuel(Car.Fuel.DIESEL);
		car6.setYear(2010);
		car6.setPrice(4000.0);
		car6.setType(Car.Type.CONVERTIBLE);
		car6.setLuxury(false);
		car6.setDoors(2);
		car6.setSeats(5);
		car6.setCc(1600);
		car6.setKw(70);
		car6.setKm(150000);
		car6.setEngine("MNI");
		car6.setRating(6.7);
		car6.setFuelConsumption(6.0);
		car6.setRegPrice(25000);
		car6.setGear(Car.Gear.MANUAL);

		Car car7 = new Car();
		car7.setId(7);
		car7.setMake("Ford");
		car7.setModel("Galaxy");
		car7.setCountry(Car.Country.USA);
		car7.setFuel(Car.Fuel.GAS);
		car7.setYear(2007);
		car7.setPrice(3500.0);
		car7.setType(Car.Type.MINIVAN);
		car7.setLuxury(false);
		car7.setDoors(6);
		car7.setSeats(8);
		car7.setCc(1800);
		car7.setKw(80);
		car7.setKm(210000);
		car7.setEngine("TDCI");
		car7.setRating(7.0);
		car7.setFuelConsumption(10.0);
		car7.setRegPrice(23000);
		car7.setGear(Car.Gear.MANUAL);

		Car car8 = new Car();
		car8.setId(8);
		car8.setMake("Audi");
		car8.setModel("A8");
		car8.setCountry(Car.Country.GERMANY);
		car8.setFuel(Car.Fuel.HYBRID);
		car8.setYear(2017);
		car8.setPrice(60000.0);
		car8.setType(Car.Type.SEDAN);
		car8.setLuxury(true);
		car8.setDoors(4);
		car8.setSeats(5);
		car8.setCc(3000);
		car8.setKw(120);
		car8.setKm(40000);
		car8.setEngine("HYB");
		car8.setRating(8.4);
		car8.setFuelConsumption(2.5);
		car8.setRegPrice(90000);
		car8.setGear(Car.Gear.AUTOMATIC);

		Car car9 = new Car();
		car9.setId(9);
		car9.setMake("Volkswagen");
		car9.setModel("Golf 2");
		car9.setCountry(Car.Country.GERMANY);
		car9.setFuel(Car.Fuel.LPG);
		car9.setYear(1988);
		car9.setPrice(900.0);
		car9.setType(Car.Type.HATCHBACK);
		car9.setLuxury(false);
		car9.setDoors(4);
		car9.setSeats(5);
		car9.setCc(1300);
		car9.setKw(65);
		car9.setKm(550000);
		car9.setEngine("GTI");
		car9.setRating(10.0);
		car9.setFuelConsumption(11.0);
		car9.setRegPrice(15000);
		car9.setGear(Car.Gear.MANUAL);

		Car car10 = new Car();
		car10.setId(10);
		car10.setMake("Lada");
		car10.setModel("Niva");
		car10.setCountry(Car.Country.RUSSIA);
		car10.setFuel(Car.Fuel.GAS);
		car10.setYear(2011);
		car10.setPrice(3000.0);
		car10.setType(Car.Type.SUV);
		car10.setLuxury(false);
		car10.setDoors(2);
		car10.setSeats(5);
		car10.setCc(1600);
		car10.setKw(85);
		car10.setKm(180000);
		car10.setEngine("RUS");
		car10.setRating(9.3);
		car10.setFuelConsumption(12.0);
		car10.setRegPrice(21000);
		car10.setGear(Car.Gear.MANUAL);

		ArrayList<Car> cars = new ArrayList<>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		cars.add(car6);
		cars.add(car7);
		cars.add(car8);
		cars.add(car9);
		cars.add(car10);

		Query query = new Query();
		query.setBudget(100000);
		query.setFamilySize(4);
		query.setExperience(5);
		query.setPurpose(Query.Purpose.EVERYDAY);
		query.setRegNotExpensive(false);
		query.setLowFuelConsumption(false);
		query.setAge(10);
		query.setLuxury(true);
		query.setCountry(Car.Country.UK);
		query.setMake("LAND ROVER");
		query.setGear(Query.Gear.AUTOMATIC);
		query.setEnvironment(false);
		query.setLowKm(true);

		Filter filter = new Filter();
		filter.setFuel(Car.Fuel.DIESEL);
		filter.setType(Car.Type.SUV);
		filter.setGear(Car.Gear.AUTOMATIC);

		mainService.filter(filter);

	}
*/
}
