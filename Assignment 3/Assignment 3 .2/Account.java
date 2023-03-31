
abstract public class Account 
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