//Write a programto add the digits of a number.
import java.util.Scanner;
public class Add_digits 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num=input.nextInt();
        int sum=0;
        for(int i=num;i!=0;i=i/10)
        {
            sum+=i%10;
        }
        System.out.println(sum);
        input.close();
    }
}