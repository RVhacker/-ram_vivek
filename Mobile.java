
public class Mobile {
 String s="Blue";
 String c="HD Display";
 void call()
 {
	 System.out.println("Calling .."); 
 }
 void camera()
 {
	  System.out.println("Clicking the photo");
 }
 
 
 public static void main(String [] args)
 {
	 Mobile m= new Mobile();
	 System.out.println(m.s);
	 System.out.println(m.c);
	 m.call();
	 m.camera();
	 
 }
 
 }

