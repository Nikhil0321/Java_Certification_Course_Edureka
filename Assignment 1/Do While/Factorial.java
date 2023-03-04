//Write a programto find factorial of a number.
import java.util.Scanner;
public class Factorial 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num=input.nextInt();
        int fact=1,i=1;
        do
        {
            fact=fact*i;
            i++;
        }
        while(i<=num);
        System.out.println(fact);
        input.close();
    }
}