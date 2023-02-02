package com.pms.details;

import java.util.Scanner;

import com.pms.dao.impl.ProductDaoImpl;
import com.pms.pojo.Product;

public class ProductDetails {

	Scanner sc=new Scanner(System.in);
	ProductDaoImpl daoImpl=new ProductDaoImpl();
	public void productMenu() {
		while(true) {
		System.out.println("--------------------------------------------------");
		System.out.println("-            1) Add Product                      -");
		System.out.println("-            2) View All Product                 -");
		System.out.println("-            1) View Product                     -");
		System.out.println("-            1) Back                             -");
		System.out.println("--------------------------------------------------");
		System.out.println("Enter The Choice");
		int choice=sc.nextInt();
		switch(choice) {
			case 1:
				daoImpl.addProducts();
				productMenu();
				break;
			case 2:
				Product[] viewAllProducts=daoImpl.viewAllProducts();
				if(viewAllProducts!=null) {
					for(Product p :viewAllProducts) {
						if(p!=null) {
							System.out.println("Stock is Empty");
						}
						
					}
					
				}
				else
					System.out.println("Stock is Empty");
				productMenu();
				break;
			case 3:
				
				productMenu();
			case 4:	
		}

		}

	}
}
