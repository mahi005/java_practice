package example1;
class Mobile{
	long imr=234534567L;
	@Override
	public boolean equals(Object obj) {
		Mobile m=(Mobile)obj;
		if(this.imr == m.imr) {
			return true;
		}else {
			return false;
		}
	}
}
public class Mainclass4 {
 public static void main(String[] args) {
	Mobile m1 =new Mobile();
	Mobile m2 = new Mobile();
	System.out.println(m1.equals(m2));
}
}
