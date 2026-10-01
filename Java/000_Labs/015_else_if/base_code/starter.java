/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num = (int)(Math.random()*1001);

		System.out.print("guess a random num between 1-1000: "); 
		int guess = sc.nextInt();

		if(guess == num) {
			System.out.println("u won!");
		}
		else if(num < guess){
			System.out.println("the num is lower, try again");
		}
		else if(num > guess){
			System.out.println("the num is higher, try again");
		}
	
	}
}
