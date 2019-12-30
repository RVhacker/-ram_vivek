
public class Main_Overload {
	
	public static void main(String[] args) {
		
		System.out.println("Hi All");
		Main_Overload.main("Jspider");
	}
	
	public static void main(String s1) {
		
	System.out.println("Welcome to"+" "+s1);
	Main_Overload.main("Java", "Class");
		
	}
	
	public static void main(String s1,String s2) {
		
		System.out.println("This is"+" " +s1+ " "+s2);
	}

}
