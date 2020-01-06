import java.util.*;
public class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter the operator\n1.Add\n2.sub\n3.mul\n4.div\n");
        int op = sc.nextInt();
        calculate calc = new calculate();
        float result = calc.cal(a,b,op);
        System.out.println(result);
    }
}
class calculate{
    public static float cal(int a, int b, int op){
        float re=0;
        switch(op){
            case 1:
                    re=a+b;
                    break;
            case 2:
                    re=a-b;
                    break;
            case 3:
                    re=a*b;
                    break;
            case 4:
                    re=a/b;
                    break;
            default:
                    break;
        }
        return re;
    }
}