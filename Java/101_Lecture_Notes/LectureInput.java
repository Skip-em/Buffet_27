/*
    Lecture note example - Input!!
*/

import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {

        double vinShake = 4.95;
        double doubledouble = 10.95;
        double animalstyle = 5.45;

        System.out.println("Welcome to In n out!");
        System.out.println(" Here's our menu:");

        System.out.println("1. DoubleDouble: $" + doubledouble);
        System.out.println("2. Animal Style fries: $" + animalstyle);
        System.out.println("3. Vinilla shake: $" + vinShake);

        //

        Scanner sc = new Scanner(System.in);

        System.out.println("How many DoubleDoubl's would u like?");
        int doubledoubleQuant = sc.nextInt();
        System.out.println("Item 1 total is: " + (doubledoubleQuant*doubledouble));

        System.out.println("How many Animal Style Fries would u like?");
        int animalstyleQuant = sc.nextInt();
        System.out.println("Item 2 total is: " + (animalstyleQuant*animalstyle));

        System.out.println("How many Vinilla Shakes would u like?");
        int vinShakeQuant = sc.nextInt();
        System.out.println("Item 2 total is: " + (vinShakeQuant*vinShake));


        double total = (((vinShakeQuant+0.0)*(vinShake+0.0))+((animalstyleQuant+0.0)*(animalstyle+0.0))+((doubledoubleQuant+0.0)*(doubledouble+0.0)));

        System.out.println("How much do you want to tip?");
        int tipQuant = sc.nextInt();
        System.out.println("Total is is: $" + ((total)+(total*((tipQuant+0.0)/100.0))));

        System.out.println(); 
        System.out.println("Thank you valued customer!"); 
	}
}
