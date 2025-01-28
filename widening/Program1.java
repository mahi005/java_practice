package widening;

public class Program1 {
  public static void main(String[] args) {
	int a = 10;
	double d = a;//WIDENING: int -----------> double
	System.out.println(d);
	
	char c='A';
	int x= c;//WIDENING : char------------>int
	System.out.println(x);
	
	float p=12.5f;
	double q=p; //WIDENING : float--------------->double
	System.out.println(q);
}
}
