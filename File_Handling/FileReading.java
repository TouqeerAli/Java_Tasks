import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) {
		try {
			FileReader readFile = new FileReader("sample.txt");
			BufferedReader buffer = new BufferedReader(readFile);
			
			int i;
			while((i=buffer.read()) != -1) {
				System.out.print((char)i);
			}
			buffer.close();
			readFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
