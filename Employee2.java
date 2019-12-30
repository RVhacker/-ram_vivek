
public class Employee2 extends Company{
  
	int Emp_Id;
	String Proj_name;
	
	public Employee2()
	{
		super();
	   
		System.out.println("This is a Empty Constructor");
	}
	
	public Employee2(int a,String b)
	{
		this(3346);
		this.Emp_Id=a;
		this.Proj_name=b;
		
		System.out.println(this.Emp_Id+" "+this.Proj_name);
	}
	public Employee2(int a)
	{
		this.Emp_Id=a;
		System.out.println(this.Emp_Id);
	}
	
	public static void main(String[] args) {
		Employee2 e=new Employee2();
		
	}
}
