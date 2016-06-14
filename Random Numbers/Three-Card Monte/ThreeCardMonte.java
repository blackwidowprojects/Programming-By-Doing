import java.util.Scanner;
import java.util.Random;

public class ThreeCardMonte
{
    public static void main ( String[] args )
    {
    
        // This is the original "ball and cups" game where you try to find out
        // which cup has the ball under it. You may play with three cups and a ball, three
        // cards (two jacks and an ace), or three doors and a car. Basically, randomly
        // select a cup to hide the "ball". Let the player guess which cup hides the ball.
        // The player wins if they guess correctly.
        
        Random r = new Random();
        
        Scanner keyboard = new
        Scanner (System.in);
        
        int ace = 1 + r.nextInt(3);
        
        System.out.println();
        System.out.println( "You slide up to Fast Eddie's card table and plop down your cash." );
        System.out.println( "He glances at you out of the corner of his eye and starts shuffling." );
        System.out.println( "He lays down three cards." );
        System.out.println();
        System.out.println( "Which one is the ace?" );
        System.out.println();
        System.out.println( "       ##   ##   ##" );
        System.out.println( "       ##   ##   ##" );
        System.out.println( "       1    2    3" );
        System.out.print("");
        int guess = keyboard.nextInt();
        
        System.out.println();
        if ( guess == ace )
        {
            System.out.println( "You nailed it! Fast Eddie reluctantly hands over your winnings, scowling." );
        }
        else
        {
            System.out.println( "Ha! Fast Eddie wins again! The ace was card number " + ace + "." );
        }
        
        if ( ace == 1 )
        {            
            System.out.println( "       AA   ##   ##" );
            System.out.println( "       AA   ##   ##" );
            System.out.println( "       1    2    3" );
        }
        
        else if ( ace == 2 )
        {
            System.out.println( "       ##   AA   ##" );
            System.out.println( "       ##   AA   ##" );
            System.out.println( "       1    2    3" );
        }
        
        else if ( ace == 3 )
        {
            System.out.println( "       ##   ##   AA" );
            System.out.println( "       ##   ##   AA" );
            System.out.println( "       1    2    3" );            
        }
        
    }
}