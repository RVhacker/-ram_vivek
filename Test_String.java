
public class Test_String {
	public static void main(String[] args) {
		String s1=new String("Sachin");
		String s2=new String("Sachin");
		
		if(s1.equals(s2))
		{
			System.out.println("By using the equals case isTrue");
		}
		
		else if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("By using the equalsIgnorance case is :True");
			
		}
		else
		{
			System.out.println("By using the equalsIgnorance case is :False");
		}
	}

}
