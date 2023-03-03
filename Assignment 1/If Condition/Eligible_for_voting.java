//Write a program to check if acandidate is eligible for voting or not. (Hint: Check age)
import java.util.Scanner;
public class Eligible_for_voting 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the age of candidate\n");
        int age=input.nextInt();
        if (age>=18)
        {
            System.out.println("Candidate is eligible for voting");
        }
        else
        {
            System.out.println("Candidate is not eligible for voting");
        }
        input.close();
    }
}
