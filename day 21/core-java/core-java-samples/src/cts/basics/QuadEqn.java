package cts.basics;

public class QuadEqn {

	public static void main(String[] args) {

		double a=2,b=4,c=8;
		double d=b*b-4*a*c;
		double r1,r2;
		if(d>0)
		{
			 r1=(-b+Math.sqrt(d))/(2*a);
			 r2=(-b+Math.sqrt(d))/(2*a);
			 System.out.println(r1+""+r2);
		}
		else if(d==0)
		{
			r1=r2=-b/(2*a);
			System.out.println(r1);
		}
		else
		{
			double real=-b/2*a;
			double img=Math.sqrt(-d)/(2*a);
			System.out.println(real+" "+img);
		}
		
	}
}
			
					