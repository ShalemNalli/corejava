package shalem.edu;

import java.util.Scanner;

public class CelciusTemperature {

	public static void main(String[] args) {
		float fahrenheit,celsius;
	
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        celsius = sc.nextFloat();
    	fahrenheit = ((celsius*9)/5)+32;
 
        System.out.println(celsius+ " celsius is converted to " +fahrenheit+ "fahrenheit");
            
	    sc.close();   
		   	 

	}

}
