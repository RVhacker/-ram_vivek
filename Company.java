
public class Company  {
	
	int salary;
	int Emp_id;
	
	
	public Company()
	{   
		this(29000,1322);
		System.out.println("This is superclass empty constructor");
	}
	public Company(int i,int j)
	{
		this.salary=i;
		this.Emp_id=j;
		System.out.println(this.salary+ " "+this.Emp_id);
	}
	public static void main(String[] args) {
		Company c=new Company();
		
	}

}
