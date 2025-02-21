package pureabstraction;

public class ShapeToolkit {
 static void drawshape(Shape s) {
	 if(s!=null) {
		 s.draw();
	 }
 }
 static void deleteshape(Shape s) {
	 if(s!=null) {
		 s.delete();
	 }
 }
}
