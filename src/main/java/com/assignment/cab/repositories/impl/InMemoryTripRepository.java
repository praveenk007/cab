package com.assignment.cab.repositories.impl;

import com.assignment.cab.models.Trip;
import com.assignment.cab.repositories.TripRepository;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

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
public class InMemoryTripRepository implements TripRepository {

	private static final Map<String, Trip> REPOSITORY = new ConcurrentHashMap<>();

	@Override
	public boolean saveTrip(final Trip trip) {
		REPOSITORY.put(trip.getTripId(), trip);
		return true;
	}
}
