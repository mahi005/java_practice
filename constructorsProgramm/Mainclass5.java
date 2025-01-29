class Product{
    int pid;
    double price;
    Product(int arg1, double arg2){
        pid=arg1;
        price=arg2;
    }
}
public class Mainclass5 {
    public static void main(String[] args) {
        Product p1 = new Product(230,34.88);
        System.out.println(p1.pid);
        System.out.println(p1.price);

        Product p2 = new Product(430,554.88);
        System.out.println(p2.pid);
        System.out.println(p2.price);

        Product p3 = new Product(980,784.88);
        System.out.println(p3.pid);
        System.out.println(p3.price);
    }
}
