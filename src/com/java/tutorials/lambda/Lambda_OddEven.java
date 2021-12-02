package com.java.tutorials.lambda;

@FunctionalInterface
interface evenOdd{
	void check(int a);
}

public class Lambda_OddEven {

	public static void main(String[] args) {
		
		evenOdd evenOdd=(x)->{
			if(x%2==0) {
				System.out.println(x +" is even");
			}else {
				System.out.println(x +" is odd");
			}
		};
		evenOdd.check(11);
	}

}
