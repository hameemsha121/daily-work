package com.cts.excercise;


public class StringBuffered {

	public static void main(String[] args) {
			StringBuffer sb=new StringBuffer();//first way
			System.out.println(sb.capacity());//method 1
			sb.append("thoraipakkam");
			System.out.println(sb.capacity());
			sb.append("chennai");
			System.out.println(sb.capacity());
			sb.append("sgdjADSHKajbsdkjas");
			System.out.println(sb.capacity());
			StringBuffer sb1=new StringBuffer("Hello");//second way
			System.out.println(sb1.capacity());
			StringBuffer sb2=new StringBuffer(50);//third way
			System.out.println(sb2.capacity());
			
			System.out.println(sb1.append(" abc"));//method 2
			System.out.println(sb1.insert(2, "efgh"));//method 3
			System.out.println(sb1.delete(2,6));//method 4
			System.out.println(sb1.replace(6, 9, "world"));//method 5
			sb1.ensureCapacity(200);//method 6
			System.out.println(sb1.capacity());
			
	}

	

}
