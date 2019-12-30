// Reading the data by using FileReader
import java.io.FileReader;
import java.io.IOException;

public class Test_Reader {
	
public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("E://Test_Exception//Test.txt");
	int i;
	while((i=fr.read())!=-1)
	{
		System.out.print((char)i);
	}
	fr.close();
}

}
