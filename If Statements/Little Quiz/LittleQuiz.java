import java.util.Scanner;

public class LittleQuiz {
    public static void main(String[] args) {
        
        // Write an interactive quiz. It should ask the user three multiple-choice or true/false questions about something. It must keep track of how many they get wrong, and print out a "score" at the end.
        
        Scanner keyboard = new Scanner(System.in);
        
        String readyAns;
        int firstAns, secondAns, thirdAns, score;
        
        score = 0;
        
        System.out.println();
        
        System.out.print( "Are you ready for a quiz? " );
        readyAns = keyboard.next();
        
        System.out.println( "Okay, here it comes!\n" );
        
        System.out.println( "Q1) What is the capital of Alaska?" );
        
        System.out.println( "        1) Melbourne" );
        System.out.println( "        2) Anchorage" );
        System.out.println( "        3) Juneau\n" );
        System.out.print( "Ans: " );
        firstAns = keyboard.nextInt();
        
        System.out.println();
        
        if ( firstAns == 3 ) { 
            System.out.println( "That's correct!\n" );
            score++;
        }
        else {
            System.out.println( "Sorry, the capital of Alaska is Juneau.\n" );
        }
        
        System.out.println( "Q2) Can you store the value \"cat\" in a variable of type int?" );
        System.out.println( "        1) Yes" );
        System.out.println( "        2) No\n" );
    
        System.out.print( "Ans: " );
        secondAns = keyboard.nextInt();
        
        System.out.println();
        
        if ( secondAns == 2 ) { 
            System.out.println( "That's correct!\n" );
            score++;
        }
        else {
            System.out.println( "Sorry, \"cat\" is a string. An int can only store numbers.\n" );
        }
        
        
        
        System.out.println( "Q3) What is the result of 9 + 6 / 3?" );
        System.out.println( "        1) 5" );
        System.out.println( "        2) 11" );
        System.out.println( "        3) 15/3\n" );
    
        System.out.print( "Ans: " );
        thirdAns = keyboard.nextInt();
        
        System.out.println();
        
        if ( thirdAns == 2 ) { 
            System.out.println( "That's correct!\n" );
            score++;
        }
        else {
            System.out.println( "Sorry, the answer is 11.\n" );
        }
        
        System.out.println( "Overall, you got " + score + " out of 3 correct." );
        System.out.println( "Thanks for playing!" );
        
    }
     
}