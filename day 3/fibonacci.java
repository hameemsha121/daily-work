import java.util.*;
public class fibonacci{
	public static int fib(int n){
	if(n == 0)
	    {
		return 0;
	    }
	if(n == 1 || n == 2)
	    {
			return 1;
		}
	return fib(n-2) + fib(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
	    System.out.print("Fibonacci Series of "+n+" numbers: ");
	    for(int i = 0; i < n; i++){
		System.out.print(fib(i) +" ");
	}
	}
}