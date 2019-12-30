
public class EmployeeImpl implements ICompany{

	@Override
	public void provide_salary() {
		// TODO Auto-generated method stub
		System.out.println("Company provide Salary");
	}
	public static void main(String[] args) {
		EmployeeImpl e=new EmployeeImpl();
		System.out.println(EmployeeImpl.name);
		e.provide_salary();
		
	}
	

}
