package com.java.tutorials.functionalInterface;

@FunctionalInterface
interface Printable{
	void print(String msg);
}

public class CustomFunctionalInterface {

	public static void main(String[] args) {
		
		Printable printable=(x)->System.out.println("The message is "+x);
		
		printable.print("Hi");
	}

}
