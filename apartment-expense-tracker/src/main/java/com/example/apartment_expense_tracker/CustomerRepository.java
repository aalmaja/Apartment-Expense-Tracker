package com.example.apartment_expense_tracker;

import com.example.apartment_expense_tracker.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
