/*
 *	Author:  AJ Splichal
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a = (int)(Math.random() * 10);
		int b = (int)(Math.random() * 101);
		double c = Math.random() * 1.6 + 2.5;
		double d = Math.random() * 576 + 14;

		System.out.println(a + ", " + b + ", " + c + ", " + d);

	}
}
