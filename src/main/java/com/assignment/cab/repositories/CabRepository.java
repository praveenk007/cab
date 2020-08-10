package com.assignment.cab.repositories;

import com.assignment.cab.models.Cab;

public interface CabRepository {

	Cab register(Cab cab);

	Cab findNearest(long x, long y, int range);
}
