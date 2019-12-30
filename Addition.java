// Program to Create the Object and print the Instance & Local Variable.

public class Addition {
   int i=10; // Instance Variable
   
   void add()
   {
	   int a=10; // Local variable
	   int b=20;
	   int c=a+b; 
	   System.out.println(c);
   }
   
   public static void main(String[] args) {

	   Addition a= new Addition(); // object creation
	   System.out.println(a.i); // print  instance variable
	   a.add(); // print add  method
}
}

