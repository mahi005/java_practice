package object;

import java.util.Scanner;

public class Bank {
 static void displayAccountDetail(Account a) {
	 System.out.println("Account Number " +a.accountNumber);
	 System.out.println("Account Balance " +a.accountBalance);
 }
 static Account createAccount() {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter account Number");
	 long accountNumber = sc.nextLong();
	 System.out.println("Enter Account Balance");
	 double accountBalance = sc.nextDouble();
	 
	 Account a = new Account(accountNumber, accountBalance);
	 return a;
	 
 }
}
