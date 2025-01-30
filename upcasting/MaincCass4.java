package upcasting;

public class MaincCass4 {
  public static void main(String[] args) {
	  Television tv = new Television();
	  FlipKart.addToCart(tv);
	  
	  Laptop lap = new Laptop();
	  FlipKart.addToCart(lap);
	  
	  Mobile mob = new Mobile();
	  FlipKart.addToCart(mob);
  }
}
