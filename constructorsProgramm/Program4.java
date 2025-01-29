class Amazon{
    Amazon()
    {
        System.out.println("only for shopping");
    }
    Amazon(double subscriptionfees)
    {
        System.out.println("For shopping,video,music");
    }
}
public class Program4 {
    public static void main(String[] args) {
        Amazon a1 = new Amazon();
        Amazon a2 = new Amazon(1266.0 );
    }
}
