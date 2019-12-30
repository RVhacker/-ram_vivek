
public class Test_String1 {
	public static void main(String[] args) {
		String s1="Sachin";
		String s2="SAchin";
		if(s1==s2)// using compare operation
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		if(s1.equals(s2)) // using equalscase().
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		if(s1.equalsIgnoreCase(s2)) // using equalsIgnoracecase().
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
