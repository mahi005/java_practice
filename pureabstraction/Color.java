package pureabstraction;

public interface Color {
 void file();
}
class Red implements Color{
	@Override
	public void file() {
		System.out.println("color red");
	}
}
class Blue implements Color{
	@Override
	public void file() {
		System.out.println("color Blue");
	}
}
class Green implements Color{
	@Override
	public void file() {
		System.out.println("color Green");
	}
}
