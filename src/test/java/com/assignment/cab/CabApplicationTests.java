package com.assignment.cab;

import com.assignment.cab.models.*;
import com.assignment.cab.service.UserService;
import com.assignment.cab.service.impl.CabService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Locale;

@SpringBootTest
class CabApplicationTests {

	@Autowired
	private UserService<Rider> riderService;

	@Autowired
	private UserService<Driver> driverService;

	@Autowired
	private CabService cabService;

	@Test
	public void registerAndBookCab() {
		final Rider rider = new Rider();
		rider.setEmailId("pk.g.com");
		rider.setFirstName("praveen");
		rider.setLastName("kamath");
		final Rider storedRider = riderService.register(rider);



		final Driver driver1 = new Driver();
		driver1.setLicenceNumber("LICENCE1234");
		driver1.setEmailId("joe@g.com");
		driver1.setFirstName("joe");
		driver1.setLastName("doe");
		final Driver storedDriver1 = driverService.register(driver1);

		final Cab cab1 = new Cab();
		cab1.setDriverId(storedDriver1.getId());
		cab1.setColor("WHITE");
		Address address1 = new Address();
		address1.setLocation(new Location(10, 10));
		cab1.setCurrentLocation(address1);
		final Cab storedCab1 = cabService.register(cab1);

		final Driver driver2 = new Driver();
		driver2.setLicenceNumber("LICENCE1234");
		driver2.setEmailId("james@g.com");
		driver2.setFirstName("james");
		driver2.setLastName("bond");
		final Driver storedDriver2 = driverService.register(driver1);

		final Cab cab2 = new Cab();
		cab2.setDriverId(storedDriver2.getId());
		cab2.setColor("RED");
		Address address2 = new Address();
		address2.setLocation(new Location(70, 65));
		cab2.setCurrentLocation(address2);
		final Cab storedCab2 = cabService.register(cab2);

		final Address source = new Address();
		source.setLocation(new Location(1, 1));
		final Cab nearestCab = cabService.fetchNearest(source);
		System.out.println(nearestCab);
	}
}
