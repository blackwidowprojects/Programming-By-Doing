import java.util.Scanner;

public class TwoQuestions {
    public static void main ( String[] args ) {
        
        // Make a program which plays a simple game of  2 Questions. The first question should be "animal, vegetable, or mineral?" Then, the second question should be "is it bigger than a breadbox?" Then, display one of six possible responses, depending on their answers. You can choose what answers to give for each of the six possibilities.
        
        Scanner keyboard = new
        Scanner(System.in);
     
        String firstAns, secondAns;
        
        System.out.println();
        
        System.out.println( "TWO QUESTIONS" );
        System.out.println( "Think of an object, and I'll try to guess it." );
        
        System.out.println();
        
        System.out.println( "Question 1) Is it animal, vegetable, or mineral?" );
        
        System.out.print( "Ans: " );
        firstAns = keyboard.next();
        
        System.out.println();
        
        System.out.println( "Question 2) Is it bigger than a breadbox? (yes or no)" );
        
        System.out.print( "Ans: " );
        secondAns = keyboard.next();
        
        System.out.println();
        
        if ( firstAns.equals("animal") ) {
            if ( secondAns == "no" ) {
                System.out.println( "My guess is that you are thinking of a squirrel." );
            }
            
            else {
                System.out.println( "My guess is that you are thinking of a moose." );
            }
        }
        
        
        else if ( firstAns.equals("vegetable") ) {
            if ( secondAns == "no" ) {
                System.out.println( "My guess is that you are thinking of a carrot." );
            }
            
            else {
                System.out.println( "My guess is that you are thinking of a watermelon." );
            }
        }
        
        else if ( firstAns.equals("mineral") ) {
            if ( secondAns == "no" ) {
                System.out.println( "My guess is that you are thinking of a paper clip." );
            }
            
            else {
                System.out.println( "My guess is that you are thinking of a truck." );
            }
        }
        
        else {
            System.out.println( "I actually can't tell what you're thinking. You should try again." );
        }
        
        System.out.println( "I would ask you if I'm right, but I don't actually care." );
        
        System.out.println();
    }
}