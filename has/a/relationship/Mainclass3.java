package has.a.relationship;

class Camera{
	void takePhoto() {
		System.out.println("Using camera for photos");
	}
}
class SimCard{
	void call() {
		System.out.println("calling with Simcard");
	}
}
class Mobile{
	Camera cam = new Camera();
	SimCard sim = new SimCard();
}
public class Mainclass3 {
public static void main(String[] args) {
	Mobile mob = new Mobile();
	mob.cam.takePhoto();
	mob.sim.call();
}
}
