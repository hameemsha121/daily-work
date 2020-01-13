package com.cts.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		String path="C:\\Users\\LENOVO\\Desktop\\data.txt";
		File file=new File(path);
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.exists());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		
		FileInputStream fin=new FileInputStream(file);
		
		String path2="C:\\Users\\LENOVO\\Desktop\\data2.txt";
		FileOutputStream fout=new FileOutputStream(path2);
		
		
//		String msg="Welcome to file handling";
//		byte [] b=msg.getBytes();
//		fout.write(b);
//		fout.close();
//		
		int i;
		while((i=fin.read())!=-1)
		{
			fout.write(i);
			System.out.print((char)i);
		}
		
		
	
	
	}

}
