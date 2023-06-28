package com.sprint.service;

import com.sprint.entity.DriverUser;
import com.sprint.repo.DriverUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverUserService {

    private final DriverUserRepository driverUserRepository;

    @Autowired
    public DriverUserService(DriverUserRepository driverUserRepository) {
        this.driverUserRepository = driverUserRepository;
    }

    public void deleteDriverUserById(Integer driverUserId) {
        driverUserRepository.deleteById(driverUserId);
    }

    public DriverUser createDriverUser(String identificationNumber, String firstName, String lastName, String email, int phoneNo, int overallRating, String carNumber, String carName, String carColor, String carModel, String carModelYear, String password) {
        DriverUser driverUser = new DriverUser(identificationNumber, firstName, lastName, email, phoneNo, overallRating, carNumber, carName, carColor, carModel, carModelYear, password);
        return driverUserRepository.save(driverUser);
    }

    public boolean existsDriverUserByEmail(String email) {
        return driverUserRepository.existsByEmail(email);
    }

    public Optional<DriverUser> getDriverUserById(Integer driverUserId) {
        return driverUserRepository.findById(driverUserId);
    }

    public List<DriverUser> getAllDriverUsers() {
        return driverUserRepository.findAll();
    }

    public void updateDriverUser(DriverUser driverUser) {
        driverUserRepository.save(driverUser);
    }

    public void deleteDriverUser(DriverUser driverUser) {
        driverUserRepository.delete(driverUser);
    }
}
