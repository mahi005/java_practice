package encapsulation;

public class Mainclass2 {
public static void main(String[] args) {
	Account a1= new Account();
	a1.setAccountBalanace(1000000);
	a1.setAccountNumber(2345678678L);
	System.out.println(a1.getAccountBalanace());
	System.out.println(a1.getAccountNumber());
	
	Account a2= new Account();
	a2.setAccountBalanace(100000000);
	a1.setAccountNumber(2345678679L);
	System.out.println(a2.getAccountBalanace());
	System.out.println(a2.getAccountNumber());
}
}
