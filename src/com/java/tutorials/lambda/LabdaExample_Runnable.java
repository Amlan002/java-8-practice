package com.java.tutorials.lambda;

public class LabdaExample_Runnable {

	public static void main(String[] args) {
		Runnable runnable=()->System.out.println("=====Execute run==="+Thread.currentThread().getName());
		Thread thread=new Thread(runnable);
		thread.start();

	}

}
