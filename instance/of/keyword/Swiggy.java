package instance.of.keyword;

public class Swiggy {
  static void addItem(Food f) {
	  if(f!=null) {
		 f.food();
		 if(f instanceof Briyani) {
				Briyani b =(Briyani)f;
				b.foodBiryani();
			}
			else if(f instanceof MaslaDosa) {
				MaslaDosa m = (MaslaDosa)f;
				m.foodDosa();
			}
			else if(f instanceof PavBhaji) {
				PavBhaji p = (PavBhaji)f;
				p.foodBhaji();
			}
	  }
  }
}

