public class Demo {
    int a;
    {
        a=133;
    }
    public static void main(String[] args) {
        Demo ref = new Demo();
        System.out.println(ref.a);
    }
}
