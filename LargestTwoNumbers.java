package shalem.edu;
import java.util.Scanner;


public class LargestTwoNumbers {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number 1");
		num1=sc.nextInt();
		System.out.println("enter the number 2");
        num2=sc.nextInt();
        if(num1>num2)
        {
        	System.out.println(+num2+ " is grater than "+num1);
        }
        else {
        	System.out.println(+num1+ " is grater than "+num2);
        }
        sc.close();
	}

}
