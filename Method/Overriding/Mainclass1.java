package Method.Overriding;

class Demo{
	void play(){
	System.out.println("PUBG");
	}
}

class Sample extends Demo{
	@Override
	void play() {
		System.out.println("BGMI");
	}
}

public class Mainclass1 {
public static void main(String[] args) {
	Demo ref = new Demo();
	ref.play();
	Sample obj = new Sample();
	obj.play();
	Demo dem = new Sample();
	dem.play();
}
}
