package com.demo.test;

import com.demo.beans.SinglyLinkedList;
public class TestSLL {
	public static void main(String[] args) {
		SinglyLinkedList lst=new SinglyLinkedList();
		lst.addNode(4);
		lst.addNode(10);
		lst.addNode(60);
		lst.displayAll();
		lst.deleteByval(4);
		lst.displayAll();
		lst.addByPos(30, 2);
		lst.displayAll();
		
	}

}
