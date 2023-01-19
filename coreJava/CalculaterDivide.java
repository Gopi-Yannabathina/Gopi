package com.coreJava;

class Divide{
	public void divide(double a, double b) {
		System.out.println("Divide:"+(a/b));
	}
}
 public class CalculaterDivide{
	 static Divide cal = new Divide();
	 
	 public static void divideTest(double a, double b) {
		 cal.divide(a,b);
	 }
	 public static void main(String[] arg) {
		 divideTest(2.5,2.5);
	 }
 }