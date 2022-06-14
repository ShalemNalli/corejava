package shalem.edu;

import java.util.Scanner;

public class DivisibilityTest {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		num=sc.nextInt();
		if(num%3==0 && num%5==0) {
			System.out.println(num+" divisible by 3 and 5");
		}
		else if(num%3==0) {
			System.out.println(num+" divisible by 3");
		}
		else if(num%5==0) {
			System.out.println(num+" divisible by 5");
		}
		else {
			System.out.println(num+" is not divisible by 3 and 5");
		}
       sc.close();

	}

}
