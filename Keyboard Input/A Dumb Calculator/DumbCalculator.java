import java.util.Scanner;

public class DumbCalculator {
    public static void main(String[] args) {
        
        // Make a simple numeric calculator. It should prompt the user for three numbers. Then add the numbers together and divide by 2. Display the result. Your program must support numbers with decimals and not just integers.
        
        Scanner keyboard = new Scanner(System.in);
        
        double firstNum, secondNum, thirdNum;
        
        System.out.println();
        
        System.out.print( "What is your first number? " );
        firstNum = keyboard.nextDouble();
        
        System.out.print( "What is your second number? " );
        secondNum = keyboard.nextDouble();
        
        System.out.print( "What is your third number? " );
        thirdNum = keyboard.nextDouble();
        
        System.out.println();
        
        System.out.println( "( " + firstNum + " + " + secondNum + " + " + thirdNum + " ) / 2 is... " + ( (firstNum + secondNum + thirdNum ) / 2 ) );
        
        System.out.println();
        
    }
}