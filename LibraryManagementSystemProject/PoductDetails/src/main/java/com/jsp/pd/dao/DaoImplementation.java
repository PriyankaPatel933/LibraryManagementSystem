package com.jsp.pd.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Scanner;

import com.jsp.pd.connection.ConnectToDatabase;
import com.jsp.pd.model.Product;

public class DaoImplementation implements Dao {



	@Override
	public boolean addProduct(Product pro) {
	 // TODO Auto-generated method stub
		Connection connection = new ConnectToDatabase().connect();
		
		try{
			PreparedStatement prepareStatement=connection.prepareStatement("insert into Product values(?,?,?,?,?,?,?);");
			
			
			
			pro.setProductID(0);
			pro.getProductID();
			
			pro.setProductName(null);
			pro.getProductName();
			
			pro.setDescription(null);
			pro.getDescription();
			
			pro.setPrice(0);
			pro.getPrice();
			
			pro.setQuantityInStock(0);
			pro.getQuantityInStock();
			
			
			pro.setCategory(null);
			
			pro.setManufacturer(null);
			pro.getCategory();
				
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	
	
		@Override
		public LinkedList<Product> findAllProduct() {
			LinkedList<Product>products =new LinkedList<Product>();
			try {
				java.sql.Statement statement=new ConnectToDatabase().connect().createStatement();
				ResultSet rs=statement.executeQuery("select * from product");
				if(rs.next()) {
					Product product=new Product();
					product.setProductID(rs.getInt(1));
					product.setProductName(rs.getString(2));
					product.setDescription(rs.getString(3));
					product.setPrice(rs.getDouble(4));
					product.setQuantityInStock(rs.getInt(5));
					product.setManufacturer(rs.getString(6));
					product.setCategory(rs.getString(7));
					products.add(product);
				}						
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return products;
	}

		@Override
		public int updateProduct(int productId) {
			// TODO Auto-generated method stub
			int count=0;
			try {
				java.sql.Statement statement=new ConnectToDatabase().connect().createStatement();
				count=statement.executeUpdate("update product set productName="+sc.nextLine()+"where prouctId="+productId);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
		return 0;
	}
		
		@Override
		public int deleteProduct(int productId) {
			int count=0;	
				try {
					java.sql.Statement statement=new ConnectToDatabase().connect().createStatement();
					count=statement.executeUpdate("delete from product where prouctId="+productId);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
					
			return count;
		}
		
		
		
		
		@Override
		public LinkedList<Product> findByPrice(double Price) {
			LinkedList<Product>products =new LinkedList<Product>();
			
			if(Price>1000) {
			try {
				java.sql.Statement statement=new ConnectToDatabase().connect().createStatement();
				ResultSet rs=statement.executeQuery("select * from product where price="+Price);
				if(rs.next()) {
					Product product=new Product();
					product.setProductID(rs.getInt(1));
					product.setProductName(rs.getString(2));
					product.setDescription(rs.getString(3));
					product.setPrice(rs.getDouble(4));
					product.setQuantityInStock(rs.getInt(5));
					product.setManufacturer(rs.getString(6));
					product.setCategory(rs.getString(7));
					products.add(product);
				}
				
							
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}else {
				System.out.println("please enter price more than 1000");
			}
			return products;
		}
		
		
		
		
		

		@Override
		public boolean isProductIdPresent(int lib_id) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public int generateProductID() {
			// TODO Auto-generated method stub
			return 0;
		}

}
