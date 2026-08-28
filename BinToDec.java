import java.util.*;
public class BinToDec 
{
    public static void bintodec(int no)
    {
        int binno=no;
        int dec=0;
        int p=0;

        while(no>0)
        {
            int ls = no%10;
            dec = dec+(ls * (int)Math.pow(2,p));
            p++;
            no=no/10;
        }
        System.out.println("Decimal No :"+dec);

    }
    public static void main(String [] args)
    {
        bintodec(1101);
    }
}
