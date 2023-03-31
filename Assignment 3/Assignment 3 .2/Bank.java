import java.util.Scanner;
abstract class Account 
{
    int accnum;
    String Name;
    double Balance;
    public Account(int accnum,String Name,double Balance)
    {
        this.accnum=accnum;
        this.Name=Name;
        this.Balance=Balance;
    }
    public void Display()
    {
        System.out.println("Account Number = "+this.accnum);
        System.out.println("Name = "+this.Name);
        System.out.println("Balance = "+this.Balance);
    }
    public void Deposit(double amt)
    {
        Balance=+amt;
        System.out.println("Amount "+amt+" added Successfully\n Updated Balance "+Balance);
    }
    public void Withdraw(double amt)
    {
        Balance=-amt;
        System.out.println("Amount "+amt+" withdrawn\n Updated Balance "+Balance);
    }
}
class Bank 
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome \n 1.Saving Account \n 2.Current Account \n 3.Exit");
        int acctype=input.nextInt();
        if(acctype>=3)
        {
            System.exit(0);
        }
        System.out.println("Enter account number:");
        int accNo = input.nextInt();
        System.out.println("Enter account holder name:");
        String name = input.next();
        System.out.println("Enter initial amount:");
        double amount = input.nextDouble();
        Account obj=null;
   
        switch(acctype)
        {
            case 1: System.out.println("case 1");
            obj=new SavingAccount(accNo,name,amount);
            break;
            case 2:  obj=new CurrentAccount(accNo,name,amount);
            break;
            default:System.err.println("Invalid Option");
            return;
        }
        System.out.println("Account created successfully.");
        obj.Display();
        System.out.println("Enter amount to deposit:");
        double depositAmt = input.nextDouble();
        obj.Deposit(depositAmt);
        System.out.println("Enter amount to withdraw:");
        double withdrawAmt = input.nextDouble();
        obj.Withdraw(withdrawAmt);
        input.close();
    }
}