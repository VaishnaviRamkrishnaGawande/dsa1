package com.demo.seraching;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6};
		int key;
		String ans=null;

		System.out.println(Arrays.toString(arr));
		do {
		System.out.println("Enter key");
		key=sc.nextInt();
		int low=0;
		int high=arr.length-1;
		int n=Binary_search(arr,low,high,key);
		if(n!=-1)
		{
			System.out.println("Value found");
		}
		else
			System.out.println("Not found "+key);
		System.out.println("Do you want to continue y/n");
		ans=sc.next();
		}while(ans.equals("y"));
	}

	private static int Binary_search(int[] arr, int low, int high, int key) {
		int l=low;
		int h=high;
		if(l<h)
		{
			int mid=(l+h)/2;
			if(arr[mid]==key)
			{
				return mid;
			}
			else if(arr[mid]>key)
			{
				return Binary_search(arr, low, mid-1, key);
			}
			else
			{
				return Binary_search(arr, mid+1, high, key);
			}
			
		}
		return -1;
	}


}
