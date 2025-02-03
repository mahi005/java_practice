package instance.of.keyword;

public class Manager {
public static void assignWork(SoftwareEngineer e) {
	if(e!=null) {
		e.meeting();
		if(e instanceof Developer) {
			Developer d =(Developer)e;
			d.coding();
		}
		else if(e instanceof Tester) {
			Tester t = (Tester)e;
			t.testing();
		}
		
	}
}
}
