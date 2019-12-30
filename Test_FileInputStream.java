

import java.io.FileInputStream;
import java.io.IOException;

public class Test_FileInputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream fs=new FileInputStream("E://TestFile_Handling//Test_FileOutput.txt");
		int i=0;
		while((i=fs.read())!=-1)
		{
			System.out.print((char)i);
		}
		fs.close();
	}

}
