package upcasting;


public class FlipKart {
  static void addToCart(Product p) {
	  if(p!=null) {
		  if(p instanceof Mobile) {
			  System.out.println("Mobile Added");
		  }
		  else if(p instanceof Television) {
			  System.out.println("Television Added");
		  }
		  else if(p instanceof Laptop) {
			  System.out.println("Laptop Added");
		  }
	
  }
}
}