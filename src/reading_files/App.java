package reading_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//import com.sun.java.util.jar.pack.Package.File;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String fileName = "‎⁨Macintosh HD⁩ ▸ ⁨Users⁩ ▸ ⁨chaim⁩ ▸ ⁨Downloads ▸ Java⁩";
		File textFile = new File(fileName);
		
		Scanner in = new Scanner(textFile);
	}

}
