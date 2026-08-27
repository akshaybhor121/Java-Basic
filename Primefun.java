import java.util.*;
public class Primefun {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isprime(n);
    }

    public static void isprime(int n)
    {
        boolean flag = true;

        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                flag=false;
            }
        }
            if(flag==true)
            {
                System.out.println("No is Prime");
            }
            else
            {
                System.out.println("No is NotPrime");
            }

    }
    
}
