package com.technoelevate.program;

public class Amstrong {

	public static void main(String[] args) {
		int n=153;
		int t1=n;
		int check=n;
		int count=0;
	
		int sum=0;
		int temp=n;
		
		
		while(t1!=0) {
			count++;
			t1=t1/10;
		}
		
	
		
		
		while(temp!=0) {
			int prod=1;
			int rem=temp%10;
			for(int i=1;i<=count;i++) {
			
			prod=prod*rem;
				
			}
			sum=sum+prod;
			temp=temp/10;
		}
		
		if( n==sum) 
			System.out.println("amstrong number");

		else 
			System.out.println("not a amstrong number");
		

}

}

