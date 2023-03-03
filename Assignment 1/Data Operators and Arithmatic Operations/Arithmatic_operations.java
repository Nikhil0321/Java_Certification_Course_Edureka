//Write program to perform all the arithmetic operations given in the table
public class Arithmatic_operations 
{
    public static void main(String args[])
    {
        int a,b;
        a=59;
        b=23;
        int sum=a+b;
        int diff=a-b;
        int mul=a*b;
        int div=a/b;
        int mod=a%b;
        int incc=++a;
        int decc=--b;
        System.out.println("Sum of "+a+"+"+b+"="+sum);
        System.out.println("Diff of "+a+"-"+b+"="+diff);
        System.out.println("Mul of "+a+"*"+b+"="+mul);
        System.out.println("Div of "+a+"/"+b+"="+div);
        System.out.println("Mod of "+a+"%"+b+"="+mod);
        System.out.println("increment of a is "+incc);
        System.out.println("decrement of b is "+decc);
    }
}
