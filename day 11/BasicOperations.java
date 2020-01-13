package com.cts.filehandling;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BasicOperations {
	
		//Path interface,which is used to create a path
		//The default file system obtained by invoking the FileSystems.getDefulkt() 
		//method ,provides access to the filesystem to JVM
		//Paths()
		
		public static void main(String[] args) throws IOException {
		
	
			 Path path=Paths.get("C:\\Users\\LENOVO\\Desktop\\data3\\data.txt");
		        //System.out.println(Files.exists(path));
		        
		        //Files.createFile(path);
		        //Files.createDirectory(path);
		       // Files.createDirectories(path);
		        //Files.deleteIfExists(path);
		        Path second=Paths.get("C:\\Users\\LENOVO\\Desktop\\hameem\\new.txt");
		        
		        Files.move(path,second);
		       // Files.copy(second, path);
	
	}
}
