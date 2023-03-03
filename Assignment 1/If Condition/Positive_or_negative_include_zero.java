//Extend the previous program to check whether the given number is positive, zero or negative.
//(Hint: use if-else conditions)
import java.util.Scanner;
public class Positive_or_negative_include_zero 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num=input.nextInt();
        if (num>0)
        {
            System.out.println("Number is Positive ");
        }
        else if(num<0)
        {
            System.out.println("Number is Negative ");
        }
        else 
        {
            System.out.println("Number is Zero");
        }
        input.close();
    }
}
