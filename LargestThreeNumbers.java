package shalem.edu;

import java.util.Scanner;

public class LargestThreeNumbers {

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number 1");
		num1=sc.nextInt();
		System.out.println("enter the number 2");
        num2=sc.nextInt();
        System.out.println("enter the number 3");
        num3=sc.nextInt();
        if(num1 > num2 && num1 > num3)
        {
        	System.out.println(+num1+ " is grater than "+num2+ " and " +num3);
        }
        else if (num2 > num3)
        {
        	System.out.println(+num2+ " is grater than " +num1+ " and " +num3);
        }
        else
        {
        	System.out.println(+num3+ " is grater than "+num1+ " and " +num2);
        	
        }
        sc.close();

	}

}
