package Inheritance;

class Alpha{
	void play() {
		System.out.println("Excuting play()..........");
	}
}
class Beta extends Alpha{
	void run() {
		System.out.println("executing run()......");
	}
}
public class MainClass2 {
   public static void main(String[] args) {
	Beta ref = new Beta();
	ref.play();
	ref.run();}
	
}
