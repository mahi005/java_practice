/*public class Demo {
   // static public void main(String[] args) {
    public static void main(String[] args) {
   //public static void main(String args[]) {
   //public static void main(string []arg) {}

   //------------------we can do these changes in main method-------------------------------------------

        System.out.println("change in main method");
   }    
}

//----------------------------------------------------
  class Demo {

    public static void main(String[] args) {
        System.out.println("Length : " +args.length);
        for(int i=0; i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
    */

class Demo {
 static void add(int... a){
    int sum = 0;
    for(int i=0; i<a.length;i++){
        sum=sum + a[i];
    }
    System.out.println(sum);
 }    
        
 public static void main(String[] args) {
    Demo.add(2,3);
    Demo.add(3,5,66);
    Demo.add(3,5,66,33);
 }
    }