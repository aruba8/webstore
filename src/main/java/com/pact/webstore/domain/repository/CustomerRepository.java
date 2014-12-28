package com.pact.webstore.domain.repository;

import java.util.List;

import com.pact.webstore.domain.Customer;

public interface CustomerRepository {
	
	List<Customer> getAllCustomers();

}
