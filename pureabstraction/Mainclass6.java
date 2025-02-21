package pureabstraction;

public class Mainclass6 {
 public static void main(String[] args) {
	 DataManger.registerDriver(new ChromeDriver());
	 DataManger.registerDriver(new FirefoxDriver());
	 DataManger.registerDriver(new Edge());
}
}
