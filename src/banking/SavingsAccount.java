package banking;

public class SavingsAccount extends BankAccount
{
    private double interestRate;

    public SavingsAccount(double acctBalance, double rate)
    {
        super(acctBalance);
        this.interestRate = this.getInterestRate();
    }

    public void addInterest()
    {

    }

    public double getInterestRate()
    {
        return this.interestRate;
    }

    public void setInterestRate(double rate)
    {
        this.interestRate = rate;
    }
}
