package reading_exceptions_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//import com.sun.java.util.jar.pack.Package.File;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try {
			openFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		}
	}
	
	public static void openFile() throws FileNotFoundException {
		File file = new File("test.txt");
		FileReader fr = new FileReader(file);
	}
}
