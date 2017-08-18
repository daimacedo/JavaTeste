package readingFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class ReadingFiles {

	public static void main(String[] args) throws IOException {
		
		// if you use windows so you have to put double // in the path
		String pathname = "/home/adtsys/workspaceneon/JavaTutorial/src/readingFiles/test.properties";
		// a Lib that provides the functionality to read a file in Java
		Properties prop = new Properties();
		// A lib that provides the functionality to load a file in java
		FileInputStream fs = new FileInputStream(pathname);
		
		// We need to create a file with extensio .properties to jave recognize the file
		
		// setting the file to be load
		prop.load(fs);
		System.out.println(prop.getProperty("name"));
		// I can update a value into a file
		System.out.println(prop.put("name", "Daiane Macedo"));
		//Verify if a there is a key into a file
		System.out.println(prop.containsKey("teste"));
		
		// to add a value into a file i have to create an object type OutputStream setting the
		// path and name of the file, if this file already exists so, it will be updated if not a new file will be created.
		
		OutputStream output = new FileOutputStream("/home/adtsys/workspaceneon/JavaTutorial/src/readingFiles/test.properties");
		prop.setProperty("teste", "saved");
		prop.store(output,null);

		
		
	}

}
