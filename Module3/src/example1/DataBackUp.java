package example1;

public class DataBackUp implements Cloneable {
   int size;
   public static void main(String[] args) throws CloneNotSupportedException {
	DataBackUp obj = new DataBackUp();
	obj.size=127;
	 DataBackUp copy =(DataBackUp)obj.clone();
	 System.out.println(copy.size);
}
}
