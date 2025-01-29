class Student{
    Student(){
        System.out.println("personal Details");
        System.out.println("Academic Details");
    }
    Student( boolean b){
        System.out.println("personal Details");
        System.out.println("Academic Details");
        System.out.println("Work Details");
    }
}
public class Programm5 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(true);
    }
}
