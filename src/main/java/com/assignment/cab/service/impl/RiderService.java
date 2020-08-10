package com.assignment.cab.service.impl;

import com.assignment.cab.models.Rider;
import com.assignment.cab.repositories.RiderRepository;
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
public class RiderService implements UserService<Rider> {

	private RiderRepository riderRepository;

	public RiderService(RiderRepository riderRepository) {
		this.riderRepository = riderRepository;
	}

	@Override
	public Rider register(@NotNull final Rider rider) {
		riderRepository.register(rider);
		return rider;
	}

	@Override
	public Rider fetch(final long id) {
		return riderRepository.fetch(id);
	}
}
