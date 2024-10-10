package com.jsp.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import com.jsp.DAO.ProductDAO;
import com.jsp.entity.Product;

public class ProductServicesImpl implements ProductServices{
	
	@Autowired
	Scanner scanner;
	
	@Autowired
	ProductDAO productDAO;

	@Override
	public void addProduct() {
		
	}

	@Override
	public List<Product> allProductDetails() {
		return productDAO.getAllProductDetails();
	}

	@Override
	public List<Product> productByNameOrBrand(String brandOrName) {
		return productDAO.getProductByUsingBrandrName(brandOrName);
	}

	@Override
	public List<Product> productByPrice(double minPrice, double maxPrice) {
		return productDAO.getProductByUsingPrice(minPrice, maxPrice);
	}
	
	

}
