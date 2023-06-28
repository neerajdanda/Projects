package com.sprint.repo;

import com.sprint.entity.DriverHistory;
import com.sprint.entity.UserHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserHistoryRepository extends JpaRepository<UserHistory, Integer> {
}
