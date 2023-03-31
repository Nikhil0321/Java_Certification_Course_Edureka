import java.util.Scanner;
import test.MathOperation;
public class MathFunctions 
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a=input.nextInt();
        int b=input.nextInt();
        MathOperation obj=new MathOperation();
        System.out.println("subtraction= "+obj.subtract(a, b));
        System.out.println("division= "+obj.divide(a, b));
        System.out.println("Factorial of a= "+obj.factorial(a));
        System.out.println("Reverse of a= "+obj.reverse(a));
    }
}
