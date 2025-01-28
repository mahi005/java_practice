package Constructor.Chaining;
class  Delta{
	Delta(){
		this(10);
		System.out.println("Delta() Constructor");
	}
	Delta(int a){
		System.out.println("Delta(int) Constructor");
	}
}
class Example extends Delta{
	Example(){
		System.out.println("Example() constructor");
	}
	Example(int a){
		this();
		System.out.println("Example(int) constructor");
	}
}
public class Mainclass8 {
 public static void main(String[] args) {
	Example e1 = new Example(10);
}
}
