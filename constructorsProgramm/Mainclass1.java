class Demo {
   int val;
   double d;
   String s;
   void test(){
    System.out.println("executing..................");
   }    
}
public class Mainclass1{
  public static void main(String[] args) {
   Demo ref =  new Demo();
   System.out.println(ref.val);
   System.out.println(ref.d);
   System.out.println(ref.s);
   ref.test();
  }   
}
