package pureabstraction;

class Alpha{
	void run() {
		System.out.println("executing run()......");
	}
}
interface Beta{
	void push();
}
class Gamma extends Alpha implements Beta{
	@Override
	public void push() {
		// TODO Auto-generated method stub
		System.out.println();
	}
}
public class Mainclass2 {
    public static void main(String[] args) {
    	Gamma ref = new Gamma();
        ref.run();
        ref.push();
	}
}
