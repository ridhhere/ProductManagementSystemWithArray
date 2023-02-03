package com.pms.dao.impl;

import java.util.Scanner;

import com.pms.pojo.Product;

public class ProductDaoImpl {
	
	Scanner sc=new Scanner(System.in);
	Product ProductInfo[]=null;//array of product
	public void addProducts() {
		System.out.println("How Many Products Do You Want to Add");
		int size=sc.nextInt();
		ProductInfo=new Product[size];//initializing array with size

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
		return ProductInfo;
	}
	
	public Product viewProduct(int pid){
		if(ProductInfo!=null){
		for(Product pro : ProductInfo){
			if(pro!=null){
			if(pro.getPid()==pid){
				return pro;
			}
			}//end of if
		}
		}//end of if
		return null;
	}//end of view Product
	
	boolean delete(int pid) {
		boolean flag = false;
		int k = 0;
		if (ProductInfo != null) {
			for (Product pro : ProductInfo) {
				if (pro.getPid() == pid) {
					ProductInfo[k] = null;//just making array value as null since we cannot delete
					flag = true;
					++k;
					break;
				} else {
					++k;
				}
			}//end of for
		}//end of if
		return flag;
	}
	
	void updateEmployee(int pid) {
		if (ProductInfo != null) {
			for (Product pro : ProductInfo) {
				if (pro.getPid() == pid) {
					System.out.println("Do You Want To Update 1) Pname 2) Qty 3)Price");
					System.out.println("Enter The Choice");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						System.out.println("Enter The Product Name");
						String pname = sc.next();
						pro.setPname(pname);// update product
						System.out.println("Product Name Update Successfully");
						break;
					case 2:
						System.out.println("Enter The Product Quantity");
						int qty = sc.nextInt();
						pro.setQty(qty);// update product
						System.out.println("Product Qty Update Successfully");
						break;
					case 3:
						System.out.println("Enter The Product Price");
						int price = sc.nextInt();
						pro.setPrice(price);// update product
						System.out.println("Product Price Update Successfully");
						break;
					default:
						System.out.println("Choose Between 1 to 3");

					}
				}//end if
			} //end for
		}//end if
	}

}
