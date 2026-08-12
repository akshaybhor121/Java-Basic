import java.util.*;

public class Terneryoprator 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Age :");
        int age = sc.nextInt();

        String c = (age>=18)?"Adult":"Child";
        System.out.println(c);
    }
}
