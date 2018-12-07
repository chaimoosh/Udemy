package reading_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//import com.sun.java.util.jar.pack.Package.File;

public class App {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done");
	}

}
