/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter ur first num: ");
	int a = sc.nextInt();
	System.out.print("Enter ur second num: ");
	int b = sc.nextInt();
	System.out.print("Enter ur third num: ");
	int c = sc.nextInt();
	


	if(a > b || a > c){
		System.out.println("ur first num biggest");
	} 
	else if(b > a || b > c){
		System.out.println("ur second num biggest");
	}
	else if(c > b || c > a){
		System.out.println("ur third num biggest");
	}

	if(a < b || a < c){
		System.out.println("ur first num smallest");
	}
	else if(b < a || b < c){
		System.out.println("ur second num smallest");
	}
	else if(c < b || c < a){
		System.out.println("ur third num smallest");
	}
	else{
		System.out.println("u broke it gng");
	}

	}
}
