package com.java.tutorials.lambda;

interface Printable{
	void print(String message);
 }

interface PrintableAddition{
 	void printAddition(int a,int b);
}

interface PrintableMultiplication{
 	int printMultiplication(int a,int b);
}

public class LabdaExample_WithParam {

	public static void main(String[] args) {
		
		Printable printable=(msg)->System.out.println("======message is==="+msg);
		printable.print("I am Amlan");
		
		
		PrintableAddition addition=(x,y)-> System.out.println("Adition "+(x+y));
		addition.printAddition(10, 20);
		
		PrintableMultiplication multiplication=(a,b)->(a*b);
		System.out.println("=======multiplocation is ==="+multiplication.printMultiplication(15, 8));
		
		/*-- if multiple return statement , then add return --*/
		PrintableMultiplication multiplication2=(a,b)->{
			System.out.println("======input a is==="+a);
			System.out.println("======input b is==="+b);
			return (a*b);
			};
		System.out.println("=======multiplocation2 is ==="+multiplication.printMultiplication(12, 8));

	}

}
