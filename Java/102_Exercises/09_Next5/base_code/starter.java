/*
 *	Author: AJ
 *  Date: 9/15
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter a number");
		int finput = sc.nextInt();
		System.out.println("Here are the next five numbers:");
		System.out.println(finput+1);
		System.out.println(finput+2);
		System.out.println(finput+3);
		System.out.println(finput+4);
		System.out.println(finput+5);

		System.out.println("Enter another number");
		int sinput = sc.nextInt();
		System.out.println("Here are the next five multiples:");
		System.out.println(sinput*2);
		System.out.println(sinput*3);
		System.out.println(sinput*4);
		System.out.println(sinput*5);
		System.out.println(sinput*6);

		System.out.println("Enter another number");
		int foinput = sc.nextInt();
		System.out.println("Here is your number divided by 100:");
		System.out.println(foinput/100);

		System.out.println("Enter another number");
		int fiinput = sc.nextInt();
		System.out.println("Here is your number divided by 10:");
		System.out.println(fiinput/10);


	}
}
