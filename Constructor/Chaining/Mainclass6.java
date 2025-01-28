package Constructor.Chaining;
// implicitily is calling the constructor----------------------------
class Alpha{
	int a;
	Alpha()
	{
		a=100;
	}
}
class Beta extends Alpha{
	int b;
	Beta(){
		b=200;
	}
}
public class Mainclass6 {
   public static void main(String[] args) {
	Beta ref = new Beta();
	System.out.println(ref.a);
	System.out.println(ref.b);
}
}
