package abstrac;
abstract class Alpha{
	abstract void play();
	void run() {
		System.out.println("executing run.............");
	}
}
class Beta extends Alpha{
	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("excuting play............");
		
	}
}
public class Mainclass2 {
     public static void main(String[] args) {
		Alpha obj = new Beta();
		obj.play();
		obj.run();
	}
}
