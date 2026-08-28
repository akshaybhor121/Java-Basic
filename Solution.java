import java.util.*;
class Solution
{
    public static boolean isprime(int no)
    {
        if(no==1)
        {
            return false;
        }
        if(no==2)
        {
            return true;
        }
        for(int i=2;i*i<=no;i++)
        {
            if(no%i==0)
            {
                return false;
            }
        }return true;
    }
    public static int count(int no)
    {
        int count=0;
        for(int i=1 ;i<=no;i++)
        {
            if(isprime(i))
            {
                count++;

            }
        }return count;
    }
    public static int fact(int no)
    {
        int mod = 1000000007;
        int fact = 1;
        for(int i=1;i<=no;i++)
        {
            fact = (fact*i) % mod;
        } return fact;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input :");
        int n = sc.nextInt();
        int pc = count(n);
        int np = n - pc;
        int pfact = fact(pc);
        int nfact = fact(np);
        int f = pfact*nfact;
        System.out.println(f);
        sc.close();
    }
}