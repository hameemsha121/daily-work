/*
Consider an example, where the discount percentage on a TV needs to be decided
   on the basis of the type of TV. If the TV is CRT (C), the discount will be 5% of the
   selling price (SP). If the TV is LCD (L), then the discount will depend on the size of
   the TV screen. For 14 inches screen, the discount is 8% of the SP. For 21 inches
   screen, the discount is 10% of the SP.
*/

import java.io.*;
import java.util.*;

class problem4
{
		public static void main(String[] args)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the type of TV...1.CRT...2..LCD");
			int num=sc.nextInt();
			if(num==1){
				System.out.println("the selling price is");
				int sp=sc.nextInt();
				double a=sp*0.05;
				double fp = sp-a;
				System.out.println("The discounted price is "+fp);
			}
			if(num==2){
				
				System.out.println("enter the screen size 1.)14 inches 2.21 inches");
				int ss=sc.nextInt();
				if(ss==1)
				{
					System.out.println("the selling price is");
					
					int sp=sc.nextInt();
					double a=sp*0.08;
				    double fp = sp-a;
					System.out.println("The discounted price is "+fp);
				}
				if(ss==2)
				{
					System.out.println("the selling price is");
				    
					int sp=sc.nextInt();
					double a=sp*0.1;
					double fp = sp-a;
					System.out.println("The discounted price is "+fp);
				}
			
			
		}
}
}
