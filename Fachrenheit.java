package shalem.edu;

import java.util.Scanner;

public class Fachrenheit {

	public static void main(String[] args) {
		float fahrenheit,celsius;
		
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        fahrenheit = sc.nextFloat();
        celsius = ((fahrenheit-32)*5)/9;
        
 
        System.out.println(" value of temperature in celsius:"+ celsius);
            
	    sc.close();   
	}

}
