package com.demo.HashingLinkList;

import java.util.Scanner;

public class MyHashingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
		HashingLinkList []hashtable=new HashingLinkList[num];
		for(int i=0;i<hashtable.length;i++)
		{
			hashtable[i]=new HashingLinkList();
		}
		display(hashtable);
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
	
			System.out.println("1.Add \n2Delete \n3. Search \n4.Exit \nChoice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1->{
				System.out.println("Enter value");
				int val=sc.nextInt();
				addData(hashtable,val);
				display(hashtable);
			}
			case 2 ->
			{
				System.out.println("Enter value");
				int val=sc.nextInt();
				boolean status=delete(hashtable,val);
				if(status)
				{
					System.out.println("Deleted successfully!!!");
					
				}
				else
				{
					System.out.println("Not found");
				}
				display(hashtable);
			}
			case 3->
			{
				System.out.println("Enter value to find");
				int val=sc.nextInt();
				boolean status=Serach(hashtable,val);
				if(status)
				{
					System.out.println("Value found");
				}
				else
				{
					System.out.println("Not found");
				}
			}
			case 4 ->
			{
				System.out.println("Thanks for visiting !!!!");
				sc.close();
			}
			}
		}while(choice!=-1);
	}

	private static void display(HashingLinkList[] hashtable) {
		for(int i=0;i<hashtable.length;i++)
		{
			System.out.println(i+"--->");
			hashtable[i].display();
			System.out.println();
		}
		System.out.println("------------------------");
		
	}

	private static boolean Serach(HashingLinkList[] hashtable, int data) {
		int bucket=data%hashtable.length;
		return hashtable[bucket].Search(data);
	}

	private static boolean delete(HashingLinkList[] hashtable, int data) {
		int bucket=data%hashtable.length;
		return hashtable[bucket].delete(data);
	}

	private static void addData(HashingLinkList[] hashtable, int data) {
		int bucket=data%hashtable.length;
		hashtable[bucket].add(data);
	}

}
