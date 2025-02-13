package Method.Overriding;

class Scriptv1{
	void execute(){
		System.out.println("execute scenorios");
	}
}
class Scriptv2 extends Scriptv1{
	void execute(){
		System.out.println("execute automation");
	}
}
public class Mainclass6 {
 public static void main(String[] args) {
	Scriptv1 v1= new Scriptv1();
	v1.execute();
	
	Scriptv2 v2= new Scriptv2();
	v2.execute();
   
	Scriptv1 v12= new Scriptv2();
	v12.execute();

}
}
