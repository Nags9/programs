package com.technoelevate.program;

public class Max {

	public static void main(String[] args) {
    int a[]= {12,33,44,2};
    int max=a[0];
    for(int i=1;i<a.length;i++) {
    if(a[i]>max) {
    	max=a[i];
    }

	}
    System.out.println(max);

}
}
