
public class A  extends MyAbstract{

	@Override
	public void method() {
		System.out.println("This is empty method");
	}

	@Override
	public void method(int a, int b) {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		A a=new A();
		a.method();
		a.method(3, 7);
	}

}