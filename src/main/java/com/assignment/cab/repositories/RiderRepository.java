package com.assignment.cab.repositories;

import com.assignment.cab.models.Rider;

public interface RiderRepository {

	Rider register(Rider rider);

	Rider fetch(long id);
}
