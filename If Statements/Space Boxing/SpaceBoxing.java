import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {
        
        // Ask what someones earth weight is, and enter a number for the planet he wants to fight on.  
        
        Scanner keyboard = new Scanner(System.in);
        
        double weight;
        int planet;
        
        System.out.println();
        
        System.out.print( "Please enter your current earth weight: " );
        weight = keyboard.nextDouble();
        
        System.out.println();
        
        System.out.println( "I have information for the following planets:" );
        
        System.out.println( "   1. Venus    2. Mars     3. Jupiter" );   System.out.println( "   4. Saturn   5. Uranus   6. Neptune\n" );
        
        System.out.print( "Which planet are you visiting? " );
        planet = keyboard.nextInt();
        
        if ( planet == 1 ) {
            weight = ( weight * 0.78 );
        }
        
        else if ( planet == 2 ) {
            weight = ( weight * 0.39 );
        }
        
        else if ( planet == 3 ) {
            weight = ( weight * 2.65 );
        }
        
        else if ( planet == 4 ) { 
            weight = ( weight * 1.17 );
        }
        
        else if ( planet == 5 ) { 
            weight = ( weight * 1.05 );
        }
        
        else if ( planet == 6 ) {
            weight = ( weight * 1.25 );
        }
        
        System.out.println();
        System.out.println( "Your weight would be " + weight + " pounds on that planet." );
    
        System.out.println();
        
    }
}