package staticMember;

class sample2{
    static double p = 6.889;
    static boolean j =false;

    static void run(){
        System.out.println("run.............");
    }
    static void help(){
        System.out.println("help...................");
    }
}
public class MainClass3 {
    public static void main(String[] args) {
        System.out.println(sample2.p);
        System.out.println(sample2.j);
        sample2.run();
        sample2.help();
    }
}
