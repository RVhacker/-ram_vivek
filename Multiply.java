
public class Multiply {
  
	void multiply(int a,int b)
	{
		int c=a*b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Multiply m1 = new Multiply();
		m1.multiply(1,3);
		
		Multiply m2 = new Multiply();
		m2.multiply(3,3);
	}
}
