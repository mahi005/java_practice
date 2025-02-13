package Method.Overriding;

class FaceBookOld{
	void reaction() {
		System.out.println("Like");
	}
}

class FaceBookNew extends FaceBookOld{
	@Override
	void reaction() {
		System.out.println("Like, love, sad, angry, care....");
	}
}

public class Mainclass3 {
	public static void main(String[] args) {
		FaceBookOld fbold = new FaceBookOld();
		fbold.reaction();
		FaceBookNew fbNew = new FaceBookNew();
		fbNew.reaction();
		FaceBookOld fb = new FaceBookNew();
		fb.reaction();
	}
}
