package pureabstraction;

interface Driver {
  void register();
}

class ChromeDriver implements Driver{
	@Override
	public void register() {
		System.out.println("chrome driver");
	}
}
class FirefoxDriver implements Driver{
	@Override
	public void register() {
		System.out.println("Firefox driver");
	}
}
class Edge implements Driver{
	@Override
	public void register() {
		System.out.println("Edge driver");
	}
}
