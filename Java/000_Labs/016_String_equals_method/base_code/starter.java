/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Do you want to be a Wizard, Warrior, or Rogue?"); 
		String c = sc.nextLine();

		if( c.equals("wizard") || c.equals("Wizard")){
			System.out.println("You have chosen Wizard! Magic!"); 
		}
		if( c.equals("Warrior") || c.equals("warrior")){
			System.out.println("You have chosen Warrior! For Honor!"); 
		}
		if( c.equals("Rogue") || c.equals("rogue")){
			System.out.println("You have chosen Rogue! That sound like a french word!"); 
		}
	}
}
