
public class Switch extends Light {   // Extend the Abstract class Light

	@Override
	void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("The Light is turn On");
	}

	@Override
	void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("The Light is turn Off");
	}
	public static void main(String[] args) {
		Switch s=new Switch();
		s.turnOn();
		s.turnOff();
	}

}
