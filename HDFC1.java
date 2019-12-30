
public  class HDFC1  extends RBI1{

	@Override
	void getRateOfInterest() {  // abstract method
		// TODO Auto-generated method stub
		System.out.println("The RateOfInterest of HDFC1 is  7% ");
	}
	public static void main(String[] args) {
		HDFC1 h=new HDFC1();
		h.provide_loan(); // call the concrete method  
		h.getRateOfInterest(); // call the abstract method
	}
	
	

}
