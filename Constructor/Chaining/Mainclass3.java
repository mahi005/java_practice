package Constructor.Chaining;


class Car{
	Car(int a){
		System.out.println("Basic Variant");
	}
	Car(double d){
		this(1);
		System.out.println("Mid Variant");
	}
	Car(String s){
		this(7.8);
		System.out.println("Top Variant");
	}
}
public class Mainclass3 {
  public static void main(String[] args) {
	
	Car c2 = new Car("abc");
}
}
