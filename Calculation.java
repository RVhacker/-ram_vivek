
public class Calculation {

	void sum()
	{
		int a=10; int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	void sum(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	void sum(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
		
	}
	
	void sum(String b,int a)
	{
		String c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Calculation c=new Calculation();
		c.sum();
		c.sum(2, 4);
		c.sum("Vivek", 5);
		c.sum(1, 3, 5);
		
	}
}
