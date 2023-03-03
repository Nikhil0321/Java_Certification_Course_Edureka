//Write a program to find factorial ofa number.
import java.util.Scanner;
public class Factorial 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num=input.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
        input.close();
    }
}
