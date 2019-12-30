
public class String_Buffer {
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Ram Vivek");
		sb.append("Lalbahdur"); // Append method is used to add string
		System.out.println(sb);
		
		sb.insert(1, "Ramesh"); // Insert method
		System.out.println(sb);
		
		sb.delete(1, 7); // Delete method.
		System.out.println(sb);
		
		sb.replace(1, 7, "MasterBlaster"); // replace method
		System.out.println(sb);
		
		sb.reverse(); // reverse method
		System.out.println(sb);
				
	}

}
