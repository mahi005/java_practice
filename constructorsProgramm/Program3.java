package constructorsProgramm;

class  Game {
   Game(int a,String s){
    System.out.println("BGMI");
   }
   Game(String s , int a){
    System.out.println("COD");
   }
    
}
public class Program3 {
    public static void main(String[] args) {
        Game g1=new Game("sdf", 9);
        Game g2 = new Game(10, "ghhj");
    }
}
