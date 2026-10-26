/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        
		
        System.out.println("Do u wanna gamble?");
		String q = sc.nextLine();

		if(!q.equals("yes") && !q.equals("Yes")&& !q.equals("y")&& !q.equals("Y") ){ 
		System.out.println("Wise choice not playing as luck is a unreliable companion.");}

		else if(q.equals("yes")|| q.equals("Yes")|| q.equals("y")|| q.equals("Y")){


        int balance = 100;
        boolean keepPlay = true;
        
        System.out.println("Welcome to the Digital Slot Machine!");
        System.out.println("You start with $" + balance + " dollarssss!");
        
        while (keepPlay && balance > 0) {
            System.out.print("Enter your wager | Current Balance: $" + balance);
            int wager = sc.nextInt();
            
            while (wager <= 0 || wager > balance) {
                System.out.print("U messed it all up. Please enter an number between 1 and $" + balance);
                wager = sc.nextInt();
            }
            
            balance = balance - wager;
            
            int num1 = (int)(Math.random()*9) + 1;
            int num2 = (int)(Math.random()*9) + 1;
            int num3 = (int)(Math.random()*9) + 1;
            
            System.out.println("Rolling = [ " + num1 + " ] [ " + num2 + " ] [ " + num3 + " ]");
            
            
            if (num1 == num2 && num2 == num3) {
                // Jackpot
                int winnings = wager * 3;
                balance += winnings;
                System.out.println("yay you got a jackpot! You won $" + winnings + "!");
            } else if (num1 == num2 || num1 == num3 || num2 == num3) {
                // Double
                int winnings = wager * 2;
                balance += winnings;
                System.out.println("W! 2 num match! You won $" + winnings + "!");
            } else {
                // Subtract
                System.out.println("Get better kid. You lost your wager of $" + wager + ".");
            }
            
            System.out.println("Current Balance: $" + balance);
            
            if (balance <= 0) {
                System.out.println("You ran out of money! Dont come back soon! - Now read this: Hark, for the casting of the die is a sweet poison that doth infect the soul with a most desperate frenzy! In the dim-lit taverns where the dice tumble and the cards are dealt, a man doth wager not merely his gold, but his very virtue and estate, chasing after the fickle smiles of Lady Fortune. This pernicious vice, this monstrous itch of play, stripth the gallant of his patrimony and clothth him in the ragged weeds of beggary. It breedeth a swarm of foul corruptions—false oaths, midnight brawls, and the blackest despair—turning noble wits into hollow knaves who barter their honor for a fleeting throw. Thus, by the alluring hazard of a single hour, a house built upon generations of virtue is brought to sudden ruin, leaving the wretched gamester to weep in the shadow of the gallows or rot in the debtor's gaol.");
                break;
            }
		}
        }
        
        
	}
}
