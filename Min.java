package com.technoelevate.program;

public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {12,33,44,2};
		    int min=a[0];
		    for(int i=1;i<a.length;i++) {
		    if(a[i]<min) {
		    	min=a[i];
		    }

			}
		    System.out.println(min);


	}

}
