package com.pact.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pact.webstore.domain.Customer;
import com.pact.webstore.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
	
	List<Customer> listOfCustomers = new ArrayList<Customer>();
	
	public InMemoryCustomerRepository(){
		Customer customer = new Customer("c122", "John Dow", "1324, Grant ave, Winnipeg, MB, R30 0A0");
		customer.setNoOfOrdersMade(14);
		listOfCustomers.add(customer);
	}

	public List<Customer> getAllCustomers() {
		return listOfCustomers;
	}

}
