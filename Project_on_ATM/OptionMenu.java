package Project_on_ATM;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
		
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$',###,##0.00");
	
	HashMap <Integer, Integer> data = new HashMap<Integer, Integer>();
	
	public void getLogin() throws IOException{
		int x=1;
		 do {
			try {
				data.put(123456, 4214);
				System.out.println("Welcome in Avengers ATM"+"\n");
				System.out.print("Enter your Customer Number: ");				
				setCustomerNumber(menuInput.nextInt());
				
				System.out.print("Enter your Pin Number: ");
				setPinNumber(menuInput.nextInt());
			}
			catch(Exception e){
				System.out.println("Enter numbers only");
				x=2;
			}
			int cn = getCustomerNumber();
			int pn = getPinNumber();
			if(data.containsKey(cn) && data.containsValue(pn)) {
				getAccountType();
			}
			else {
				System.out.println("\n"+"Wrong Customer number or Pin number"+"\n");
			}
		 }
		 while(x==1);
	}
	
	public void getAccountType() {
		System.out.println("\n"+"Select Account you want to Access: ");
		System.out.println("Type 1: Checking Account");
		System.out.println("Type 2: Saving Account");
		System.out.println("Type 3: Exit");
		
		int selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			getChecking();
			break;
			
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("\n"+"Thank you for using this ATM."+"\n");
			break;
			
		default:
			System.out.println("\n"+"Invalid Choice."+"\n");
			break;
		}
	}
	
	public void getChecking() {
		System.out.println("\n"+"Checking Account: ");
		System.out.println("Type 1: View Balance");
		System.out.println("Type 2: Withdraw money");
		System.out.println("Type 3: Deposit money");
		System.out.println("Type 4: Exit");
		
		int selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Checking account balance: "+moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
			
		case 2:
			getCheckingWithdrawInput();
			break;
			
		case 3:
			getCheckingDepositInput();
			break;
			
		case 4:
			System.out.println("\n"+"Thank you for using this ATM."+"\n");
			break;
			
		default:
			System.out.println("\n"+"Invalid Choice."+"\n");
			break;
		}
	}
	
	public void getSaving() {
		System.out.println("\n"+"Saving Account: ");
		System.out.println("Type 1: View Balance");
		System.out.println("Type 2: Withdraw money");
		System.out.println("Type 3: Deposit money");
		System.out.println("Type 4: Exit");
		
		int selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Saving account balance: "+moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
			
		case 2:
			getSavingWithdrawInput();
			break;
			
		case 3:
			getSavingDepositInput();
			break;
			
		case 4:
			System.out.println("\n"+"Thank you for using this ATM."+"\n");
			break;
			
		default:
			System.out.println("\n"+"Invalid Choice."+"\n");
			break;
		}
	}
}
