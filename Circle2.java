
public class Circle2  extends Shape2{ // extends the abstract class Shape2

	@Override
	void getArea() {
		// TODO Auto-generated method stub
		System.out.println("The area of Circle2");
	}
	public static void main(String[] args) {
		Circle2 c=new Circle2();
		c.getArea();
	}

}
