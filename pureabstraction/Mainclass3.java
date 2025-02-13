package pureabstraction;

interface Helper{
	void help();
}
interface Giver extends Helper{
	void give();
}
class Utility implements Giver{
	@Override
	public void give() {
		System.out.println("executing give().........");
	}
	@Override
	public void help() {
		System.out.println("executing help........");
	}
}
public class Mainclass3 {
  public static void main(String[] args) {
	Utility obj = new Utility();
	obj.help();
	obj.give();
}
}
