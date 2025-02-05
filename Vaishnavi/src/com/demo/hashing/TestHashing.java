package com.demo.hashing;

import java.util.Scanner;

public class TestHashing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=7;
		Hashing [] hashtable=new Hashing[num];
		for(int i=0;i<hashtable.length ;i++) {
			hashtable[i]=new Hashing();
		}
		display(hashtable);
		int choice=0;
		do {
			System.out.println("1.Add \n 2.Search \n 3.Delete \n 4.Exit \n Enter choice : ");
			choice =sc.nextInt();
			switch(choice) {
			case 1 ->{
				System.out.println("Enter val");
				int val=sc.nextInt();
				add( hashtable,val);
				display(hashtable);
			}
			case 2->{
				System.out.println("Enter val");
				int val=sc.nextInt();
				boolean status =search(hashtable,val);
				if(status) {
					System.out.println("Found");
				}else {
					System.out.println("Not found");
				}
			}
			case 3->{
				System.out.println("Enter val");
				int val=sc.nextInt();
				boolean status=delete(hashtable,val);
				if(status) {
					System.out.println("Deleted");
				}else
				{
					System.out.println("not found");
				}
				display(hashtable);
			}
			}
		}while(choice!=4);

	}

	private static void display(Hashing[] hashtable) {
		for(int i=0;i<hashtable.length;i++) {
			hashtable[i].display();
			System.out.println(i+"--->");
		}
		System.out.println();
		
		
	}

	private static boolean delete(Hashing[] hashtable, int data) {
		int bucket=data%hashtable.length;
		return hashtable[bucket].delete(data);
	}

	private static boolean search(Hashing[] hashtable, int data) {
		int bucket=data%hashtable.length;
		return hashtable[bucket].search(data);
	}

	private static void add(Hashing[] hashtable, int data) {
		int bucket=data%hashtable.length;
		hashtable[bucket].add(data);
		
	}

}
