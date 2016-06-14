import java.util.Scanner;
import java.util.Random;

public class HiLo
{
    public static void main ( String[] args )
    {
    
        // Write a program that picks a random number from 1-100. 
        // Give the user a chance to guess it. If they get it right, tell them so. 
        // If their guess is higher than the number, say "Too high." 
        // If their guess is lower than the number, say "Too low." Then quit.
    
        Random r = new Random();   
		
		Scanner keyboard = new
		Scanner (System.in);
		
        int number = 1 + r.nextInt(100);
        
        System.out.println( "I'm thinking of a number between 1 and 100. Try to guess it!" );
        System.out.print( "Your guess: " );
        int guess = keyboard.nextInt();
        
        if ( guess < number )
        {
            System.out.println( "Sorry, you are too low. I was thinking of the number " + number + "." );
        }
        
        else if ( guess > number )
        {
            System.out.println( "Sorry, you are too high. I was thinking of the number " + number + "." );
        }
        
        else if ( guess == number )
        {
            System.out.println( "You guessed it correctly!" );
        }
    }
}