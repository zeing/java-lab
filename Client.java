import java.util.*;
class Client{
	public static void main(String[] args) {
		Account acc = new Account(1122,20000);
		acc.setAnnualInterestRate(4.5);
		acc.withDraw(2500);
		acc.deposit(3000);
		System.out.println(acc.getDate()+"	"+acc.getBalance()+"  " +acc.getMonthlyInterestRate());
		
	}
 }