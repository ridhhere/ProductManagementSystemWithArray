package com.pms.client;

import java.util.Scanner;

import com.pms.details.ProductDetails;

public class ProductClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------------------");
		System.out.println("-            1) Product                  -");
		System.out.println("-            2) Exit                     -");
		System.out.println("------------------------------------------");
		System.out.println("Enter The Choice");
		int choice=sc.nextInt();
		switch(choice) {
			case 1:
				ProductDetails details= new ProductDetails();
				System.out.println("Enter Username : ");
				String user=sc.next();
				System.out.println("Enter Password : ");
				String pass=sc.next();
				//check username & password
				if(user.equals("Admin")&&pass.equals("Admin123")) {
					System.out.println("Login Sucessful");
					details.productMenu();
				}
				else {
					System.out.println("Incorrect Password!!");
				}
				break;
			case 2:
				System.exit(0);
				System.out.println("Thanks for Using the App");
			default:
				System.out.println("Choose 1 to 2 Between");
		}
	}

}
