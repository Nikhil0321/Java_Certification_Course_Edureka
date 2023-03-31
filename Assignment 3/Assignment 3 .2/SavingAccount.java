public class SavingAccount extends Account 
{
    private double interestRate = 0.04;
    private final double minbalance=100;
    public SavingAccount(int accNo, String name, double Balance) 
    {
        super(accNo, name, Balance);
    }
    public void withdraw(double amt) 
    {
        if (amt > Balance+minbalance)
         {
            System.out.println("Insufficient balance.");
        } else {
            Balance -= amt;
            Balance *=interestRate;
            System.out.println("Amount withdrawn successfully. New balance: " + Balance);
        }
    }
    
    public void addInterest() 
    {
        Balance += Balance * interestRate;
        System.out.println("Interest added successfully. New balance: " + Balance);
    }
}
