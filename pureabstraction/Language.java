package pureabstraction;

interface Language {
  void write();
}
class Kannada implements Language{
	@Override
	public void write() {
		System.out.println("Kannada");
	}
}
class Hindi implements Language{
	@Override
	public void write() {
		System.out.println("Hindi");
	}
}

class English implements Language{
	@Override
	public void write() {
		System.out.println("English");
	}
}
