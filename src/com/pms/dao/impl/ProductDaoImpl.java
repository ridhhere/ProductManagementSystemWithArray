package com.pms.dao.impl;

import java.util.Scanner;

import com.pms.pojo.Product;

public class ProductDaoImpl {
	
	Scanner sc=new Scanner(System.in);
	Product ProductInfo[]=null;
	public void addProducts() {
		System.out.println("How Many Products Do You Want to Add");
		int size=sc.nextInt();
		ProductInfo=new Product[size];

		for(int i=0;i<size;++i) {
		System.out.println("Enter Product ID");
		int id=sc.nextInt();
		System.out.println("Enter Product Name");
		String name=sc.next();
		System.out.println("Enter Product Quantity");
		int qty=sc.nextInt();
		System.out.println("Enter Product Price");
		int price=sc.nextInt();
		
		//DTO Data Transfer Object
		Product pro= new Product(id,name,qty,price);
		ProductInfo[i]=pro;
		
		System.out.println("Product Added SuccessFully");

		}//end of loop

	}// end of Products
	
	public Product[] viewAllProducts() {
		return null;
	}
	
	public Product viewProduct(int pid) {
		if(ProductInfo!=null) {
		for(Product pro:ProductInfo) {
			if(pro.getPid()==pid) {
				return pro;
			}
		}
	}
		return null;
	}

}
