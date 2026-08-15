public class Reversenumber 
{
    public static void main(String args [])
    {
        int no = 25633;
        while(no>0)
        {
        int re = no % 10;
        System.out.print(re);
        no = no/10;
        }

    }
    
}
