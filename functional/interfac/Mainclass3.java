package functional.interfac;
@FunctionalInterface
interface Delta{
	void test();
}
class Example implements Delta{
	@Override
	public void test() {
		// TODO Auto-generated met
			System.out.println("executing()");
		}
		
	}

public class Mainclass3 {
 public static void main(String[] args) {
	Delta ref = new Example();
	ref.test();
	
	Delta obj = ()->{System.out.println("lambda");};
      obj.test();
}
}
