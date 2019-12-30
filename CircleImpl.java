
public class CircleImpl  implements IShape{

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("The area of Circle");
	}
	public static void main(String[] args) {
		CircleImpl c=new CircleImpl();
		c.area();
	}

}
