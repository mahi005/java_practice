package constructorsProgramm;

class City{
    City(int a)
    {
        System.out.println("New york");
    }
    City(int a, int b){
        System.out.println("London");
    }
    City(int a, int b, int c)
    {
        System.out.println("Paris");
    }
}
public class Profram2 {
    public static void main(String[] args) {
        City c1 = new City(34);
        City c2 = new City(56, 05);
        City c3 = new City(4, 7, 8);
    }
}
