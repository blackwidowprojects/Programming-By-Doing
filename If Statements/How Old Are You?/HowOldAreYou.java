import java.util.Scanner;

public class HowOldAreYou {
    public static void main(String[] args) {
        
        // Make a program which displays a different message depending on the age given. 
        
        Scanner keyboard = new Scanner(System.in);
    
        int age;
        String name;
        
        System.out.println();
        
        System.out.print( "Hey, what's your name? " );
        name = keyboard.next();
        
        System.out.println();
        
        System.out.print( "Ok, " + name + " how old are you? " );
        age = keyboard.nextInt();
        
        System.out.println();
        
        if ( age < 16 ) {
            System.out.println( "You can't vote, " + name + "."  );
        }
        
        if ( age < 18 ) {
            System.out.println( "You can't vote, " + name + "."  );
        }
        
        if ( age < 25 ) {
            System.out.println( "You can't rent a car, " + name + "."  );
        }
        
        if ( age >= 25 ) {
            System.out.println( "You can do anything that's legal, " + name + "." );
        }
    
        System.out.println();
    }
        
}