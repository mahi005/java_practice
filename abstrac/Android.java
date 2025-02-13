package abstrac;

abstract class Android {
   void service() {
	   
   }
   abstract void ui();
}

class Samsuang extends Android{
	@Override
	void ui(){
		System.out.println("GalaxyOs");
	}
}
class Vivo extends Android{
	@Override
	void ui() {
		System.out.println("Function os");
	}
}
class Oppo extends Android{
	@Override
	void ui() {
		System.out.println("color os");
	}
}
