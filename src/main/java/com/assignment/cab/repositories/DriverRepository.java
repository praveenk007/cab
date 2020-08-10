package com.assignment.cab.repositories;

import com.assignment.cab.models.Driver;

public interface DriverRepository {

	Driver register(Driver driver);

	Driver fetchById(long id);
}
