package day6_arrays;

import java.util.Scanner;

//wap to ask size of two array from user .and take input in array from user 
//and perform sum of both array and store it in third array
public class Array_sum {

	public static void main(String[] args) {
		int size1,size2;
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter array1 size");
		size1=s.nextInt();
		System.out.println("enter array2 size");
		size2=s.nextInt();
		
		if(size1==size2)
		{
		int a[]= new int[size1];
		int b[]= new int[size2];
		int c[]= new int[size1];
		for(int i=0;i<size1;i++) {
			System.out.println("enter number");
			a[i]= s.nextInt();
			
		}
		for(int i=0;i<size1;i++) {
			System.out.println("enter second array number");
			b[i]= s.nextInt();
			
		}
		for(int i=0;i<size1;i++) {
			
			c[i]= a[i]+b[i];
			System.out.print( "  "+ c[i]);
		}
		
		}
		else
		{
			System.out.println(" two array size is different so sum cannot be performed ");
		}
	}
	

}
