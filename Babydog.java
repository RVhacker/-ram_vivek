
public class Babydog extends Dog {
  void weep()
  {
	  System.out.println("Babydog is weeping");
  }
  public static void main(String[] args) {
	Babydog b=new Babydog();
	b.weep(); b.bark();b.eat();
  
	Dog d=new Dog(); 
	d.bark(); d.eat();
	
	Animal a = new Animal();
	a.eat();
}
}
