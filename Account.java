import java.util.*;
class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	Account() {
		this.dateCreated = new Date();
	}
	Account(int id, double balance) {
		this.id=id;
		this.balance=balance;
		this.annualInterestRate=0.0;
		this.dateCreated = new Date();
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return this.balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate=annualInterestRate;
	}
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	public double getMonthlyInterestRate() {
		return this.annualInterestRate/12;
	}
	public double getMonthlyInterrest() {
		return  this.balance*(this.annualInterestRate/100);
    }
	public String getDate() {
		return this.dateCreated.toString();
	}
    public void withDraw(double draw) {
		if(this.balance>this.draw) 
			this.balance-=draw;
		else 
			System.out.println("CAN'T");
    }
    public void deposit(double draw) {
		this.balance+=draw;
    }
	
}