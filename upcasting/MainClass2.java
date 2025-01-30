package upcasting;

class Alpha{
	int x=0;
	void Test() {
		System.out.println("executing test().....");
	}
}
class Beta extends Alpha{
	int y = 20;
	void disp() {
		System.out.println("executing disp().....");
	}
}
public class MainClass2 {
      public static void main(String[] args) {
		Beta b = new Beta();
		System.out.println(b.x);
		b.Test();
		System.out.println(b.y);
		b.disp();
		
		Alpha a = b;  // upcasting.......................
		System.out.println(a.x);
		a.Test();
	}
}
