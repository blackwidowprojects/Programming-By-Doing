import java.util.Scanner;

public class RightTriangle
{
    public static void main ( String[] args )
    {
        // Write a program to allow the user to enter three integers. 
        // You must use do-while or while loops to enforce that these 
        // integers are in ascending order, though duplicate numbers are allowed.

        // Tell the user whether or not these integers would represent the sides of a right triangle.
    
        Scanner keyboard = new Scanner(System.in);
        
        int sideOne, sideTwo, sideThree;
        
        System.out.println( "We're going to make a right triangle!" );
        System.out.println( "Enter the length of its sides..." );
        
        System.out.print( "Side 1: " );
        sideOne = keyboard.nextInt();
        
        System.out.print( "Side 2: " );
        sideTwo = keyboard.nextInt();
        while ( sideTwo < sideOne )
        {
            System.out.println( sideTwo + " is smaller than " + sideOne + ". Try again!" );
            System.out.print( "Side 2: " );
            sideTwo = keyboard.nextInt();
        }
        
        System.out.print( "Side 3: " );
        sideThree = keyboard.nextInt();
        while ( sideThree < sideTwo )
        {
            System.out.println( sideThree + " is smaller than " + sideTwo + ". Try again!" );
            System.out.print( "Side 3: " );
            sideThree = keyboard.nextInt();
        }
        
        System.out.println( "Your three sides are " + sideOne + " " + sideTwo + " " + sideThree + "." );
        
        int pythagoreans = ((sideOne*sideOne) + (sideTwo*sideTwo));
        
        if ( pythagoreans == (sideThree*sideThree))
        {
            System.out.println( "These sides *DO* form a right triangle!" );
        }
        else
        {
            System.out.println( "These sides do not form a right triangle..." );
        }
        
    }
}