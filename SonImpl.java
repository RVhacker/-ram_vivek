// Sub_class of IFather and IMother
public class SonImpl extends GrandFather implements IFather,IMother{ 

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println( "He Knows to drive");
	}

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		System.out.println("She knows to cook..");
	}
	public static void main(String[] args) {
		SonImpl s=new SonImpl();
		s.drive(); 
		s.cook();
		s.getproperty();
	}

	@Override
	void getproperty() {  // abstract class 
		// TODO Auto-generated method stub
		System.out.println("He is an ancestor");
		
	}
	

}
