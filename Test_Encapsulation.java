
public class Test_Encapsulation {

	private int i;
	private int j;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	public static void main(String[] args) {
		Test_Encapsulation t=new Test_Encapsulation();
		System.out.println(t.getI());
	}
}
