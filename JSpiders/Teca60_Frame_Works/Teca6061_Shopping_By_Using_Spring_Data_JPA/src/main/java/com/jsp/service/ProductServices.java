package com.jsp.service;

import java.util.List;

import com.jsp.entity.Product;

public interface ProductServices {
	
	void addProduct();
	List<Product> allProductDetails();
	
	List<Product> productByNameOrBrand(String brandOrName);
	
	List<Product> productByPrice(double minPrice, double maxPrice);

}
