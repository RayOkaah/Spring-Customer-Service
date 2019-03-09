package com.rayokaah.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rayokaah.customerservice.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}