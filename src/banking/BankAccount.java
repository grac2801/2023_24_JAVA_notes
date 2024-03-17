package banking;

import java.text.DecimalFormat;

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
    	String answer = "";
    	answer += "My account balance is: $";
    	answer += Double.toString(this.getBalance());
    	System.out.printf("My account balance is $%s", answer);
    }
    
    public String toString()
    {
    	String answer = "";
    	answer += "My account balance is: $";
    	DecimalFormat df = new DecimalFormat("#,###.##");
    	
    	answer += df.format(this.getBalance());
    	return answer;
    }
}
