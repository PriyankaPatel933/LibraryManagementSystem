package com.jsp.pd.connection;

import java.sql.SQLException;
import java.sql.Statement;





public class CreateProductTable {
	CreateProductTable(){
		try {
			Statement st=new ConnectToDatabase().connect().createStatement();
			st.execute("Create table Product(ProductId int primary key,ProductName varchar(60) Not Null, Description varchar(60), Price numeric (7.2), QuantityInStock int, Manufacturer varchar (50), Category varchar(90) )");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public static void main(String[] args) {
		new CreateProductTable();
		
	}
	
	
	
}
