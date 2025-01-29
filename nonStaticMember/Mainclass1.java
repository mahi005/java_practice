package nonStaticMember;
class Delta{
    int a= 10;
    void test(){
       System.out.println("executing.....................");
    }
}

public class Mainclass1 {
    public static void main(String[] args) {
        System.out.println(new Delta().a);
        new Delta().test();
    }
}
