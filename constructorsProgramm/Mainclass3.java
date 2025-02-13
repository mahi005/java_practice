package constructorsProgramm;

class Alpha{
    int x;
    double y;
    char z;
    Alpha(){
        x=100;
        y=3.77;
        z='M';
    }
}

public class Mainclass3 {
    public static void main(String[] args) {
        Alpha a1 = new Alpha();
        System.out.println(a1.x); 
        System.out.println(a1.y);
        System.out.println(a1.z);
    }

}
