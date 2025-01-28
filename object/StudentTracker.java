package object;

import java.util.Scanner;

public class StudentTracker {
 static void displayStudentDetails(Student s) {
	 System.out.println("yop : " +s.yop);
	 System.out.println("cgpa : " +s.cgpa);
	 System.out.println("Mobile : " +s.mobile);
 }
 static Student createStudent() {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter yop");
	 int yop = sc.nextInt();
	 
	 System.out.println("Enter yop");
	 double cgpa = sc.nextDouble();
	 
	 System.out.println("Enter yop");
	 long mobile = sc.nextLong();
	 
	 Student s = new Student(yop,cgpa,mobile);
	 return s;
 }
}
