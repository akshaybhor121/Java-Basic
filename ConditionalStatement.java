import java.util.*;
public class ConditionalStatement
{
    public static void main(String [] args)
    {
       //IF STATEMENT 
       System.out.println("IF STATEMENT :");

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

       //EVEN ODD NUMBERS:
       System.out.println("Enter Numbers:");
       int NO = sc.nextInt();

       if(NO%2 == 0)
       {
        System.out.println("EVEN NO:"+NO);
       }
       else{
        System.out.println("ODD NO:"+NO);

       }




    }
}