package Constructor.Chaining;

class City{
	City(int a){
		System.out.println("Banglore");
	}
	City(int a,double b){
		this(a);
		System.out.println("Delhi");
	}
	City(int a,double b,boolean c){
		this(a,b);
		System.out.println("Hyderabad");
	}
}
public class Mainclass2 {
	public static void main(String[] args) {

		  City c1 = new City(1,9.5,true);
	}
}
