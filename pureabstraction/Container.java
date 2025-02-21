package pureabstraction;

public interface Container {
 void state();
}
class Bottle implements Container{
	@Override
	public void state() {
		System.out.println("state liquid");
	}
}
class Box implements Container{
	@Override
	public void state() {
		System.out.println("state solid");
	}
}
class Bag implements Container{
	@Override
	public void state() {
		System.out.println("items");
	}
}
