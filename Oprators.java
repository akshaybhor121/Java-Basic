public class Oprators 
{
    public static void main(String args[])
    {
        var a = 10;
        var b = 20;

        //Airthmatic Oprator

        System.out.println("Add:"+(a+b));
        System.out.println("Sub:"+(a-b));
        System.out.println("Mul:"+(a*b));
        System.out.println("Divide:"+(a/b));
        System.out.println("Modules:"+(a%b));

        //Realtional Operator
        System.out.println("Relational operator");
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a<=b);

        //Logical Operator
        System.out.println("Logical Operator");
        System.out.println(10>5 && 20>10);
        System.out.println(10>20 || 20>5);
        System.out.println(!(10>20));

       // Assignment Operator
       System.out.println("Assignment Operator");
       var c =100;
        var d = 100;
       System.out.println(c);
        System.out.println(d);


    }
}
