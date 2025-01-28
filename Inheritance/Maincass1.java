package Inheritance;
class Demo{
	int a=10;
	void test() {
		System.out.println("Executing Test()..............");
	}
}
class Sample extends Demo{
	
}
public class Maincass1 {
   public static void main(String[] args) {
	Sample ref = new Sample();
	System.out.println(ref.a);
	ref.test();
}
}
