package Inheritance;
class Script1{
	void executeTest() {
		System.out.println("test");
	}
}
class Script2 extends Script1{
	void generate() {
		System.out.println("generate");
	}
}
public class Mainclass5 {
 public static void main(String[] args) {
	Script1 s1 = new Script1();
	s1.executeTest();
	Script2 s2 = new Script2();
	s2.executeTest();
	s2.generate();
}
}
