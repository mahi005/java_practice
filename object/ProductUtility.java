package object;

import java.util.Scanner;

public class ProductUtility {
 static void displayProductInfo(Product p) {
	 System.out.println("product ID : " +p.pid);
	 System.out.println("product Price : " +p.price);
 }
 static Product createProduct()
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter product Id");
	 int pid = sc.nextInt();
	 System.out.println("Enter product price");
	 double price= sc.nextDouble();
	 Product p = new Product(pid ,price);
	 return p;
 }
}
