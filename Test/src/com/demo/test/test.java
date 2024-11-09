package com.demo.test;

public class test {

	public static void main(String[] args) {
	
		int sum=0;
		int n=1234;
		int r;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		System.out.println(sum);
	}

}
