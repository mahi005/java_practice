class Student {
    String name;
    long mobile;
    void write(){
        System.out.println(name +"is writting");
    }
    void listen(){
     System.out.println(mobile + "is listening");
    }
}

public class Mainclass1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Rama";
         s1.mobile=6754321890L;
         s1.write();
         s1.listen();
    }
}
