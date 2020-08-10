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
public class Driver extends BaseUser {

	private String licenceNumber;

	private long cabId;
}
