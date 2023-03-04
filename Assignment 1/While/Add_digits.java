//Write a programto add the digits of a number.
import java.util.Scanner;
public class Add_digits 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num=input.nextInt();
        int i=num;
        int sum=0;
        while(i!=0)
        {
            sum=sum+i%10;
            i=i/10;
        }
        System.out.println("Sum of digits is "+sum);
        input.close();
    }
}