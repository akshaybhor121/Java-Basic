import java.util.*;
public class Simplefun {

    public static void calsum(int a,int b)
    {
        int sum = a+b;
        System.out.println("SUM :"+sum);
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your NO 2:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        calsum(a,b);

    }
}
