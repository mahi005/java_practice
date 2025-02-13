package pureabstraction;

interface Demo{
	void test();
	abstract void disp();
}
class Sample implements Demo{
	@Override
	public void test() {
		System.out.println("executing test()........");
	}
	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("executing disp()..........");
	}
}
public class Mainclass {
   public static void main(String[] args) {
	 Demo ref = new Sample();
	 ref.test();
	 ref.disp();
}
}
