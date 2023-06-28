package com.sprint.repo;

import com.sprint.entity.DriverHistory;
import com.sprint.entity.DriverLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverLocationRepository extends JpaRepository<DriverLocation, Integer> {
}
