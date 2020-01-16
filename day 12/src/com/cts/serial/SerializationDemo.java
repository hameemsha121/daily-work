package com.cts.serial;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.cts.day12.streamapi2.Employee;

public class SerializationDemo {

	public static Object deserialize(String fileName) throws IOException, ClassNotFoundException
	{
		FileInputStream fin=new FileInputStream(fileName);
		BufferedInputStream bin=new BufferedInputStream(fin);
		ObjectInputStream in=new ObjectInputStream(bin);
		
		Object obj=in.readObject();
		
		return obj;
		
	}
	public static void serialize(Object obj,String fileName) throws IOException
	{
		FileOutputStream fout=new FileOutputStream(fileName);
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		ObjectOutputStream out =new ObjectOutputStream(bout);
		
		out.writeObject(obj);
		out.close();
		bout.close();
		fout.close();
		
			
	}
	
	
	public static void main(String[] args){
	
		
		Employee em=new Employee(1111,"sairam","kohlapur",33,4567898,4567890);
		
			try {
				serialize(em, "serial.txt");
				Employee emp=(Employee) deserialize("serial.txt");
				System.out.println(emp);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

	}

}
}