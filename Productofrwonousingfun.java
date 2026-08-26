import java.util.*;
public class Productofrwonousingfun {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter a two no:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul=producte(a,b);
        System.out.println("Product of two No is :"+mul);
        sc.close();

    }

    public static int producte(int a,int b)
    {
        int product = a*b;
        return product;
    }
    
}
