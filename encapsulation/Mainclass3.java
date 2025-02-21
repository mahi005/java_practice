package encapsulation;

public class Mainclass3 {
public static void main(String[] args) {
	Credentials c1=new Credentials();
	c1.setPassword("ertyug");
	c1.setUsername("mahi");
	System.out.println(c1.getPassword());
	System.out.println(c1.getUsername());
}
}
