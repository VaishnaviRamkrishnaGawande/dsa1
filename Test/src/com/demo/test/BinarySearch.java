package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {10,12,13,14,16};
		Scanner sc=new Scanner(System.in);
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter element to find");
		int key=sc.nextInt();
//		int low=arr[0];
//		int high=arr.length-1;
		int status=BinarySearch(arr,0,arr.length-1,key);
		if(status!=-1)
		{
			System.out.println("Element found"+key);
		}
		else
			System.out.println("Not found");
		
	}
                                            
	private static int BinarySearch(int[] arr, int low, int high, int key) {
		int l=low;
		int h=high;
		if(l<=h)
		{
			int mid=(l+h)/2;
			
			if(arr[mid]==key)
			{
				return mid;
			}
			else if(arr[mid]>key)
			{
				return BinarySearch(arr,l,mid-1,key);
			}
			else
			{
				return BinarySearch(arr,mid+1,h,key);
			}
	}
		return -1;

		

	}

}
