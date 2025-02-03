package downcasting.program;

public class Main {
public static void main(String[] args) {
	Downcasting d1=new C();
	d1.test();
	
	B b1=(B) d1 ;
	b1.test();
	b1.disp();
	
	C c1=(C) b1;
	c1.play();
	
}
}
