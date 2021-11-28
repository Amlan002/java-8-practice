package com.java.tutorials.lambda;

interface Drawable {
	void draw();
}
/*----------first------------*/
/*
 * class DrawableImple implements Drawable{
 * 
 * @Override public void draw() {
 * System.out.println("============Drawing1============");
 * 
 * }
 * 
 * }
 */

public class LabdaExample_WithoutParam {
	public static void main(String[] x) {
		/*----------first------------*/
		/*
		 * Drawable drawable=new DrawableImple(); drawable.draw();
		 */

		/*----------second------------*/
		/*
		 * Drawable drawable=new Drawable() {
		 * 
		 * @Override public void draw() {
		 * System.out.println("============Drawing2============");
		 * 
		 * } }; drawable.draw();
		 */
		/*----------third------------*/
		Drawable drawable=()->System.out.println("============Drawing3 using lambda============");
		drawable.draw();
	}
}
