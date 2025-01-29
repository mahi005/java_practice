package nonStaticMember;

class Alpha{
    char x='m';
    boolean y=false;
    void push(){
        System.out.println("printing push method....................");
    }
    void pop(){
        System.out.println("printing pop method.........................");
    }
}
public class MainClass3 {
 public static void main(String[] args) {
    Alpha obj = new Alpha();
    System.out.println(obj.x);
    
    System.out.println(obj.y);
    obj.push();
    obj.pop();
    
 }   
}
