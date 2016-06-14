import java.util.Scanner;

public class CollatzSequence
{
    public static void main ( String[] args )
    {
    
    
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print( "Starting number: " );
        int startNum = keyboard.nextInt();
        
        int largestNum = startNum;
        
        int numberCount = 1;
        
        System.out.print( startNum + "\t" );

        while ( startNum != 1 )
        {
            if ( startNum % 2 == 0 )
            {
                startNum = startNum/2;
            }
            else
            {
                startNum = (startNum*3) + 1;
            }
            
            if ( startNum > largestNum )
            {
                largestNum = startNum;
            }
            numberCount++;
            if ( numberCount % 6 == 0 )
            {
                System.out.println( startNum + "\t" );
            }
            else
            {
                System.out.print( startNum + "\t" );
            }
        }
        
        System.out.println( "" );
        System.out.print( "Terminated after " + numberCount + " steps." );
        System.out.println( " Largest value was " + largestNum + "." );
    }
}