//Write a program to check given number is evenor odd.(Hint: use % operator)
import java.util.Scanner;
public class Even_or_Odd 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num=input.nextInt();
        if (num%2==0)
        {
            System.out.println(+num+" is Even");
        }
        else 
        {
            System.out.println(+num+" is Odd");
        }
        input.close();
    }
}
