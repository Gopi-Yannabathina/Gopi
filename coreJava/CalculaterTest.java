package com.coreJava;

class Calculater {
public void add(double a, double b) {
	System.out.println("Addition:"+(a+b));
}
	
}

public class CalculaterTest{
    static Calculater cal = new Calculater();
    public static void addtTest(double a, double b)
    {
    	cal.add(a,b);
    }
    
    public static void main(String[] args) {
       addtTest(20.5,10.6);
    }
}
