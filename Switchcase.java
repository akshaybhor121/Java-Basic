import java.util.*;

public class Switchcase 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice upto 1 to 3 :");
        int ch = sc.nextInt();

        switch (ch) 
        {
                case 1:
                System.out.println("YOUR CHOICE IS ONE");
                
                break;

                case 3:
                System.out.println("YOUR CHOICE IS THREE");
                
                break;
                case 2:
                System.out.println("YOUR CHOICE IS TWO");
                
                break;
        
            default:
                System.out.println("WRONG CHOICE");

                break;
        }

    }
}
