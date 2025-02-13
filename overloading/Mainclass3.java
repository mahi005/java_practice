package overloading;
class TestScript{
	void Test(int a) {
		System.out.println("sanity Testing");
	}
	void Test(double d) {
		System.out.println("Ad Hoc Testing");
	}
	void Test(String s) {
		System.out.println("Regression Testing");
	}
}
public class Mainclass3 {
  public static void main(String[] args) {
	TestScript t= new TestScript();
	t.Test(1);
	t.Test(1.8);
	t.Test("asd");
}
}
