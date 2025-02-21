package pureabstraction;

public interface Shape {
  void draw();
  void delete();
}
class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("Drawing circle");
	}
	public void delete() {
		System.out.println("deleted drawing");
	}
}
class Square implements Shape{
	@Override
	public void delete() {
		System.out.println("deleted drawing");
	}
	public void draw() {
		System.out.println("drawing square");
	}
}
class Triangle implements Shape{
	@Override
	public void draw() {
		System.out.println("drawing trinagle");
	}
	public void delete() {
		System.out.println("deleted drawing");
	}
}
