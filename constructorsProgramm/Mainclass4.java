package constructorsProgramm;

class Container{
    int capacity;
    Container(int arg){
        capacity = arg;
    }
}

public class Mainclass4 {
  public static void main(String[] args) {
    Container c1 = new Container(250);
    System.out.println(c1.capacity);
    Container c2 = new Container(300);
    System.out.println(c2.capacity);
    Container c3 = new Container(390);
    System.out.println(c2.capacity);
  }   
}
