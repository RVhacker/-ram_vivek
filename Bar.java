
public class Bar {
  String drink_name;
  
  void supplies()
  {
	
  }
  
   public static void main(String[] args) {
	 System.out.println("This is the first bar object");
	Bar b1= new Bar();
	b1.drink_name="Beer";
	System.out.println(b1.drink_name);
	
	 System.out.println("This is the Second bar object");
	Bar b2= new Bar();
	b2.drink_name="Rum";
	System.out.println(b2.drink_name);
	
	 System.out.println("This is the third bar object");
	Bar b3= new Bar();
	b3.drink_name="Whisky";
	System.out.println(b3.drink_name);
	
	 System.out.println("This is the fourth bar object");
	Bar b4= new Bar();
	b4.drink_name="Vodka";
	System.out.println(b4.drink_name);
}
}
	



