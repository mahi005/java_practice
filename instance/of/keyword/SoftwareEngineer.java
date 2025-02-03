package instance.of.keyword;

public class SoftwareEngineer {
  void meeting() {
	  System.out.println("Engineer in Meeting");
  }
}
class Developer extends SoftwareEngineer{
	void coding() {
		System.out.println("Developer is coding");
	}
}
class Tester extends SoftwareEngineer{
	void testing() {
		System.out.println("Tester is testing");
	}
}
