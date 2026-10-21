/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*1000+1);
		System.out.println("pick a num between 1-1000");

		int guess = sc.nextInt();

		while(guess != num){
			if(guess< num){
			System.out.println("higher");
			guess = sc.nextInt();
			}
			else if(guess == num){
			System.out.println("u win!");
			break;
			}

			if(guess == num){
			System.out.println("u win!");
			break;

			}
		
			if(guess> num){
			System.out.println("lower");
			guess = sc.nextInt();
			}
			else if(guess == num){
			System.out.println("u win!");
			break;
			}

		}

		}
}
	