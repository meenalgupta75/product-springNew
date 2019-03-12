package com.cts.product.dao;

import java.util.List;

import com.cts.product.bean.Product;

public interface ProductDAO {

	public String insertProduct(Product product);
	public String deleteProduct();
	public List<Product> getAllProduct();
	public List<Product> getProductById(String uderName, Product product);
	
}
