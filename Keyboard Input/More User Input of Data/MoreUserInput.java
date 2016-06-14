import java.util.Scanner;

public class MoreUserInput {
    public static void main(String[] args) {
        
        // Ask the user for several pieces of information, and display them on the screen afterwards as a summary
        
        Scanner keyboard = new Scanner(System.in);
        
        String firstName, lastName, loginName;
        int grade, studentNum;
        double gpa;
        
        System.out.println();
        
        System.out.println( "Please enter the following information so I can sell it for a profit!\n" );
        
        System.out.print( "First name: " );
        firstName = keyboard.next();
        
        System.out.print( "Last name: " );
        lastName = keyboard.next();
        
        System.out.print( "Grade (9-12): " );
        grade = keyboard.nextInt();
        
        System.out.print( "Student ID: " );
        studentNum = keyboard.nextInt();
        
        System.out.print( "Login: " );
        loginName = keyboard.next();
        
        System.out.print( "GPA (0.0-4.0): " );
        gpa = keyboard.nextDouble();
        
        System.out.println();
        
        System.out.println( "Your information: " );
        System.out.println( "        Login: " + loginName );
        System.out.println( "        ID:    " + studentNum );
        System.out.println( "        Name:  " + lastName + ", " + firstName );
        System.out.println( "        GPA:   " + gpa );
        System.out.println( "        Grade: " + grade );
        
        System.out.println();
        
    }
}