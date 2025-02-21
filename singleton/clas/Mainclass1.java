package singleton.clas;

public class Mainclass1 {
 public static void main(String[] args) {
	Connection c1=Connection.getConnection();
	Connection c2= Connection.getConnection();
	System.out.println(c1);
	System.out.println(c2);
}
}
