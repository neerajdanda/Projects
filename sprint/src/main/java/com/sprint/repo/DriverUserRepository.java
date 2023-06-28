package com.sprint.repo;

import com.sprint.entity.DriverHistory;
import com.sprint.entity.DriverUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverUserRepository extends JpaRepository<DriverUser, Integer> {
    boolean existsByEmail(String email);

}
