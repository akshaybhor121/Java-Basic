import java.util.*;
public class Callbyvalue {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
        System.out.println("Actual value:");
        System.out.println("Value of a is :"+a);
        System.out.println("Value of b is :"+b);

    }
    public static void swap(int a,int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Call By value");
        System.out.println("Value of a is :"+a);
        System.out.println("Value of b is :"+b);
    }
    
}
