package abstrac;
abstract class Delta{
	void send() {
		System.out.println("Executing send().........");
	}
	void help() {
		System.out.println("executing help()...........");
	}
}
class Example extends Delta{
	
}
public class Mainclass3 {
 public static void main(String[] args) {
	Delta ref= new Example();
	ref.send();
	ref.help();
}
}
