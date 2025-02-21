package has.a.relationship;

class Account{
	void withdraw() {
		System.out.println("Withdraw from account");
	}
}
class Customer{
	Account acc= new Account();
	
}
class Bank{
	Customer cu = new Customer();
}
public class Mainclass5 {
 public static void main(String[] args) {
	Bank b = new Bank();
	b.cu.acc.withdraw();
}
}
