//Write a program to find largest of two numbers.
import java.util.Scanner;
public class Greater_of_two_number 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num1=input.nextInt();
        int num2=input.nextInt();
        if (num1>num2)
        {
            System.out.println(+num1+" is Larger");
        }
        else if(num2>num1)
        {
            System.out.println(+num2+" is Larger");
        }
        else 
        {
            System.out.println("Both are Equal");
        }
        input.close();
    }
}
