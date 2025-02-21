package has.a.relationship;

class Printer{
	void print() {
		System.out.println("print");
	}
}
class Computer{
	//Printer out =new Printer();
	static Printer out = new Printer();
}
public class Mainclass6 {
  public static void main(String[] args) {
	Computer.out.print();
}
}
