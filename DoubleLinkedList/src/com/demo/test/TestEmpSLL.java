package com.demo.test;

import com.demo.beans.Employee;
import com.demo.linkedlist.EmployeeSLL;

public class TestEmpSLL {

	public static void main(String[] args) {
		EmployeeSLL elst=new EmployeeSLL();
		elst.addNode(new Employee(1,"Ayush","Lonar"));
		elst.addNode(new Employee(2,"Apk","Nampur"));
		elst.addNode(new Employee(3,"Akash","ABD"));
		elst.displayAll();
		elst.deleteByID(3);
		elst.displayAll();
		elst.searchBiId(1);
		elst.displayAll();
		elst.searchBiId(7);
		

	}

}
