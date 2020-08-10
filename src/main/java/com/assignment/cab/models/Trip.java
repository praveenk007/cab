package com.assignment.cab.models;

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
public class Trip extends BaseEntity {

	private long cabId;
}