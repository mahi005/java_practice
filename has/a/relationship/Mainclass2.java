package has.a.relationship;

class Engine{
	void power() {
		System.out.println("Engine provide Power");
	}
}
class Driver{
	void driver() {
		System.out.println("Driver is driving");
	}
}
class Car{
	Engine eng= new Engine();//Composition
	
	Driver dr= new Driver(); //Aggregation
}
public class Mainclass2 {
  public static void main(String[] args) {
	Car c= new Car();
	c.eng.power();
	c.dr.driver();
}
}
