package com.jsp.pd.dao;

import java.util.LinkedList;

import com.jsp.pd.model.Product;

public interface Dao {
	public boolean addProduct(Product pro);
	public boolean isProductIdPresent(int lib_id);
	public int generateProductID();
	LinkedList<Product> findAllProduct();
	int updateProduct(int productId);
	int deleteProduct(int productId);
	LinkedList<Product> findByPrice(double Price);

}
