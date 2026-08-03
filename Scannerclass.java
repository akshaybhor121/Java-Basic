import java.util.Scanner;
public class Scannerclass 
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Integer Value :");
    var x = sc.nextInt();
    System.out.println("Value of Integer x is :"+ x);

    System.out.println("Enter a String Value :");
    var y = sc.nextLine();
    System.out.println("Value of Sting y is :"+ y);

    System.out.println("Enter a Floating Value :");
    var z = sc.nextFloat();
    System.out.println("Value of float z is :"+ z);
  }
}