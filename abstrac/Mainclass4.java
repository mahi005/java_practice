package abstrac;

public class Mainclass4 {
  public static void main(String[] args) {
    AccessManager.controlAccess(new HotstarFree());
    AccessManager.controlAccess(new HotstarVip());
    AccessManager.controlAccess(new HotstarPremium());
}
  
}
