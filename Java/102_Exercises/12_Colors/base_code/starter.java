/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
        System.out.println("random color:");
        int red = (int)(Math.random()*256);
        int blue = (int)(Math.random()*256);
        int green = (int)(Math.random()*256);

        getColor(red, blue, green);
        getColor((255-red), (255-blue), (255-green));

        System.out.println();
        System.out.println("random dark color:");
        int dred = (int)(Math.random()*129);
        int dblue = (int)(Math.random()*129);
        int dgreen = (int)(Math.random()*129);

        getColor(dred, dblue, dgreen);

        System.out.println();
        System.out.println("random light color:");
        int lred = (int)(Math.random()*128+127);
        int lblue = (int)(Math.random()*128+127);
        int lgreen = (int)(Math.random()*128+127);

        getColor(lred, lblue, lgreen);

        System.out.println();
        System.out.println("random blue-ish color:");
        int bred = (int)(Math.random()*128);
        int bblue = (int)(Math.random()*128+127);
        int bgreen = (int)(Math.random()*128);
        getColor(bred, bgreen, bblue);

        System.out.println();
        System.out.println("my own random color:");
        int mred = (int)(Math.random()*128+127);
        int mblue = (int)(Math.random()*128);
        int mgreen = (int)(Math.random()*128);
        // java starter
        getColor(mred, mgreen, mblue);
		// Call getColor(#, #, #);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
    }
}
