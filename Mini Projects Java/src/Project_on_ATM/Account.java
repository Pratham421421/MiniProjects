package Project_on_ATM;

import java.text.DecimalFormat;
import java.util.Scanner;
	
public class Account {
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance;
	private double savingBalance;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$',###,##0.00");
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	public double calCheckingWithdraw(double amount) {
		checkingBalance = checkingBalance - amount;
		return checkingBalance;
	}
	
	public double calSavingWithdraw(double amount) {
		savingBalance = savingBalance - amount;
		return savingBalance;
	}
	
	public double calCheckingDeposit(double amount) {
		checkingBalance = checkingBalance + amount;
		return checkingBalance;
	}
	
	public double calSavingDeposit(double amount) {
		savingBalance = savingBalance + amount;
		return savingBalance;
	}
	
	public void getCheckingWithdrawInput() {
		System.out.println("Checking account balance: "+moneyFormat.format(checkingBalance));
		System.out.print("Enter withdrawing amount: ");
		double amount = input.nextDouble();
		
		if((checkingBalance - amount)>=0) {
			calCheckingWithdraw(amount);
			System.out.println("\n"+"Checking account balance: "+moneyFormat.format(checkingBalance)+"\n");
		}
		else {
			System.out.println("\n"+"insufficient Balance"+"\n");
		}
	}
	
	public void getSavingWithdrawInput() {
		System.out.println("Saving account balance: "+moneyFormat.format(savingBalance));
		System.out.print("Enter withdrawing amount: ");
		double amount = input.nextDouble();
		
		if((savingBalance - amount)>=0) {
			calSavingWithdraw(amount);
			System.out.println("\n"+"Saving account balance: "+moneyFormat.format(savingBalance)+"\n");
		}
		else {
			System.out.println("insufficient balance / amount cannot negative");
		}
	}
	
	public void getCheckingDepositInput() {
		System.out.println("Checking account balance: "+moneyFormat.format(checkingBalance));
		System.out.print("Enter Depositing amount: ");
		double amount = input.nextDouble();
		
		if((checkingBalance + amount)>=0) {
			calCheckingDeposit(amount);
			System.out.println("\n"+"Checking account balance: "+moneyFormat.format(checkingBalance)+"\n");
		}
		else {
			System.out.print("amount cannot be negative");
		}
	}
	
	public void getSavingDepositInput() {
		System.out.println("Saving account balance: "+moneyFormat.format(savingBalance));
		System.out.print("Enter Depositing amount: ");
		double amount = input.nextDouble();
		
		if((savingBalance + amount)>=0) {
			calSavingDeposit(amount);
			System.out.println("\n"+"Saving account balance: "+moneyFormat.format(savingBalance)+"\n");
		}
		else {
			System.out.println("amount cannot be negative");
		}
	}
}
