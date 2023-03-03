//Write programs to use all the data types and given arithmetic operations.
class Datatypes_and_operations
{
    public static void main(String args[])
    {
        int a=5,b=8;
        float e=3.2f,f=6.5f;
        char c='a';
        String d="data type";
        boolean g=true;
        double h=2.365541,i=5.123486;
        byte j=5;
        short l=25;
        long n=125,o=110,ladd;
        double diff=h-i;
        float mul=e*f;
        float div=e/f;
        double mod=h%i;
        int sum=a+b;
        ladd=n+o;
        System.out.println("Byte value "+j);
        System.out.println("short value is "+l);
        System.out.println("long addition is "+ladd);
        System.out.println("Addition value is "+sum);
        System.out.println("Difference is "+diff);
        System.out.println("Product is "+mul);
        System.out.println("Division value is "+div);
        System.out.println("mod is "+mod);
        System.out.println("char value is "+c);
        System.out.println("String is "+d);
        System.out.println("Boolean value is "+g);
    }
}