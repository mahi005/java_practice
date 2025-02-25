package example1;
class Student{
	String name;
	int regno;
	double cgpa;
	Student(String name, int regno,double cgpa){
		this.name=name;
		this.regno=regno;
		this.cgpa=cgpa;
	}
}
public class Mainclass6 {
 public static void main(String[] args) {
	Student s1 = new Student("rama",2345,8.0);
	System.out.println(s1.toString());
	System.out.println(s1.hashCode());
	
	Student s2 = new Student("krishna",2785,8.2);
	System.out.println(s2.toString());
	System.out.println(s2.hashCode());
	System.out.println(s1.equals(s2));
}
}
