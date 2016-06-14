import java.util.Scanner;
import java.util.Random;

public class Blackjack
{
    public static void main (String[] args)
    {
        
		Scanner keyboard = new Scanner (System.in);
        Random r = new Random();
        
        int playerCount, dealerCount;
        
        System.out.println("BLACKJACK!");
        
        int playerCardOne, playerCardTwo, dealerCardOne, dealerCardTwo;
        
        playerCardOne = 1 + r.nextInt(11);
        playerCardTwo = 1 + r.nextInt(11);
        playerCount = playerCardOne + playerCardTwo;
        
        System.out.println("You get a " + playerCardOne + " and a " + playerCardTwo + ".");
        System.out.println("Your total is " + playerCount + ".");
        System.out.println("");
        
        dealerCardOne = 1 + r.nextInt(11);
        dealerCardTwo = 1 + r.nextInt(11);
        dealerCount = dealerCardOne + dealerCardTwo;
        
        System.out.println("The deal has a " + dealerCardOne + " and a hidden card.");
        System.out.println("His total is hidden, too.");
        System.out.println("");
        
        System.out.print("Would you like to \"hit\" or \"stay\"?");
        String playerChoice = keyboard.next();
        
        while(playerChoice == "hit")
        {
            int playerHit = 1 + r.nextInt(11);
            playerCount += playerHit;
            System.out.println("You drew a " + playerHit + ".");
            System.out.println
        }
        
        
    }
}