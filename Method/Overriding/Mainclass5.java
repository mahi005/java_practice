package Method.Overriding;

class Windows10{
	void startmenu() {
		System.out.println("List view");
	}
}

class Windows11 extends Windows10{
	@Override
	void startmenu() {
		System.out.println("Floating Window");
	}
}

public class Mainclass5 {
	public static void main(String[] args) {
		Windows10 win10 = new Windows10();
		win10.startmenu();
		Windows11 win11 = new Windows11();
		win11.startmenu();
	}
}
