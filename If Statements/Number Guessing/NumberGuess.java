import java.util.Scanner;

public class NumberGuess {
	public static void main ( String[] args ) {
		
		// Write a program that plays an incredibly stupid number-guessing game. The user will 
		// get one try to guess the secret number. Tell them if they got it right or wrong, and if they 
		// got it wrong, display what the secret number was.

		// You must store the secret number in a variable, and use that variable throughout. The secret 
		// number itself must not appear in the	program at all, except in the one line where you store it 
		// into a variable.
		
		Scanner keyboard = new
		Scanner (System.in);
		
		int randomNum = 5;
		int userNum;

		for ( int i=0; i<3; i++ ) {
		
			System.out.print( "I'm thinking of a number from 1 to 10. Try to guess what it is! " );
			userNum = keyboard.nextInt();
		
			if ( userNum == randomNum ) {
				System.out.println( "You guessed it correctly!" );
			}
			
			else {
				
				System.out.println( "Wrong! The secret number was " + randomNum );
				
				
			}
			
		}
		
	}
}