package reading_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//import com.sun.java.util.jar.pack.Package.File;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		FileReader fr = new FileReader(file);
	}

}
