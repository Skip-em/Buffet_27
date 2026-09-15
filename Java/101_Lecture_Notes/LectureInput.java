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

        System.out.println("1. DoubleDouble: " + doubledouble);
        System.out.println("2. Animal Style fries: " + animalstyle);
        System.out.println("3. Vinilla shake: " + vinShake);

        //

        System.out.println("How many DoubleDoubl's would u like?");
        Scanner sc = new Scanner(System.in);

        int doubledoubleQuant = sc.nextInt();
        System.out.println("Item 1 total is: " + (doubledoubleQuant*doubledouble));
	}
}
