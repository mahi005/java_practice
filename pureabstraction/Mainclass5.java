package pureabstraction;

public class Mainclass5 {
  public static void main(String[] args) {
	Kannada k = new Kannada();
	Hindi h= new Hindi();
	English e= new English();
	
	GoogleTranslator.translate(k, e);
	GoogleTranslator.translate(h, e);
	GoogleTranslator.translate(e, k);
	
}
}
