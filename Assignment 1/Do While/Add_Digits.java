//Write a programto add the digits of a number.
import java.util.Scanner;
public class Add_Digits 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num=input.nextInt();
        int sum=0,i=num;
        do
        {
            sum=sum+i%10;
            i=i/10;

        }
        while(i!=0);
        System.out.println(sum);
        input.close();
    }
}