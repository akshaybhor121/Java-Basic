import java.util.*;
public class Countprimeno {

     public static void count(int no)
    {
        for(int i=2;i<no;i++)
        {
          if(isprime(i))
          {
            System.out.print(i+" ");
          }
       }
   }
    public static boolean isprime(int n)
    {
        if(n == 2)
        {
            return true;
        }

        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;

    }
    public static void main(String [] args)
    {
        count(100);
    }
   
}
