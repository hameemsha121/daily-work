    class Hello
{
    private int age=20;
	
	public void showAge()
	{
	   System.out.println("Your Age is :"+age);
	}
}

class AbstractTest
{
  public static void main(String ... args)
  {
     Hello h=new Hello();
	 h.age=25;
	 h.showAge();
  }
}