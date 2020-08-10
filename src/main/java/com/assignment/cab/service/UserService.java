package com.assignment.cab.service;

/**
 * <p>
 *
 * </p>
 *
 * @author praveenkamath
 * created on 17/07/20
 * @since 1.0.0
 */
public interface UserService<T> {

	T register(T user);

	T fetch(long id);
}
