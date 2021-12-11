package com.java.tutorials.lambda;

interface CalC {
	// void switchOn();
	// void sum(int z);
	//int mul(int a, int b);
	int sub(int a,int b);
}

public class Calculator {

	public static void main(String[] args) {

		/*
		 * CalC c=()->System.out.println("Switch On"); c.switchOn();
		 */

		/*
		 * CalC c=(y)->System.out.println("This is "+y); c.sum(11);
		 */

		
		/*
		 * CalC c = (x, y) -> (x * y); System.out.println("The result is " + c.mul(10,
		 * 12));
		 */
		
		CalC c=(x,y)->{
			if(x<y) {
				throw new RuntimeException("message");
			}else {
				return x-y;
			}
		};
		System.out.println("Result is "+c.sub(100, 20));
	
	}

}
