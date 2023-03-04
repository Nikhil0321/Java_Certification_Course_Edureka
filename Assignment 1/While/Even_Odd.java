//Write a program to print 10 even numbers and 10 odd numbers.
class Even_Odd 
{   
    public static void main(String[] args)
    {
        System.out.print("Even Numbers: ");
        int n=1;
        while(n<=20)
        {
            if((n%2==0))
            {
                System.out.print(n+" ");
            }
            n++;
        }
        System.out.print("\nOdd Numbers: ");
        int i=1;
        while(i<=20)
        {
            if((i%2!=0))
            {
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
