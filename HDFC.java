
public class HDFC extends RBI {

	@Override
	void getRateOfInterest() {
		System.out.println("The Rate of Interest is 9%");
	}
    public static void main(String[] args) {
		HDFC h=new HDFC();
		h.getRateOfInterest();
		
		AXIS a =new AXIS();
		a.getRateOfInterest();
		
		RBI r= new RBI();
		r.getRateOfInterest();
	}
	
}
