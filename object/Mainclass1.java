package object;

import java.util.Scanner;

class Briyani
{
	double price;
	String type;
	
	Briyani(double price, String type){
		this.price=price;
		this.type= type;
	}
}
class BriyaniHelper{
	static void displayBiriyani(Briyani b) {
		System.out.print("Price : " + b.price);
		System.out.println("Type : " + b.type);
	}
	static Briyani createBriyani() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter price");
		double price = sc.nextDouble();
		System.out.println("enter type");
		String type= sc.next();
		Briyani b = new Briyani(price, type);
		return b;
	}
}

public class Mainclass1 {
   public static void main(String[] args) {
	 Briyani b1 = BriyaniHelper.createBriyani();
	 BriyaniHelper.displayBiriyani(b1);
	 
	 Briyani b2 = BriyaniHelper.createBriyani();
	 BriyaniHelper.displayBiriyani(b2);
	 
	 Briyani b3 = BriyaniHelper.createBriyani();
	 BriyaniHelper.displayBiriyani(b3);
}
}
