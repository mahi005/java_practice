package overloading;
class Flipkart{
	void payment() {
		System.out.println("cod");
	}
	void payment(long card) {
		System.out.println("10% discount");
	}
	void payment(String upi) {
		System.out.println("Assured 5% Cashback for UPI");
	}
}
public class Mainclass1 {
  public static void main(String[] args) {
	 Flipkart f1 = new Flipkart();
	 f1.payment();
	 f1.payment(2345678L);
	 f1.payment("cash");
}
}
