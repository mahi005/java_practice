package staticMember;
class sample{
    static int a= 34;
    static char c ='M';

    static void play(){
        System.out.println("play");
    }
    static void disp(){
        System.out.println("disp");
    }
}

public class MainClass2 {
    public static void main(String[] args) {
        System.out.println(sample.a);
        System.out.println(sample.c);
        sample.play();
        sample.disp();
    }
}
