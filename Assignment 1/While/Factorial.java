//Write a programto find factorial of a number.
import java.util.Scanner;
public class Factorial 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=input.nextInt();
        int fact=1;
        int i=1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of "+num+" is "+fact);
        input.close();
    }
}
