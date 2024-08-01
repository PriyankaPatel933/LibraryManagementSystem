package com.jsp.pd.view;

import java.util.Scanner;

import com.jsp.pd.dao.Dao;
import com.jsp.pd.dao.DaoImplementation;
import com.jsp.pd.model.Product;


public class View {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

	Dao prodetails=new DaoImplementation();
	System.out.println("Our Product Details");
	
	System.out.println("Choose \n1. For Enter Product Details \n2. For Keeping Product in ProductTable \n3. Find the Product by ProductId \n4. Find the product by product Name ");
	int choose=sc.nextInt();
	
	
	
	int chose=0;
	switch (chose) {
	case  1: {
		Product pro=new Product();
		System.out.println("Enter the ProductName");
		sc.nextInt();
		System.out.println("Enter the Product Description");
		pro.setDescription(null);
		sc.nextLine();
		
		System.out.println("Enter the Price");
		pro.setPrice(chose);
		sc.nextInt();
		
		System.out.println("Enter the QuantityInStock");
		pro.setQuantityInStock(chose);
		sc.nextInt();
		
		System.out.println("Enter the Manufacture");
		pro.setManufacturer(null);
		sc.nextLine();
		
		System.out.println("Enter the Category");
		pro.setCategory(null);
		sc.nextLine();
	
	}
	break;
	
	default:
		break;
	}
	
	
	}

}
