package com.jsp.DAO;

import java.util.List;

import com.jsp.entity.Product;

public interface ProductDAO {
	List<Product> saveAllProducts(List<Product> product);
	List<Product> getAllProductDetails();
	List<Product> getProductByUsingBrandrName(String brandOrName);
	List<Product> getProductByUsingPrice(double minPrice,double maxPrice);
	

}
