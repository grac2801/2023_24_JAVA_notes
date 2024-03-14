package banking;

public class BankAccount
{
    private double balance;

    public BankAccount()
    {
        this.balance = 0;
    }

    public BankAccount(double accountBalance)
    {
        this.balance = accountBalance;
    }

    public void deposit(double amount)
    {
        this.balance += amount;
    }

    public void withdraw(double amount)
    {
        this.balance -= amount;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public void setBalance(double amount)
    {
        this.balance = amount;
    }
    
    public void print()
    { 
    	System.out.printf("My account balance is $%-6.2f", this.getBalance());
    }
}
