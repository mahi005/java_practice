package has.a.relationship;


class Demo{
	void test() {
		System.out.println("Executing-------------");
	}
}
class Sample{
	Demo d=new Demo();
}
public class Mainclass1 {
public static void main(String[] args) {
	Sample s=new Sample();
	s.d.test();
}
}
