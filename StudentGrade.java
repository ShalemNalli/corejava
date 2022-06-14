package shalem.edu;
import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		
	    int mark;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mark :");
		mark=sc.nextInt();
		if(mark>90 && mark<=100)
		{
		System.out.println("Grade A");
		}
		else if (mark>60 && mark<=89)
		{
		System.out.println("Grade B");
		}
		else if (mark>40 && mark<=59)
		{
		System.out.println("Grade C");
		}
		else if (mark>=0 && mark<=39)
		{
		System.out.println("Grade D");
		
		}
		else
		{
		System.out.println("Fail");
	    }
		sc.close();
        }
	}


