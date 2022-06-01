package shalem.edu;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		String name;
		double unit, bill , surch;
		Scanner sc= new Scanner(System.in);
		System.out.println("ELECTRICITY BILL");
		System.out.println("Enter Consumer name:");
		name= sc.next();
		System.out.println("Enter the number of units consumed");
		unit=sc.nextDouble();
		
		if(unit<=100)
		{
			bill=unit*2;	
		}
		else if(unit>100 && unit<=300)
		{
			bill=(100*2)+((unit-100)*3);		
		}
		else
		{
			bill=(100*2)+(200*3)+((unit-300)*5);
			surch=(bill*2.5)/100;
			bill=bill+surch;
		}
		
		System.out.println("Name of the consumer: "+name);
		System.out.println("Number of units consumed= "+unit);
		System.out.println("Your electricity bill is Rs."+bill);
		
		sc.close();

	}
  }
