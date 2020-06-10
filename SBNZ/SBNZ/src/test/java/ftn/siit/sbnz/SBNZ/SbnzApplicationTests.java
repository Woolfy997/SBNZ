package ftn.siit.sbnz.SBNZ;

import ftn.siit.sbnz.SBNZ.model.Car;
import ftn.siit.sbnz.SBNZ.model.Filter;
import ftn.siit.sbnz.SBNZ.model.Query;
import ftn.siit.sbnz.SBNZ.services.MainService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

@SpringBootTest
class SbnzApplicationTests {

	@Autowired
	private MainService mainService;

	@Test
	void testQuery() {
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

		ArrayList<Car> result = mainService.bestMatches(query);
		assertEquals(result.get(0).getMake(), "Land Rover");
		assertEquals(result.get(0).getModel(), "Range Rover");
		assertEquals(result.get(1).getMake(), "Audi");
		assertEquals(result.get(1).getModel(), "A8");
		assertEquals(result.get(2).getMake(), "Toyota");
		assertEquals(result.get(2).getModel(), "Hilux");
	}

	@Test
	void testFilter() {
		Filter filter = new Filter();
		filter.setFuel(Car.Fuel.DIESEL);
		filter.setType(Car.Type.STATIONWAGON);
		filter.setGear(Car.Gear.MANUAL);

		ArrayList<Car> result = mainService.filter(filter);
		assertEquals(result.get(0).getMake(), "Volkswagen");
		assertEquals(result.get(0).getModel(), "Passat B5");

	}

}
