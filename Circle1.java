
public class Circle1  extends Shape{

	@Override
	void area() {
		// TODO Auto-generated method stub
		super.area();
		System.out.println(super.name);
	}
	
	public static void main(String[] args) {
		Circle1 c=new Circle1();
		c.area();
	}

}
