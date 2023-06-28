package com.sprint.repo;

import com.sprint.entity.DriverHistory;
import com.sprint.entity.UserLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLocationRepository extends JpaRepository<UserLocation, Integer> {
}
