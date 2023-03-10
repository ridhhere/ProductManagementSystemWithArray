package com.pms.details;

import java.util.Scanner;

import com.pms.client.ProductClient;
import com.pms.dao.impl.ProductDaoImpl;
import com.pms.pojo.Product;

public class ProductDetails {

	Scanner sc = new Scanner(System.in);
	ProductDaoImpl daoImpl = new ProductDaoImpl();

	public void productMenu() {
		while (true) {
			System.out.println("----------------------------------------------");
			System.out.println("-           1)Add Product                    -");
			System.out.println("-           2)ViewAll Product                -");
			System.out.println("-           3)View Product                   -");
			System.out.println("-           4)Update Product                 -");
			System.out.println("-           5)Delete Product                 -");
			System.out.println("-           6)Back                           -");
			System.out.println("----------------------------------------------");
			System.out.println("Enter The Choice");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
					daoImpl.addProducts();
					productMenu();
					break;
				case 2:
					Product[] viewAllProducts = daoImpl.viewAllProducts();
					System.out.println("--------------------------------------------");
					System.out.println("  ProductId   ProductName   Price     Qty");
					System.out.println("--------------------------------------------");
					if (viewAllProducts != null) {
						for (Product p : viewAllProducts) {
							if (p != null)
								System.out.println(
										p.getPid() + "\t" + p.getPname() + "\t" + p.getPrice() + "\t" + p.getQty());
						}

					} // end of if
					else
						System.out.println("Stock is Empty");

					productMenu();
					break;
				case 3:
					System.out.println("Enter Product Id");
					Product p = daoImpl.viewProduct(sc.nextInt());
					System.out.println("--------------------------------------------");
					System.out.println("  ProductId   ProductName   Price     Qty");
					System.out.println("--------------------------------------------");

					if (p != null)
						System.out.println(p.getPid() + "\t" + p.getPname() + "\t" + p.getPrice() + "\t" + p.getQty());
					else
						System.out.println("Product is not Exist");

					productMenu();
					break;
				case 4:
					System.out.println("Enter Product Id");
					daoImpl.updateProduct(sc.nextInt());
					productMenu();

					break;
				case 5:
					System.out.println("Enter Product Id");
					boolean flag = daoImpl.deleteProduct(sc.nextInt());
					if(flag)
						System.out.println("Given Id is Deleted SuccessFully");
					else
						System.out.println("Given Id is Not Exist");
					productMenu();
					
					
				case 6:
					ProductClient.main(null);
				default:
					System.out.println("Choose 1 to 4 Between");
			}

		} // end of while

	}// end of menu

}
