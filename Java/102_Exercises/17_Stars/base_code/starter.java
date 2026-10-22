/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter width");
		int w = sc.nextInt();
		System.out.println("enter height");
		int h = sc.nextInt();


		int w2 = 0;
		int h2 = 0;
		String w3 = "*";

		while(w>=w2){
			w3= "*" + w3;
			w2++;
			if(w2==w){break;}
		}  

		while(h>h2){
		System.out.println(w3);
		h2++;
		}

		
		System.out.println("---------------------------");
		System.out.println("Star !");

		System.out.println("enter height for star");
		int sh = sc.nextInt();

		int sh2 = 0;
		String s1 = "*";


		while(sh2 < sh){
			System.out.println(s1);
			s1= s1 + "*";
			sh2++;
		}  

		System.out.println("enter height for reverse star");
		int r = sc.nextInt();
		String space = " ";
		Sring rs = "*";
		int r2 = 0;

		while(r>r2){
			space = space*(r-r2);
			rs= rs
			System.out.println((space+ );



			r2++;
		}





		}


}


