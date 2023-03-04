//Write a program to reverse the digits of a number.
import java.util.Scanner;
public class Reverse_number 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=input.nextInt();
        int rev=0;
        int i=num;
        while(i!=0)
        {
            int digit=i%10;
            rev=rev*10+digit;
            i=i/10; 
        }
        System.out.println("Reverse of "+num+" is "+rev);
        input.close();
    }
}
