package Method.Overriding;

class Parent{
	void marriage() {
		System.out.println("Arranged Marriage");
	}
}

class Child extends Parent{
	@Override
	void marriage() {
		System.out.println("Love Marriage");
	}
}

class Lesbo extends Parent{
	@Override
	void marriage() {
		System.out.println("girl to girl marriage");
	}
}

public class Mainclass2 {
public static void main(String[] args) {
	Parent p= new Parent();
	p.marriage();
	Child c=new Child();
	c.marriage();
	Lesbo g = new Lesbo();
	g.marriage();
	Parent ref = new Child();
	ref.marriage();
	Parent gp = new Lesbo();
	gp.marriage();
}
}
