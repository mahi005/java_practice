package encapsulation;

public class Account implements java.io.Serializable {
  private long accountNumber;
  private double accountBalanace;
public long getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}
public double getAccountBalanace() {
	return accountBalanace;
}
public void setAccountBalanace(double accountBalanace) {
	this.accountBalanace = accountBalanace;
}
  
}
