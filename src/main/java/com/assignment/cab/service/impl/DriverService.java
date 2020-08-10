package com.assignment.cab.service.impl;

import com.assignment.cab.models.Driver;
import com.assignment.cab.repositories.DriverRepository;
import com.assignment.cab.service.UserService;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

/**
 * <p>
 *
 * </p>
 *
 * @author praveenkamath
 * created on 17/07/20
 * @since 1.0.0
 */
@Service
public class DriverService implements UserService<Driver> {

	private DriverRepository driverRepository;

	public DriverService(DriverRepository driverRepository) {
		this.driverRepository = driverRepository;
	}

	@Override
	public Driver register(@NotNull final Driver driver) {
		driverRepository.register(driver);
		return driver;
	}

	@Override
	public Driver fetch(final long id) {
		return driverRepository.fetchById(id);
	}
}
