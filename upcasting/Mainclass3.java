package upcasting;

class Delta{
	void help() {
		System.out.println("executing help()......");
	}
}
class Example extends Delta{
	void send() {
		System.out.println("executing send().......");
	}
}
public class Mainclass3 {
   public static void main(String[] args) {
	Delta ref= new Example();//upcasting.............................
	ref.help();
	
}
}
