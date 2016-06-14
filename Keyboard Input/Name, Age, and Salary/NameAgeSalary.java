import java.util.Scanner;

public class NameAgeSalary { 
    public static void main(String[] args) {
    
        // Ask the user for their name. Then display their name to prove that you can recall it. Ask them for their age. Then display that. Finally, ask them for how much they make and display that. You should use the most appropriate data type for each variable.
    
        Scanner keyboard = new Scanner(System.in);
        
        String myName;
        int myAge;
        double mySalary;
        
        System.out.println();

        System.out.println( "Hello. What is your first name?" );
        myName = keyboard.next();
        
        System.out.println( "Hi, " + myName + "! How old are you?" );
        myAge = keyboard.nextInt();
        
        System.out.println( "So you're " + myAge + ", eh? That's not old at all!" );
        System.out.println( "How much do you make, " + myName + "?" );
        mySalary = keyboard.nextDouble();
        
        System.out.println( mySalary + "! I hope that's per hour and not per year!" );
        
        System.out.println();
        
        }
}