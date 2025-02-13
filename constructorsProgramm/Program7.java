package constructorsProgramm;

class TestScript{
    TestScript()
    {
        System.out.println("Test Execution");
    }
    TestScript(double d)
    {
        System.out.println("Test Execution");
        System.out.println("Test Reports");
    }
}
public class Program7 {
    public static void main(String[] args) {
        TestScript s1= new TestScript();
        TestScript s2 = new TestScript(6.7);
    }
}
