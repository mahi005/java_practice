package Constructor.Chaining;

class Hotel{
	Hotel(int a){
		System.out.println("Dominos");
	}
	Hotel(double d){
		this(12);
		System.out.println("Kfc");
	}
	Hotel(String s){
		this(4.5);
		System.out.println("McDonals");
	}
}
public class Mainclass1 {
   public static void main(String[] args) {
	Hotel h1 = new Hotel("ABC");
}
}
