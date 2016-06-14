import java.util.Scanner;

public class WhatIf {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int people = 20; // Change these variables
        int cats = 30;   // to change the outcome
        int dogs = 15;   // of the println below
        
        System.out.println();
        
        if ( people < cats ) {
            System.out.println( "Too many cats! The world is doomed!" );
        }
        
        if ( people > cats ) {
            System.out.println( "Not many cats! The world is saved!" );
        }
        
        if ( people < dogs ) {
            System.out.println( "The world is drooled on!" );
        }
        
        if ( people > dogs ) {
            System.out.println( "The world is dry!" );
        }
        
        dogs +=5;
        
        if ( people >= dogs ) {
            System.out.println( "People are greater than or equal to dogs." );
        }
        
        if ( people <= dogs ) {
            System.out.println( "People are less than or equal to dogs." );
        }
        
        if ( people == dogs ) {
            System.out.println( "People are dogs." );
        }
        
        System.out.println();
        
    }
}
 