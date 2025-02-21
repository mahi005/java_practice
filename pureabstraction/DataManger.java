package pureabstraction;

public class DataManger {
  static void registerDriver(Driver ref) {
	  if(ref!=null) {
		  ref.register();
	  }
  }
}
