public class Exception {
	 public static void division(String arg) throws ArithmeticException{
		 System.out.println("Begin");
			int a=Integer.parseInt(arg);
			System.out.println("Got value");
			if(a==10)
			{
				throw new ArithmeticException();
			}
			int b=10/(10-a);
			System.out.println(+b);
			String name="Hrithik";
			System.out.println("Height"+name.length());
			System.out.println("stop");
	 }
		 public static void main(String[] args) {
		try {
			division(args[0]);
		}
		catch(NumberFormatException ex)
		{
			System.out.println("please enter number only");
		}
		 }
	 }


