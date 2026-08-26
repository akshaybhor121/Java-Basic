import java.util.*;
public class Factorial {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter a no:");
        int no = sc.nextInt();
        fact(no);

    }

    public static void fact(int no)
    {
        int f=1;
        for(int i=1;i<=no;i++)
        {
            f= f*i;
        }
        System.out.println("factorial of "+no+" "+"is :"+f);
    }
    
}