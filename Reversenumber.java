public class Reversenumber 
{
    public static void main(String args [])
    {
        int no = 25633;
        int l;
        while(no>0)
        {
         l = no % 10;
         System.out.print(l);
        no = no/10;
        }
        
System.out.println("");
       System.out.println("OR");
       //another Logic
       int n=25366;
       int rev =0;
       while(n>0)
       {
        int last = n%10;
        rev = (rev*10)+last;
        n=n/10;

       }
       System.out.println(rev);
    }
    
}
