package com.sprint.repo;

import com.sprint.entity.DriverHistory;
import com.sprint.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {


    boolean existsByEmail(String email);


}
