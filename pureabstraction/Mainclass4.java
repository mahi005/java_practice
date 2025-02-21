package pureabstraction;

public class Mainclass4 {
 public static void main(String[] args) {
	ShapeToolkit.drawshape(new Circle());
	ShapeToolkit.deleteshape(new Circle());
	
	ShapeToolkit.drawshape(new Square());
	ShapeToolkit.deleteshape(new Square());
	
	ShapeToolkit.drawshape(new Triangle());
	ShapeToolkit.deleteshape(new Triangle());
}
}
