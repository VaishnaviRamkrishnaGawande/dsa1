package com.demo.test;

import com.demo.linkedlist.DoublyLinkedList;

public class TestDLL {
	public static void main(String[] args) {
		DoublyLinkedList lst=new DoublyLinkedList();
		lst.addNode(2);
		lst.addNode(4);
		lst.addNode(5);
		lst.addNode(6);
		lst.display();
		System.out.println("-----------");
		lst.addBypos(10, 3);
		lst.display();
		System.out.println("-----------");
		lst.deleteBypos(2);
		lst.display();
		System.out.println("-----------");
		lst.addBeforeKey(12, 4);
		lst.display();
	}
	
	
	

}
