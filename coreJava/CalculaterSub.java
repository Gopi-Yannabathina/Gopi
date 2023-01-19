package com.coreJava;

class Subt{
	public void sub(double a, double b) {
		System.out.println("Subtract:"+(a-b));
	}
}

public class CalculaterSub{
	static Subt cal = new Subt();
	
	public static void subTest(double a,double b) {
		cal.sub(a,b);
	}
	public static void main(String[] args) {
		 subTest(24.2,18.3);
	}
} 





