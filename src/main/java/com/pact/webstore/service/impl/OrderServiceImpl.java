package com.pact.webstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pact.webstore.domain.Product;
import com.pact.webstore.domain.repository.ProductRepository;
import com.pact.webstore.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private ProductRepository productRepository;

	public void processOrder(String productId, long quantity) {
		Product productById = productRepository.getProductById(productId);
		if(productById.getUnitsInStock() < quantity){
			throw new IllegalArgumentException("Out of stock. Available units in stock "+ productById.getUnitsInStock());
		}
		productById.setUnitsInStock(productById.getUnitsInStock() - quantity);
	}

}
