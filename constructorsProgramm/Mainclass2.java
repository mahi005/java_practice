package constructorsProgramm;

class Sample{
    int num;
    void play(){
        System.out.println("executing....................");
    }
    Sample(){
        System.out.println("sample() constructor.....");
        num=23;
    }
}

public class Mainclass2 {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        System.out.println(s1.num);
        s1.play();
    }
}
