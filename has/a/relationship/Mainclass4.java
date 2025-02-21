package has.a.relationship;

class Department{
	void teach() {
		System.out.println("teaching subjects");
	}
}
class Student {
	void learn() {
		System.out.println("learning subject");
	}
}
class Colleage{
	Department dept = new Department();
	Student st= new Student();
}
public class Mainclass4 {
   public static void main(String[] args) {
	Colleage col= new Colleage();
	col.dept.teach();
	col.st.learn();
}
}
