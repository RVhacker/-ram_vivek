
import java.io.FileOutputStream;
import java.io.IOException;

public class Test_FileOutputStream {
	public static void main(String[] args) throws IOException {
		FileOutputStream fs=new FileOutputStream("E://TestFile_Handling//Test_FileOutput.txt");
		String s="Hello World, This is program of FileOutputStream class";
		byte b[]=s.getBytes();
		fs.write(b);
		fs.close();
	}

}
