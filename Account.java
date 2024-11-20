import java.util.*;

public class Account{
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	Account(){
		this(0,0);
	}
	Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	public int getId(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	public double getMonthlyInterest(){
		return balance * (annualInterestRate/12/100);
	}
	public void withdraw(double amount){
		balance -= amount;
	}
	public void deposit(double amount){
		balance += amount;
	}
}