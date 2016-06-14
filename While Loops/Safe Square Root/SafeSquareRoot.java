import java.util.Scanner;

public class SafeSquareRoot
{
    public static void main ( String[] args )
    {
        // Write a program to take the square root of a number typed in by the user. 
        // Your program should use a loop to ensure that the number they typed in 
        // is positive. If the number is negative, you should print out some sort of 
        // warning and make them type it in again.
        
        Scanner keyboard = new Scanner(System.in);
        
        int number;
        
        System.out.println( "Square root!" );
        System.out.print( "Enter a number: ");
        number = keyboard.nextInt();
        
        while ( number < 0 )
        {
            System.out.println( "You can't take the square root of a negative number!" );
            System.out.print( "Try again: " );
            number = keyboard.nextInt();
        }
        
        System.out.println( "The square root of " + number + " is " + Math.sqrt(number) + "." );
    }
}