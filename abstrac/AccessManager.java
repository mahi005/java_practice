package abstrac;

public class AccessManager {
   static void controlAccess(Hotstar hs) {
	   if(hs!=null) {
		   hs.login();
		   hs.watch();
	   }
   }
}
