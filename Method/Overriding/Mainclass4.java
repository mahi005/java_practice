package Method.Overriding;

class WhatsApp1{
	void deliveryReport() {
		System.out.println("Sent");
	}
}

class WhatsApp2 extends WhatsApp1{
	@Override
	void deliveryReport() {
		System.out.println("sent-deliver");
	}
}

class WhatsApp3 extends WhatsApp2{
	@Override
	void deliveryReport() {
		System.out.println("sent-deliver-seen");
	}
}

public class Mainclass4 {
	public static void main(String[] args) {
		WhatsApp1 w1;
		w1 = new WhatsApp1();
		w1.deliveryReport();
		
		w1 = new WhatsApp2();
		w1.deliveryReport();
		
		w1 = new WhatsApp3();
		w1.deliveryReport();
	}
}
