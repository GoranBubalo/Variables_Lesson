package variableLesson;

//<<<THEORY>>>
//----------------------------------------
//----------------------------------------
/*<<<VARIABLES>>>
 * - > Placeholder ( for value ) 
 * - > behaves as the value it contains 
 * 
 * 
 * x = 123 (number)
 * y = "Hello" (words)
 * z = true ( boolean value ) 
 * 
 *<<<DATA TYPES>>>
 *
 * => 8 PRIMITIVE DATA TYPES 
 * => 1 SPECIAL REFERENCE DATA TYPE ( String ) 
 * 
 * DATA TYPES |  Size   | primitive/ reference | value
 *  
 * ==>boolean	1 bit		primitive 			 true/false
 * byte 		1 byte 		primitive			 -128 to 127
 * short		2 bytes		primitive			 -38, 768 to 32, 767
 * ==>int		4 bytes		primitive			 -2 billion to 2 billion
 * long			8 bytes 	primitive			 -9 quintillion to 9 quintillion
 * 
 * float		4 bytes     primitive			 fractional number (up to 6-7 digits) ex. 3.141f
 *==>double		8 bytes 	primitive			 fractional number (up to 15 digits) ex. 3.14159
 * 
 *==>char		2 bytes	 	primitive			 single character/letter/ASCII value ex.'f'
 *==>String		varies		reference			 a sequence of characters ex. "Hello World!"
 *
 *---------------------------------------------------------------
 *
 *<<<PRIMITIVE>>>   			|   <<<REFERENCE>>>
 *8 types 		  					unlimited( user defined ) 
 *stores data	  					stores an address
 *can hold 1 value					could hold more than 1 value
 *less memory 						more memory  
 *fast 								slow
 * 
 * 
 * int x;		declaration +
 * x = 123;		assignmnet = 
 * int x = 123; initialization
 * 
 * ------------------------------------------------------------------------
 * */
public class Main {

	public static void main(String[] args) {

		int x = 123; // initialization
		System.out.print("X number is: " + x + " \n");
		// OR
		int y; // declaration
		y = 124; // assignment
		System.out.println("Y number is: " + y);
		// ------------------------------------------
		/*
		 * <<<LARGE NUMBER>>> - > USE DATA TYPE ======> long follow the number with a
		 * capital L ==> it indicates that the number is long ( LITERAL )
		 */
		long z = 123435467546878797L; // IMPORTANT!!!! == 97L< -- the symbol L
		System.out.print("A Large number: " + z + "\n");
		// ---------------------------------------------------------------
		/*
		 * <<<SMALL NUMBERS>>>
		 * 
		 * bytes AND short => don't really use as a Beginner =>bytes - > stores up to
		 * 127 -------------------------------------------------------------- <<<NUMBERS
		 * WITH FRACTIONAL PORTION>>> float OR double float - > 6 - 7 digits double - >
		 * 15 digits ( no need to indicate with a letter ) double has more precision
		 */
		float f = 3.43f; // IMPORTANT!!!
		System.out.print("float number: " + f + "\n");
		// OR
		double d = 34.64423231;
		System.out.println("double number: " + d);

		/*------------------------------------------------
		 * TRUE OR FALSE
		 * 
		 * boolean data type
		 *
		 * 
		 */

		boolean b = true;
		System.out.println("What you are saying is " + b);
		// ----------------------------------------------------
		/*
		 * <<CHARACTERS>>
		 * 
		 * char - > a symbol 
		 * */
		
		char symbol ='@';
		System.out.print(symbol + "\n");
		/*---------------------------------------------------------
		 * STRINGS ( REFERENCE DATA TYPE )
		 * - > Begins with a capital letter
		 * 
		 * */
		String name = "Goran";
		System.out.println("Hello "+ name);
		
		}

}
