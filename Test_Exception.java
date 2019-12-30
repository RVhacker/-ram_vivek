//Using try and catch block
import java.io.FileWriter;
import java.io.IOException;

public class Test_Exception {
	public static void main(String[] args) {
		FileWriter f=null;
		try
		{
			f=new FileWriter("E://Test_Exception _Practice//Test1.txt");
			f.write("Hello Java , This is My World");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Please check the path of file");
		}
		finally
		{
			try {
				f.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("please check the connecton and terminate manually");
			}
		}
	}
 
}
