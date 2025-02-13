package abstrac;
abstract class Demo{
	abstract void test();
	abstract void disp();
}
class Sample extends Demo{
	@Override
	void test() {
		
	}
	@Override
	void disp() {
		
	}
}
public class Mainclass {
  public static void main(String[] args) {
	Demo ref = new Sample();
	ref.disp();
	ref.test();
}
}
