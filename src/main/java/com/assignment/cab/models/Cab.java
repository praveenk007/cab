package com.assignment.cab.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author praveenkamath
 * created on 17/07/20
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Cab extends BaseEntity {

	private String registrationNumber;

	//private Mode mode;

	private String color;

	private String make;

	private String model;

	private String variant;

	private long driverId;

	private Address currentLocation;
}
