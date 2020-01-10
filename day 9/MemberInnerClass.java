package com.cts.day9.program2;

public class MemberInnerClass {

	public static void main(String[] args) {
		Outer out=new Outer();
		out.display();
	}

}
class Outer{
	int x=10;
	static int y=20;
	public void display() {
		class Member
		{
			public void show()
			{
				System.out.println(y);
			}
			/*class Inner
			{
				public void put()
				{
					System.out.println(x);
				}
			}*/
		}
		Member m=new Member();
		m.show();
		//m.put();
	}
}