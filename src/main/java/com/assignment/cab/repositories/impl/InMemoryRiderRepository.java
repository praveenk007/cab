package com.assignment.cab.repositories.impl;

import com.assignment.cab.models.Driver;
import com.assignment.cab.models.Rider;
import com.assignment.cab.repositories.RiderRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
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
public class InMemoryRiderRepository implements RiderRepository {

	private static AtomicLong COUNTER = new AtomicLong();

	private static final Map<Long, Rider> REPOSITORY = new ConcurrentHashMap<>();

	@Override
	public Rider register(final Rider rider) {
		final long id = COUNTER.incrementAndGet();
		rider.setId(id);
		REPOSITORY.put(rider.getId(), rider);
		return rider;
	}

	@Override
	public Rider fetch(final long id) {
		return REPOSITORY.get(id);
	}
}
