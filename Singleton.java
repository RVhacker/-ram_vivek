package org.btm.jdbcApp;

public class Singleton 
{
	//Private Singleton variable
	private static Singleton single_instance=null;
	String s;
	
	//Private Constructor
	private Singleton(String st)
	{
		this.s=st;
	}
	static Singleton getSingleton(String type)
	{
		if(single_instance==null)
		{
			return single_instance=new Singleton(type);
		}
		else
			return  single_instance;
		
	}
	@Override
	public String toString() {
		return this.s;
	}
	public static void main(String[] args) {
		Singleton x=getSingleton("1st Object");
		System.out.println(x);
		Singleton y=getSingleton("2nd Object");
		System.out.println(y);
		Singleton z=getSingleton("3rd Object");
		System.out.println(z);
	}
	

}
