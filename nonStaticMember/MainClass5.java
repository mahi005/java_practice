package nonStaticMember;

class Service{
    static char x ='m';
    double y = 1.44;
    void help(){
        System.out.println("help");
    }
    static void play(){
    System.out.println("play");
    }
}
public class MainClass5 {
    public static void main(String[] args) {
        Service obj = new Service();
        obj.help();
        System.out.println(obj.y);

        System.out.println(Service.x);
        Service.play();
    }
}
