/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter an integer: "); 
		int a = sc.nextInt();

		System.out.print("Please enter another integer(bigger than the first): "); 
		int b = sc.nextInt();
		System.out.println();

		System.out.println("your randge is " + a + " to "+ b);
		System.out.println("Here are 5 numbers generated in that range.");
		System.out.print((int)(Math.random()*(b-a)+a));
		System.out.print(", ");
		System.out.print((int)(Math.random()*(b-a)+a));
		System.out.print(", ");
		System.out.print((int)(Math.random()*(b-a)+a));
		System.out.print(", ");
		System.out.print((int)(Math.random()*(b-a)+a));
		System.out.print(", ");
		System.out.println((int)(Math.random()*(b-a)+a));

	}
}
