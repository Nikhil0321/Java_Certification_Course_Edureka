//Write a program to generate 10 Fibonacci numbers.
public class Fibonacci 
{
    public static void main(String[] args)
    {
        int num1=0,num2=1,i=1;
        System.out.print(num1+"\t");
        do
        {
            int nextnum=num1+num2;
            System.out.print(num2+"\t");
            num1=num2;
            num2=nextnum;
            i++;
        }while(i<10);
    }
}
