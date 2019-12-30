
public class Circle extends Shape{

	@Override
	void area() {
		System.out.println("This is the area of Circle");
	}
	public static void main(String[] args) {
		 
	Shape s; // Variable Declaration
	s= new Square(); // Up- Casting
	s.area();
	s=new Circle();
	s.area();
}
}
