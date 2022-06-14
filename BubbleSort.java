package shalem.edu;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int ar[];
		int temp=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size ");
		n=sc.nextInt();
		ar=new int[n];
		System.out.println("Enter the elements ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(ar[j]>ar[j+1])
				{
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			
		
			System.out.println( ar[i]+ " ");
			
		}
		sc.close();
	
 
	}

		
}
