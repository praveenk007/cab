package com.assignment.cab.service.impl;

import com.assignment.cab.models.Address;
import com.assignment.cab.models.Cab;
import com.assignment.cab.repositories.CabRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
public class CabService {

	@Autowired
	private CabRepository cabRepository;

	public Cab register(@NotNull final Cab cab) {
		return cabRepository.register(cab);
	}

	public Cab fetchNearest(final Address source) {
		return cabRepository.findNearest(source.getLocation().getX(), source.getLocation().getY(), 50);
	}
}
