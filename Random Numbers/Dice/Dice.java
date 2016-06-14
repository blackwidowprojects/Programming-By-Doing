import java.util.Scanner;
import java.util.Random;

public class Dice
{
    public static void main ( String[] args )
    {
    
        // Write a program that simulates a dice roll by picking a random number from 1-6 
        // and then picking a second random number from 1-6. 
        // Add the two values together, and display the total.
    
        Random r = new Random();
        
        int rollOne = 1 + r.nextInt(6);
        int rollTwo = 1 + r.nextInt(6);
        
        int sum = rollOne + rollTwo;
        
        System.out.println( "Dice Roll! GO!" );
        System.out.println( "" );
        System.out.println( "Roll one: " + rollOne );
        System.out.println( "Roll two: " + rollTwo );
        System.out.println( "The total is " + sum + "!" );
        
        while ( rollOne != rollTwo )
        {
            rollOne = 1 + r.nextInt(6);
            rollTwo = 1 + r.nextInt(6);
            
            sum = rollOne + rollTwo;
            System.out.println( "" );
            System.out.println( "Roll one: " + rollOne );
            System.out.println( "Roll two: " + rollTwo );
            System.out.println( "The total is " + sum + "!" );
        }
        
    }
}