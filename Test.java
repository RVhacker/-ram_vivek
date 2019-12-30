
public class Test {
   
	public void show()
	{
		System.out.println("This is the show method");
		this.display();	// "this" keyword is used to print the second method without calling the method.
	}
	
	public void display()
	{
		System.out.println("This is the display method");
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		t.show();
	}
}
