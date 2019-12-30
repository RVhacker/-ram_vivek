
public class Addition1 {

	int a;
	int b;
	void show()
	{
		System.out.println(this.a+this.b);
	}
	void add(int a,int b)
	{
	this.a=a;
	this.b=b;
	System.out.println(a+" "+b);
	System.out.println(this.a+this.b);
	}

	public static void main(String[] args) {
		
		Addition1 a=new Addition1();
		
		a.show();
		a.add(1, 7);
		
		
	}
}
