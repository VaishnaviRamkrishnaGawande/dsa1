package com.demo.dlltest;

import com.demo.dll.dll;

public class TestDll {
public static void main(String[] args) {
	dll lst=new dll();
	lst.AddNode(10);
	lst.AddNode(20);
	lst.display();
	System.out.println("...................");
	lst.AddAtPos(30,2);
	lst.display();
	System.out.println("...................");
	lst.displayInorder();
//	lst.display();
}

}
