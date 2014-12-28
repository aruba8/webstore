package com.pact.webstore.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pact.webstore.domain.Product;
import com.pact.webstore.domain.repository.ProductRepository;
import com.pact.webstore.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

	public List<Product> getProductsByCategory(String category) {
		return productRepository.getProductByCategory(category);
	}

	public Set<Product> getProductsByFilter(Map<String, List<String>> filterParams) {
		return productRepository.getProductsByFilter(filterParams);
	}

	public Product getProductById(String productID) {
		return productRepository.getProductById(productID);
	}

	public void addProduct(Product product) {
		productRepository.addProduct(product);
	}

}
