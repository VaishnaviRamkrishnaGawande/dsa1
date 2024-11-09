package com.demo.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {12,54,9,105,2651};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-1;j++)
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
			
		}
		
	}

}
