import java.util.Scanner;
public class Areaofcircle
{
    public static void main(String args[])
    {
        //Area Of Circle

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of circle :");
        var rad= sc.nextFloat();
        var area = 3.14*rad*rad;
        System.out.print("Area of Circle :"+area);
    }
}