import java.util.Scanner;

public class AskingQuestions {
    public static void main(String[] args) {
        
        // Ask a question to the reader and receive an input to assign to a variable
        
        Scanner keyboard = new Scanner(System.in);
        
        int age, feet, inches;
        double weight;
        
        System.out.println();
        
        System.out.print( "How old are you? " );
        age = keyboard.nextInt();
        
        System.out.print( "How many feet tall are you? ");
        feet = keyboard.nextInt();
        
        System.out.print( feet + " feet? And how many inches? ");
        inches = keyboard.nextInt();
        
        
        /* 
        System.out.print( "How tall are you? " );
        height = keyboard.next(); *Note: Use keyboard.next() when asking for a String variable; keyboard.nextInt() for ints and keyboard.nextDouble() for dbls
        */ 
        
        System.out.print( "How much do you weigh? " );
        weight = keyboard.nextDouble();
        
        System.out.println( "So, you're " + age + " years old, " + feet + "'" + inches + "\" " + "tall and " + weight + " lbs heavy." );
                
        System.out.println();
    }
}