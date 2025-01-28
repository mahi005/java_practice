package object;

public class MainClass4 {
 public static void main(String[] args) {
	Account a1= Bank.createAccount();
	Bank.displayAccountDetail(a1);
	
	Account a2= Bank.createAccount();
	Bank.displayAccountDetail(a2);
	
	Account a3= Bank.createAccount();
	Bank.displayAccountDetail(a3);
}
}
