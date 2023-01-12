package com.example.filhanterare.repo;

import com.example.filhanterare.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findEmployeeByFirstnameAndLastname(String firstname, String lastname);
    Optional<Customer> findEmployeeById(long id);
    List<Customer> findAll();
}
