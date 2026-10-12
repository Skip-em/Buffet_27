/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello great Hero, what is they name?"); 
		String name = sc.nextLine();
		System.out.println("By what title art thou known?"); 
		String title = sc.nextLine();

		System.out.println("Do you want to be a Wizard, Warrior, or Rogue?"); 
		String c = sc.nextLine();

		if( c.equals("wizard") || c.equals("Wizard")){
			System.out.println("You have chosen Wizard! Magic!"); 
		}
		else if( c.equals("Warrior") || c.equals("warrior")){
			System.out.println("You have chosen Warrior! For Honor!"); 
		}
		else if( c.equals("Rogue") || c.equals("rogue")){
			System.out.println("You have chosen Rogue! That sound like a french word!"); 
		} else {
			System.out.println("I do not know such class"); 
		}
		System.out.println("");
		System.out.println("U have 20 skill points to spend in the following: Strength, Dexterity, Intelligence,Constitution, and Charisma. Your fate lies with these points so do not spend the foolishly.");
		int points = 20;
		System.out.println("");

		System.out.print("Strength(0-10): ");
		int strength = sc.nextInt();
		if(strength > -1 && strength < 11) {
			points = points - strength;
			System.out.println("You have " + points + "left to spend.");
		} else  {
			System.out.println("Enter a number between 1-10");
			strength = sc.nextInt();
			if (strength > -1 && strength < 11 && strength <= points){
				points = points - strength;
				System.out.println("better, you now have "+ points + "left to spend.");
			} else { strength = 0;}
		} 
		
		System.out.println("Dexterity(0-10): ");
		int Dex = sc.nextInt();
		if(Dex > -1 && Dex < 11 && strength <= points) {
			points = points - Dex;
			System.out.println("u have "+ points + " left.");
		} else {
			System.out.println("Enter a number between 1-10, or less then the amount of points you have left");
			Dex = sc.nextInt();
			if (Dex > -1 && Dex < 11 && Dex <= points){
				points = points - Dex;
				System.out.println("better, you have "+ points + "left to spend.");
			} else { Dex = 0;}
		}	

		System.out.print("Inttelligence(0-10): ");
		int Int = sc.nextInt();
		if(Int > -1 && Int < 11 && points >= Int) {
			points = points - Int;
			System.out.println("You have " + points + " left to spend.");
		} else {
			System.out.println("Enter a number between 1-10, or then the amount of points you have left");
			Int = sc.nextInt();
			if (Int > -1 && Int < 11 && points >= Int){
				points = points - Int;
				System.out.println("better, you have "+ points + "left to spend.");
				
			} else { Int = 0;}
		}
		
		System.out.print("Charisma(0-10): ");
		int cha = sc.nextInt();
		if(cha > -1 && cha < 11 && points >= cha) {
			points = points - cha;
		} else {
			System.out.println("Enter a number between 1-10, or the amount of points you have left");
			cha = sc.nextInt();
			if (cha > -1 && cha < 11 && points >= cha){
				points = points - cha;
				System.out.println("better, you have "+ points + "left to spend.");
				
			} else { Int = 0;}
		}

		System.out.println("------------------------------");
		System.out.println("You are " + name + ", the " + title + " of la crescenta!");
		System.out.println("You are a " + c + " with the following stats!");
		System.out.println("Strength - " + strength);
		System.out.println("Dexterity - " + Dex);
		System.out.println("Intelligence - " + Int);
		System.out.println("Charisma - " + cha);
		System.out.println("");
		System.out.println("Good luck!");
	}
}
