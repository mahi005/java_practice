package abstrac;
abstract class Hotstar {
  void login() {
	  System.out.println("login success");
  }
  abstract void watch();
}
class HotstarFree extends Hotstar{
	@Override
	void watch() {
		System.out.println("Ad+Trailer");
	}
}
class HotstarVip extends Hotstar{
	@Override
	void watch() {
		System.out.println("Ad+Regional");
	}
}
class HotstarPremium extends Hotstar{
	@Override
	void watch() {
		System.out.println("All content Acess");
	}
}
