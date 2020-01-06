import java.util.*;
public class headRecursion{
    public static void main(String[] args)
    {
        int n,s;
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        s=sum(n);
        System.out.println(s);
    }
    public static int sum(int n)
    {
        if (n>1)
        return n+sum(n-1);
        return 1;
    }
}