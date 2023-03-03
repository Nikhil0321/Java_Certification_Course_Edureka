//Write a program to print 10 even numbers and 10 odd numbers.
public class Even_Odd 
{
    public static void main(String[] args)
    {
        System.out.print("Even Numbers:");
        for(int i=0;i<20;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+"\t");
            }
        }
        System.out.print("\nOdd Numbers:");
        for(int i=0;i<20;i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+"\t");
            }
        }
    }
}

