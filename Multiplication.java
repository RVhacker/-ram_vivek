
public class Multiplication {
  int i=5; // Instance Variable
  
    void Multiply()
    {
    	int a=10; // Local variable
    	int b=20;
    	int c=a*b;
    	System.out.println(c);  
    }
    
 public static void main(String[] args) {
	
	 Multiplication m= new Multiplication();  // Creating the object
	 
	 System.out.println("Instance variable is:");
	 System.out.println(m.i);   // Print the Instance Variable
	 
	 System.out.println("Multiplication of Local variables is :");
	 m.Multiply();  // Print the Local variable by calling  method
}
}
