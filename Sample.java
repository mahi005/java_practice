public class Sample {
    static int x;
    static char y;
    static double z;

    static{
        x= 24;
        y='m';
        z=5.6;
    }
    public static void main(String[] args) {
        System.out.println("program starts........");
        System.out.println(Sample.x);
        System.out.println(Sample.y);
        System.out.println(Sample.z);
        System.out.println("program ends................");
    }
}
