/*Program to Check Input number is Zero or not

 */
package shalem.edu;
import java.util.Scanner;
public class IfExample {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		num=sc.nextInt();
		if(num==0) {
			System.out.println("The entered number is zero");
			
		}
		else {
			System.out.println(num+"The entered number is not equal to zero");
		}
		sc.close();

	}

}
