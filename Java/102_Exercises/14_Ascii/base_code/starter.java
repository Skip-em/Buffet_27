/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Welcome to the museum, where do u wanna visit?");
		System.out.println("1. Logos");
		System.out.println("2. Nature");
		System.out.println("3. Computer");

		String choice = sc.nextLine();

		if(choice.equals("Logos") || choice.equals("logos") ){
		System.out.println("do u wanna see the caduceus or coca-cola Logo?");

		String logoc = sc.nextLine();

			if(logoc.equals("caduceus") || logoc.equals("Caduceus")){
			System.out.println("(`-._o_.-')");
			System.out.println(" `--.|.--'");
			System.out.println("   ( | )");
			System.out.println("    (|)");
			System.out.println("    (|)");
			System.out.println("    '|`");	
			} else if(logoc.equals("coca") || logoc.equals("coca-cola") || logoc.equals("coca cola") || logoc.equals("Coca cola")){
			System.out.println("         __                              ___   __        .ama     ,");
			System.out.println("      ,d888a                          ,d88888888888ba.  ,88`I)   d");
			System.out.println("     a88']8i                         a88\".8\"8)   `\"8888:88  \" _a8'");
			System.out.println("   .d8P' PP                        .d8P'.8  d)       8:88:baad8P'");
			System.out.println("  ,d8P' ,ama,   .aa,  .ama.g ,mmm  d8P' 8  .8'        88):888P'");
			System.out.println(" ,d88' d8[ \"8..a8\"88 ,8I\"88[ I88' d88   ]IaI\"        d8[");
			System.out.println(" a88' ]P \"m8mP8'(8'.8I  8[      d88'    `\"         .88");
			System.out.println(",88I ]P[  .I'.8     88' ,8' I[  ,88P ,ama    ,ama,  d8[  .ama.g");
			System.out.println("[88' I8, .I' ]8,  ,88B ,d8 aI   (88',88\"8)  d8[ \"8. 88 ,8I'88[");
			System.out.println("]88  `8888\"  '8888\" \"88P\"8m\"    I88 88[ 8[ ]P \"bm8m88[.8I  8[");
			System.out.println("]88,          _,,aaaaaa,_       I88 8\"  8 ]P[  .I' 88 88' ,8' I[");
			System.out.println("`888a,.  ,aadd88888888888bma.   )88,  ,]I I8, .I' )88a8B ,d8 aI");
			System.out.println("  \"888888PP\"'        `8\"\"\"\"\"\"8   \"888PP'  `8888\"  `88P\"88P\"8m\"");
			System.out.println();
			} else {
				System.out.println("not available");
			}



		} else {
				System.out.println("not available");
		}

		if(choice.equals("Nature") || choice.equals("nature") ){
					System.out.println("do u wanna see a rose or rain?");

		String natc = sc.nextLine();

			if(natc.equals("rose") || natc.equals("Rose")){
			System.out.println("             __");
			System.out.println("        _   / /|");
			System.out.println("       |// // /_/");
			System.out.println("       /_ | / __ ");
			System.out.println("          /_/__/           .-=='/~/}");
			System.out.println("   ____,__ /__,_____,______)/   /{~}}}");	
			System.out.println("   -,------,----,-----,---, '-' {{~}}");	
			System.out.println("                            '-==.  }/");
			} else if( natc.equals("rain") || natc.equals("Rain") ){
			System.out.println("      __   _");
			System.out.println("    _(  )_( )_");
			System.out.println("   (_   _    _)");
			System.out.println("  / /(_) (__)");
			System.out.println(" / / / / / /");
			System.out.println("/ / / / / /");
			} else {
			System.out.println("not available");	
			}


		}

		if(choice.equals("Computer") || choice.equals("computer") ){
					System.out.println("do u wanna see a computer or mouse?");

		String compc = sc.nextLine();

			if(compc.equals("computer") || compc.equals("Computer")){
			System.out.println("  .---------.");
			System.out.println("  |.-------.|");
			System.out.println("  ||>run#  ||");
			System.out.println("  ||       ||");
			System.out.println("  |\"-------'|etf");
			System.out.println(".-^---------^-.");
			System.out.println("| ---~   AMiGA|");
			System.out.println("\"-------------'");
			System.out.println("");
			} else if( compc.equals("mouse") || compc.equals("Mouse") ){
			System.out.println("   /");
			System.out.println(" __|_");
			System.out.println("|____|");
			System.out.println("|    |");
			System.out.println("|    |");
			System.out.println("\\____/");
			} else {
			System.out.println("not available");	
			}
		} 



	}
}
