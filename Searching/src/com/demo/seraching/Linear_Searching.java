package com.demo.seraching;

import java.util.Arrays;
import java.util.Scanner;

public class Linear_Searching {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,50,15,75};
		int key;
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter key");
		key=sc.nextInt();
		
		boolean status=LinearSearch(arr,key);
		if(status)
		{
			System.out.println("Found");
		}
		else
			System.out.println("Not found");
		
	}

	private static boolean LinearSearch(int[] arr, int key) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return true;
			}
		}
		return false;
	}
}
