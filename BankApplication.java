package shalem.edu;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		
			float amount, dpamount, wdamount;
			amount = 5000;
			int choice;
			Scanner sc=new Scanner(System.in);
			System.out.println("-----------Menu----------");
			
			System.out.println("Select 1 for Deposit");
			System.out.println("Select 2 for withdrawal");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			System.out.println("Enter the amount to Deposite ");
			dpamount=sc.nextFloat();
			amount=amount+dpamount;
			System.out.println("Balance amount after deposite "+amount);
			break;
			
			case 2:
			System.out.println("Enter the amount to withdraw ");
			wdamount=sc.nextFloat();
			if(wdamount>amount)
			{
			System.out.println("Insufficient Balance");
			}
			else
			{
			amount = amount-wdamount;
			System.out.println("Balance amount after withdrawal : "+amount);
			}
			break;
			default:
			System.out.println("Invalid choice");
			break;
			}
			sc. close();	

	}

	
	
}