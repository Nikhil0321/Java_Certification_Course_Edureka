//Write a program to reverse the digits of a number.
import java.util.Scanner;
class Reverse_Number
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num=input.nextInt();
        int rev=0,i=num;
        do
        {
            int digit=i%10;
            rev=rev*10+digit;
            i=i/10;
        }while(i!=0);
        System.out.println(rev);
        input.close();
    }
}