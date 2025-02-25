package example1;
class CreditCard{
	private long cardNumber=1234567898765L;
	private int pin=1234;
	@Override
	public boolean equals(Object obj) {
		CreditCard c= (CreditCard)obj;
		if(this.cardNumber==c.cardNumber && this.pin==c.pin) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class Mainclass5 {
 public static void main(String[] args) {
	CreditCard c1 = new CreditCard();
	CreditCard c2 = new CreditCard();
	
	System.out.println(c1==c2);
	System.out.println(c1.equals(c2));
	
}
}
