package constructorsProgramm;

class Food{
    Food(int a)
    {
        System.out.println("Biriyani");
    }
    Food(double b)
    {
        System.out.println("Pasta");
    }
    Food(String s)
    {
        System.out.println("Momos");
    }
}
public class Program1 {
    public static void main(String[] args) {
        Food f1 = new Food(10);
        Food f2 = new Food(56.9);
        Food f3 = new Food("ABC"); 
    }
    
}
