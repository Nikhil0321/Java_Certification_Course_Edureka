//Write a program to generate 10 Fibonacci numbers.
public class Fibonacci 
{
    public static void main(String[] args)
    {
        int num1=0,num2=1,n=1;
        System.out.print("Fibonacci series: ");
        System.out.print(num1+"\t");
        while(n<=10)
        {
            System.out.print(num2+"\t");
            int nextnum=num1+num2;
            num1=num2;
            num2=nextnum;
            n++;
        }
    }
}
