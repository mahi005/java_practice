package addon.interfac;
interface Alpha{
	default void play() {
		System.out.println("execute..............");
	}
}
class Beta implements Alpha{
	
}
public class Mainclass2 {
public static void main(String[] args) {
	Alpha ref=new Beta();
	ref.play();
}
}
