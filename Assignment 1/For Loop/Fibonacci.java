//Write a program to generate 10 Fibonacci numbers.
public class Fibonacci 
{
    public static void main(String[] args)
    {
        int num1=0;
        int num2=1;
        for(int i=1;i<=10;i++)
        {
            System.out.println(num1);
            int nextnum=num1+num2;
            num1=num2;
            num2=nextnum;
        }
    }
}

