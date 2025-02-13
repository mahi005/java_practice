package staticMember;

public class Demo
  {
   static int a;
   static {
    a=10;
   }   

   public static void main(String[] args) {
    System.out.println("Program starts");
    System.out.println(Demo.a);
    System.out.println("program Ends");
   }
}
