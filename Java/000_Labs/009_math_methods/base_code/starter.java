/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		double n1 = Math.max(13-6*11, 30 % 7 * (-2));
		double n2 = Math.sqrt (3 * 8 + 31 % 7);
		double n3 = Math.pow (37 / 3, 35 % 21);
		double n4 = Math.max( Math.pow( 2,14%3) , Math.sqrt( 2*6) );

		System.out.print(n1+","+n2+","+n3+","+n4+",");
	}
}
