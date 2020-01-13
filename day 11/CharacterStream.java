package com.cts.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class CharacterStream {

	public static void main(String[] args) throws IOException {
		
		
		String path="C:\\Users\\LENOVO\\Desktop\\data.txt";
		String path2="C:\\Users\\LENOVO\\Desktop\\data2.txt";
		FileReader f= new FileReader(path);
		BufferedReader br=new BufferedReader(f);
		
		
		FileWriter f2=new  FileWriter(path2);
		BufferedWriter br2=new BufferedWriter(f2);
		
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br3=new BufferedReader(r);
		
		System.out.println("Enter your name");    
	    String name=br3.readLine();    
	    System.out.println("Welcome "+name);   
	    
	   // OutputStreamWriter wr = new OutputStreamWriter(out);
	    
	    
	    
	    
		
		int i;
		while((i=br.read())!=-1)
		{
			br2.write(i);
			System.out.print((char)i);
		}
		br.close();
		br2.close();
		

	}

}
