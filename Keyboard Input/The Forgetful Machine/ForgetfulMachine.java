import java.util.Scanner;

public class ForgetfulMachine { 
    public static void main(String[] args) {
    
        // Ask the user for two words and two numbers, and let the person at the keyboard type in some values, but don't bother storing their responses into any variables
    
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println();
        
        System.out.println( "Give me a word!" );
        keyboard.next();
        
        System.out.println( "Give me a second word!" );
        keyboard.next();
        
        System.out.println( "Great, now your favorite number?" );
        keyboard.next();
        
        System.out.println( "And your second favorite number..." );
        keyboard.next();
        
        System.out.println( "Whew! Wasn't that fun?");
    
    }
}