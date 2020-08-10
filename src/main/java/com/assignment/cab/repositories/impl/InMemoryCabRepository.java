package com.assignment.cab.repositories.impl;

import com.assignment.cab.models.Cab;
import com.assignment.cab.repositories.CabRepository;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
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
public class InMemoryCabRepository implements CabRepository {

	private static AtomicLong COUNTER = new AtomicLong();

	private static final Map<Long, Cab> REPOSITORY = new ConcurrentHashMap<>();

	@Override
	public Cab findNearest(final long x, final long y, final int range) {
		//1. get a cab by rating
		//2. get a cab by fare
		double nearestDistance = 0;
		Cab nearestCab = null;
		for(final Map.Entry<Long, Cab> entry: REPOSITORY.entrySet()) {
			final Cab cab = entry.getValue();
			final long currentX = cab.getCurrentLocation().getLocation().getX();
			final long currentY = cab.getCurrentLocation().getLocation().getX();
			final double distance = Math.sqrt(Math.pow(currentX - x, 2) + Math.pow(currentY - y, 2));
			if(distance > range) {
				continue;
			}
			if(nearestDistance == 0 || nearestDistance > distance) {
				nearestDistance = distance;
				nearestCab = cab;
			}
		}
		return nearestCab;
	}

	@Override
	public Cab register(@NotNull final Cab cab) {
		final long id = COUNTER.incrementAndGet();
		REPOSITORY.put(id, cab);
		cab.setId(id);
		return cab;
	}
}
