import java.util.*;
public class ConditionalStatement
{
    public static void main(String [] args)
    {
       //IF STATEMENT 

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter Two Numbers:");
       int A = sc.nextInt();
       int B = sc.nextInt();

       if(A>=B)
       {
        System.out.println("A is grether :"+A);

       }
       else{
        System.out.println("B is grether :"+B);
       }
    }
}