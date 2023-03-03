import java.util.Scanner;
class Eligible_for_voting 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the age of candidate\n");
        int age=input.nextInt();
        System.out.println("age is"+age);
        input.close();
    }
}
