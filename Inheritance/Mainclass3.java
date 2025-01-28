package Inheritance;
class InstagramOld{
	void post() {
		System.out.println("Posting...........");
	}
}
class InstagramNew extends InstagramOld{
	void messenger() {
		System.out.println("Message-----");
	}
}
public class Mainclass3 {
  public static void main(String[] args) {
	InstagramOld i1 = new InstagramOld();
	i1.post();
	InstagramNew i2 = new InstagramNew();
	i2.post();
	i2.messenger();
}
}
