public class CurrentAccount extends Account
{
    private final double minbalance=100;
    public CurrentAccount(int accNo, String name, double Balance) 
    {
        super(accNo, name, Balance);
    }
    public void withdraw(double amt) {
        if (amt > Balance + minbalance) {
            System.out.println("Withdrawal amount exceeds overdraft limit.");
        } else {
            Balance -= amt;
            System.out.println("Amount withdrawn successfully. New balance: " + Balance);
        }
    }
}