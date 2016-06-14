import java.util.Scanner;

public class Nim
{
    public static void main ( String[] args )
    {
    
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print( "Player 1, enter your name: " );
        String playerOne = keyboard.next();
        
        System.out.print( "Player 2, enter your name: " );
        String playerTwo = keyboard.next();
        
        int stackA = 3;
        int stackB = 4;
        int stackC = 5;
        
        String playerOnePile, playerTwoPile;
        int playerOneAmount, playerTwoAmount;
        
        int playerTurn = 1;
        
        while ( stackA > 0 || stackB > 0 || stackC > 0 )
        {
            
            if (playerTurn == 1)
            {   
                int tmpStack = 1;
                String tmpPile = null;
                
                System.out.println( "" );
                System.out.println( "A: "+stackA+"\t"+"B: "+stackB+"\t"+"C: "+stackC );
                System.out.println( "" );
                
                if (stackA==1&&stackB==0&&stackC==0) break;
                if (stackA==0&&stackB==1&&stackC==0) break;
                if (stackA==0&&stackB==0&&stackC==1) break;
                
                System.out.print( playerOne+", choose a pile: ");
                playerOnePile = keyboard.next();
                
                tmpPile = playerOnePile;
             
                if (playerOnePile.equals("A")) tmpStack = stackA;
                if (playerOnePile.equals("B")) tmpStack = stackB;
                if (playerOnePile.equals("C")) tmpStack = stackC;
                
                while (tmpStack==0) // Empty Pile Check
                {
                    System.out.print( "Nice try, "+playerOne+". That pile is empty. Choose again: " );
                    playerOnePile = keyboard.next();
                    
                    tmpPile = playerOnePile;

                    if (playerOnePile.equals("A")) tmpStack = stackA;
                    if (playerOnePile.equals("B")) tmpStack = stackB;
                    if (playerOnePile.equals("C")) tmpStack = stackC;
                } 
                
                System.out.print( "How many to remove from pile "+playerOnePile+": ");
                playerOneAmount = keyboard.nextInt();

                while ((playerOneAmount>tmpStack)||(playerOneAmount<=0))
                {                    
                    if (playerOneAmount<=0)
                    {
                        System.out.print( "\nYou much choose at least 1. How many? " );
                        playerOneAmount = keyboard.nextInt();
                    }
                    
                    if (playerOneAmount>tmpStack)
                    {
                        System.out.print( "\nPile "+playerOnePile+" doesn't have that many. Try again: " );
                        playerOneAmount = keyboard.nextInt();
                    }
                    
                }
             
                if (playerOnePile.equals("A")) stackA -= playerOneAmount;
                if (playerOnePile.equals("B")) stackB -= playerOneAmount;
                if (playerOnePile.equals("C")) stackC -= playerOneAmount;
                
                if (stackA<0) stackA=0;
                if (stackB<0) stackB=0;
                if (stackC<0) stackC=0;
                
                playerTurn = 2;
            }
            
            else
            {
                int tmpStack = 1;
                String tmpPile = null;
                                
                System.out.println( "" );
                System.out.println( "A: "+stackA+"\t"+"B: "+stackB+"\t"+"C: "+stackC );
                System.out.println( "" );

                if (stackA==1&&stackB==0&&stackC==0) break;
                if (stackA==0&&stackB==1&&stackC==0) break;
                if (stackA==0&&stackB==0&&stackC==1) break;
                
                System.out.print( playerTwo+", choose a pile: ");
                playerTwoPile = keyboard.next();

                tmpPile = playerTwoPile;
             
                if (playerTwoPile.equals("A")) tmpStack = stackA;
                if (playerTwoPile.equals("B")) tmpStack = stackB;
                if (playerTwoPile.equals("C")) tmpStack = stackC;
                
                while (tmpStack==0) // Empty Pile Check
                {
                    System.out.print( "Nice try, "+playerTwo+". That pile is empty. Choose again: " );
                    playerTwoPile = keyboard.next();
                    
                    tmpPile = playerTwoPile;

                    if (playerTwoPile.equals("A")) tmpStack = stackA;
                    if (playerTwoPile.equals("B")) tmpStack = stackB;
                    if (playerTwoPile.equals("C")) tmpStack = stackC;
                } 
                
                System.out.print( "How many to remove from pile "+playerTwoPile+": ");
                playerTwoAmount = keyboard.nextInt();

                while ((playerTwoAmount>tmpStack)||(playerTwoAmount<=0))
                {                    
                    if (playerTwoAmount<=0)
                    {
                        System.out.print( "\nYou much choose at least 1. How many? " );
                        playerTwoAmount = keyboard.nextInt();
                    }
                    
                    if (playerTwoAmount>tmpStack)
                    {
                        System.out.print( "\nPile "+playerTwoPile+" doesn't have that many. Try again: " );
                        playerTwoAmount = keyboard.nextInt();
                    }
                    
                }                
                
                if (playerTwoPile.equals("A")) stackA -= playerTwoAmount;
                if (playerTwoPile.equals("B")) stackB -= playerTwoAmount;
                if (playerTwoPile.equals("C")) stackC -= playerTwoAmount;
                
                if (stackA<0) stackA=0;
                if (stackB<0) stackB=0;
                if (stackC<0) stackC=0;
                
                playerTurn = 1;
            }
        }
        
        String winner;
        if (playerTurn == 2) winner = playerOne;
        else winner = playerTwo;
        
        
        if ((stackA==1&&stackB==0&&stackC==0)||(stackA==0&&stackB==1&&stackC==0)||(stackA==0&&stackB==0&&stackC==1))
        {
            
            if (winner == playerOne) winner = playerTwo;
            else winner = playerOne;
            
            System.out.println( winner+", you must take the remaining counter, so YOU WIN!");
        }
        else
        {
            System.out.println("");
            System.out.println( winner+", there are no counters left. YOU WIN!");
        }
        
    }
}