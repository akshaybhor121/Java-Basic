import java.util.*;
public class Continue 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        do
        {
            int n;
            System.out.println("Enter A Number :");
            n = sc.nextInt();

            if(n % 10 ==0)
            {
                continue;
            }
            System.out.println("No is : "+n);

        }while(true);
    }
    
}
