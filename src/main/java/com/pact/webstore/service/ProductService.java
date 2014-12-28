package com.pact.webstore.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.pact.webstore.domain.Product;

public interface ProductService {
	List<Product> getAllProducts();
	List<Product> getProductsByCategory(String category);
	Product getProductById(String productID);
	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
	void addProduct(Product product);
}
