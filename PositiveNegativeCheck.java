package shalem.edu;

import java.util.Scanner;

public class PositiveNegativeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		num=sc.nextInt();
		if(num>0) {
			System.out.println(num+" is positive");
			
		}
		else {
			System.out.println(num+" is nagative");
		}
		sc.close();
	}

}

