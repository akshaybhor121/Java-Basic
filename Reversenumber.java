public class Reversenumber 
{
    public static void main(String args [])
    {
        int no = 25633;
        while(no>0)
        {
        int rev = no % 10;
        System.out.print(rev);
        no = no/10;
        }

    }
    
}
