package abstrac;

public class SmartPhone {
   static void load(Android a) {
	   if(a!=null) {
		   a.service();
		   a.ui();
	   }
   }
}
