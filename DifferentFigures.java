package shalem.edu;


import java.util.Scanner;

public class DifferentFigures {

	public static void main(String[] args) {
		float length,breadth,base,height,radius, side, area;
		int option;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("-----------Area----------");
		
		System.out.println("1 for rectangle");
		System.out.println("2 fer circle");
		System.out.println("3 for triangle");
		System.out.println("4 for Square");
		System.out.println("Enter your option =");
		option=sc.nextInt();
		
		switch(option) {
		
		case 1:
			System.out.println("Enter length and breadth:");
			length=sc.nextFloat();
			breadth=sc.nextFloat();
			area=length*breadth;
			System.out.println("area of rectangle :" +area );
			break;
			
			case 2:
				System.out.println("Enter the radius:");
				radius=sc.nextFloat();
				area=3.14f* radius*radius;
				System.out.println("area of circle :" +area );
				break;
				
			case 3:
				System.out.println("Enter base and height:");
				base=sc.nextFloat();
				height=sc.nextFloat();
				area=0.5f*base*height;
				System.out.println("area of triangle :" +area );
				break;
			case 4:
				System.out.println("Enter side:");
				side=sc.nextFloat();
				area=side*side;
				System.out.println("area of square :" +area );
				break;	
		 
		}
		sc.close();
		
		}
}