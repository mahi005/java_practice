package instance.of.keyword;

public class Mainclass {
 public static void main(String[] args) {
	Developer dev = new Developer();
	Manager.assignWork(dev);
	
	Tester qa = new Tester();
	Manager.assignWork(qa);
}
}
