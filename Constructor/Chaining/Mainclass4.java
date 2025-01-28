package Constructor.Chaining;

class Student{
	Student(){
		System.out.println("Code To Intialize Personal Information");
		System.out.println("Code To Intialize Academic Information");
	}
	Student(int a){
		 this();
		 System.out.println("Code To Intialize Experience Information");
	}
}
public class Mainclass4 {
public static void main(String[] args) {
	Student s1 = new Student(9);
}

}
