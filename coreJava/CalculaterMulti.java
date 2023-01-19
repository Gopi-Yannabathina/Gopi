package com.coreJava;

class Multiple{
	public void multi(double a, double b) {
		System.out.println("Multipltiction:"+(a*b));
	}
}
public class CalculaterMulti {
	static Multiple cal = new Multiple();
	public static void multiTest(double a, double b)
	{
		cal.multi(a,b);
	
	}
	public static void main(String[] args) {
		
		multiTest(2.0,3.0);
	}
}