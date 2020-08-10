package com.assignment.cab.models;

import com.assignment.cab.enums.AddressType;
import lombok.*;

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
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Address extends BaseEntity {

	private String line1;

	private String line2;

	private int pincode;

	private Location location;

	private AddressType type;
}
