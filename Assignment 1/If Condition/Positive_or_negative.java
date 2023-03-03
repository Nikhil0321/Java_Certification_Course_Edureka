//Write a program to check if the number is positive or negative
import java.util.Scanner;
public class Positive_or_negative 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num=input.nextInt();
        if (num>=0)
        {
            System.out.println("Number is Positive ");
        }
        else
        {
            System.out.println("Number is Negative ");
        }
        input.close();
    }
}
