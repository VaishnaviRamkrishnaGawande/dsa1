package com.demo.test;

import com.demoQueue.Employee;
import com.demoQueue.MyCircularQueue;

public class TestCircularQueue {

	public static void main(String[] args) {
		MyCircularQueue emp=new MyCircularQueue(3);
		emp.Enqueuee(new Employee(1,"Vaish","Pune"));
		emp.Enqueuee(new Employee(2,"Ayush","Pune"));
		emp.Enqueuee(new Employee(3,"Shivani","Pune"));
		while(!emp.isEmpty()) {
			System.out.println("Data"+emp.Dequeuee());
		}
		emp.Enqueuee(new Employee(5,"Shivani","Pune"));
		
		while(!emp.isEmpty()) {
			System.out.println("Data"+emp.Dequeuee());
		}

	}

}
