package staticMember;

class Demo{
    static int a = 100;
    static void test(){
        System.out.println("executing test()...................");
    }
    
}
public class MainClass {
     public static void main(String[] args) {
        System.out.println(Demo.a);
        Demo.test();
     }
}
