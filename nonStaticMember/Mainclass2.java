package nonStaticMember;

class Beta{
    int a=100;
    double q= 1.9;
    void main(){
        System.out.println("executing................");
    }
}
public class Mainclass2 {
    public static void main(String[] args) {
        Beta obj = new Beta();
        System.out.println(obj.a);
        System.out.println(obj.q);
        obj.main();
    }
}
