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

		System.out.print("guess a rondom num between 1-1000: "); 
		int guess = sc.nextInt();

		if(guess == num) {
			System.out.println("u won");
		}
		else{
			System.out.println("u lost, the number was: " + num);
		}
	}
}
