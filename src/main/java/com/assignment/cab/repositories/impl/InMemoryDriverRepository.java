package com.assignment.cab.repositories.impl;

import com.assignment.cab.models.Driver;
import com.assignment.cab.repositories.DriverRepository;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

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
public class InMemoryDriverRepository implements DriverRepository {

	private static AtomicLong COUNTER = new AtomicLong();

	private static final Map<Long, Driver> REPOSITORY = new ConcurrentHashMap<>();

	@Override
	public Driver register(final Driver driver) {
		final long id = COUNTER.incrementAndGet();
		driver.setId(id);
		REPOSITORY.put(driver.getId(), driver);
		return driver;
	}

	@Override
	public Driver fetchById(final long id) {
		return REPOSITORY.get(id);
	}
}
