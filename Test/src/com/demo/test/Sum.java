package com.demo.test;

import java.util.Arrays;

public class Sum {
public static void main(String[] args) {
	int arr[]= {10,2,45,45,12};
	System.out.println(Arrays.toString(arr));
	int max=max(arr);
	System.out.println(max);
}

private static int max(int[] arr) {
	
	int max=arr[0];
	int count=0;
	for(int i=1;i<arr.length;i++)
	{
		if(max<arr[i])
		{
			max=arr[i];
		}
		if(arr[i]==max)
		{
			count++;
		}
		
	}System.out.println(count);
	return max;
	
}
}
