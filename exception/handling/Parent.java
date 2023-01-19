package com.exception.handling;

public class Parent {
	void display()throws Exception  {
		System.out.println("parent");
	}
}
class Child extends Parent{
	void diplay()throws Exception{
		System.out.println("Child");
	}
	
	public static void main(String[] args)throws Exception {
		Parent obj = new Child();
	
		obj.display();

	}
}
