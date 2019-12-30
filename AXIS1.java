
public class AXIS1 extends RBI1 {

	@Override
	void getRateOfInterest() {  //Abstract method
		// TODO Auto-generated method stub
		System.out.println("The rateOfInterest of AXIS1 is 4%");
		
	}
	public static void main(String[] args) {
		AXIS1 a=new AXIS1();
		a.provide_loan(); // call the concrete method of RBI1 class
		a.getRateOfInterest(); //call the abstract method
		
	}


}

