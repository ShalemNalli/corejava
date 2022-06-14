package shalem.edu;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];  //declartion of an array
		int low,high, mid=0,n, key;
		int pos=-1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size");
		n=sc.nextInt();
		a=new int[n];
		
		//Enter array elements
		
		System.out.println("Enter the array elements in ascending order");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter key element");
		key=sc.nextInt();
		
		low=0;
		high=n-1;
		
		while(low<=high) {
			mid=(low+high)/2;
			
			if(a[mid]==key) {
				pos=mid;
				break;
			}
			
			else if(key<a[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
			
		}
		
		if(pos>=0) {
			System.out.println("Successful search");
			System.out.println(key +" found at position "+(mid+1));
		}
		else {
			System.out.println("unsuccessgful search");
			System.out.println(key+" not found");
			sc.close();
		}

	}
}
				

		
	


