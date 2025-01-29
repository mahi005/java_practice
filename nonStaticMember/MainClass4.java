package nonStaticMember;
class Utility{
    static int a= 100;
    int b = 200;

    static void test(){
       System.out.println("static method.......................");
    }
    void disp(){
    System.out.println("Npn-Static method.........................");
    }
}
public class MainClass4 {
    public static void main(String[] args) {
        Utility obj = new Utility();
        System.out.println(obj.b);
        obj.disp();
        System.out.println(Utility.a);
        Utility.test();
        //System.out.println(new Utility().b);
        //new Utility().disp();

    }
}
