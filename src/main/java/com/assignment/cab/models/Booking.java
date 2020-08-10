package com.assignment.cab.models;

import com.assignment.cab.enums.TripStatus;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

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
@Builder
@EqualsAndHashCode(callSuper = true)
public class Booking extends BaseEntity {

	private String bookingId;

	private Date bookingDate;

	private long riderId;

	private int numberSeats;

	private long cabId;

	//private Mode mode;

	private Address source;

	private Address destination;

	private TripStatus status;

	private Date startedAt;

	private Date endedAt;
}