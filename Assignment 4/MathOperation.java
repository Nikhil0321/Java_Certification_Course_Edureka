package test;
public class MathOperation
{
    public int subtract(int a,int b)
    {
        return a-b;
    }
    public int multiply(int a,int b)
    {
        return a*b;
    }
    public int divide(int a,int b)
    {
        return a/b;
    }
    public int factorial(int a)
    {
        int fact=1;
        if(a==0)
        {
            return 1;
        }else 
        {
            while(a>=1)
            {
                fact=fact*a;
                a--;
            }
        }
        return fact;
    }
    public int reverse(int a)
    {
        int reverse=0;
        for (int i=a;i!=0;i/=10) 
        {
            reverse=reverse*10+i%10;
        }
        return reverse;
    }
    public static void main(String args[]) 
    {
        
    }
}