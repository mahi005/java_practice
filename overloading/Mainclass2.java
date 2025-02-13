package overloading;

class IRctc{
	void search(String src, String des) {
		System.out.println("Route Detail");
	}
	void search(int trainNumber) {
		System.out.println("Train Detail");
	}
	void search(String pnr) {
		System.out.println("Ticket Detail");
	}
}
public class Mainclass2 {
  public static void main(String[] args) {
	IRctc i1 = new IRctc();
	i1.search("ksr","mar");
	i1.search(12345);
	i1.search("123tyu");
 }
}
