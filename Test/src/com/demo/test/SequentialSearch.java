package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

public class SequentialSearch{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,120,14,120};
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter element to find");
		int key=sc.nextInt();
		boolean status=sequentailSerach(arr,key);
		if(status)
		{
			System.out.println("Element found");
		}
		else
			System.out.println("Not found "+key);
	}

	private static boolean sequentailSerach(int[] arr, int key) {
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