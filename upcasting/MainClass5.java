package upcasting;////

public class MainClass5 {
 public static void main(String[] args) {
	Mango m = new Mango();
	BigBasket.addToBasket(m);
	
	Apple a = new Apple();
	BigBasket.addToBasket(a);
	
	Banana b = new Banana();
	BigBasket.addToBasket(b);
}
 
}
