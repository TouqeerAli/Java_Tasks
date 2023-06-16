import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
		// 
		File newFile = new File("sample.txt");
	
		FileWriter file = null;
		
		try {
			if(newFile.createNewFile()) {
				System.out.println("New File Created");
			}else 
				System.out.println("File already exist.");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try {
			file = new FileWriter(newFile);
			
			file.write("ID	NAME	RollNo\n");
			file.write("101	Amir	20CS078\n");
			file.write("102	Haseeb	20CS003\n");
			file.write("103	Touqeer	20CS019\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				file.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
