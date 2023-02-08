package com.pms.client;

import java.util.Scanner;

import com.pms.details.ProductDetails;

public class ProductClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("--------------------------------------------------------");
			System.out.println("          1)Product                                     ");

			System.out.println("          2)Exit                                     ");

			System.out.println("--------------------------------------------------------");
			System.out.println("Enter The Choice");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
					ProductDetails details = new ProductDetails();
					System.out.println("Enter UserName");
					String uname=sc.next();
					System.out.println("Enter PassWord");
					String pass=sc.next();
					if(uname.equals("Admin")&&pass.equals("Admin@123"))
					details.productMenu();
					else
						System.out.println("InValid User");
					break;
				case 2:
					System.out.println("Thx for Using App !");
					System.exit(0);
				default:
					System.out.println("Choose 1 to 2 Between");
			}

		}
	}

}
