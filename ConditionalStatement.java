import java.util.*;
public class ConditionalStatement
{
    public static void main(String [] args)
    {
       //IF-ELSE STATEMENT 
       System.out.println("IF-ELSE STATEMENT :");

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
       //IF- ELSEIF STATEMENT 
       System.out.println("IF-ELSEIF STATEMENT :");
       System.out.println("Enter your income :");
       double income = sc.nextDouble();
       double tax;

       if(income <= 500000)
       {
        System.out.println("0 Tax");

       }
       else if(income>500000 && income <= 1000000)
       {
        tax= income * 0.2;
        System.out.println("Tax is:"+tax);

       }
       else
       {
        tax = income * 0.3;
        System.err.println("Tax is :"+tax);
       }

    }
}