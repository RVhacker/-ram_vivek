// Using throws keyword.

import java.io.FileWriter;
import java.io.IOException;

public class Test_Exception1 {
	public static void main(String[] args) throws IOException  {
		FileWriter fw=new FileWriter("E://Test_Exception//Test1.txt");
		fw.write("Test throws");
		fw.close();
	}

}
