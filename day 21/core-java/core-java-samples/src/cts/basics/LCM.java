package cts.basics;

public class LCM {

	public static void main(String[] args) {
		
		int a=100,b=120,lcm;
		lcm=(a>b)?a:b;
		
		while(true)
		{
			if(lcm%a==0 && lcm%b==0)
			{
				System.out.println(lcm);
				break;
			}
			++lcm;
		}
		
	}

}
