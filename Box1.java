
public class Box1 {
  int l;
  int b;
  public Box1(int i,int j)
  {
	 this.l=i;
	 this.b=j;
	 int k=this.l*this.b;
	 System.out.println(k);
  }
  public Box1()
  {
	  System.out.println("This is a custom customer");
  }
  public Box1(int a,int b,int c)
  {
	int d=a+b+c;
	System.out.println(d);
  }
  public static void main(String[] args) {
	Box1 b=new Box1(6,8);
	Box1 b1=new Box1();
	Box1 b2=new Box1(1,2,3);
}
}
