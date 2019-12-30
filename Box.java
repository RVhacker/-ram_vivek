
public class Box {
// Developer View
	
	void area()
	{
		int i=10;
		int j=20;
		int a= i+j;
		System.out.println(a);
	}
	
	public Box()
	{
		int x=30;
		System.out.println("This is a custom constructor");
	}
	public Box(int i,int j)
	{
		int k=i+j;
		System.out.println(k);
	}
	// Compiler view
	/*   
	 * public Box()
	 * {
	 * 
	 * }
	  */
	
	public static void main(String[] args) {
		Box b=new Box();
	    b.area();
	    Box b1=new Box(2,5);
	}
}
