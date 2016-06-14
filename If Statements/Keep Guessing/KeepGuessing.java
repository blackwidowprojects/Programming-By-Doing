import java.util.Scanner;
import java.util.Random;

public class KeepGuessing
{
    public static void main ( String[] args )
    {
		// Write a program that plays a number-guessing game. The user will 
		// get an infinite number of guesses. Tell them if they got it right or wrong

        Random r = new Random();
        
        Scanner keyboard = new
        Scanner (System.in);
        
        int randomNumber = 1 + r.nextInt(20);
        
        System.out.println( "I'm thinking of a number between 1 and 20. Try to guess it." );
        
        System.out.print( "Your guess: " );
        int guess = keyboard.nextInt();
        
        while ( guess != randomNumber )
        {
            if ( guess < randomNumber )
            {
                System.out.println( "Sorry, but that number is too low. Guess again." );
            }
            else if ( guess > randomNumber )
            {
                System.out.println( "Sorry, but that number is too high. Guess again." );
            }
            
            System.out.print( "Your guess: " );
            guess = keyboard.nextInt();
        }
        
        System.out.println( "You guessed it correctly!" );
    }

}