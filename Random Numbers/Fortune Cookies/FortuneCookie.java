import java.util.Random;
import java.util.Scanner;

public class FortuneCookie
{
    public static void main ( String[] args )
    {
        // Write a program that simulates a random fortune from a fortune cookie. 
        // You must have at least six fortunes.

        // Also add randomly-chosen lotto numbers to the fortune. 
        // In Texas, the lotto chooses 6 numbers, each from 1-54.
        // No repeating numbers!
        
        Random r = new Random();
        
        int fortune = 1 + r.nextInt(6);
        int num1, num2, num3, num4, num5, num6;
        
        num1 = 1 + r.nextInt(54);
        num2 = 1 + r.nextInt(54);
        
        while ( num2 == num1 )
        {
            num2 = 1 + r.nextInt(54);
        }
        
        num3 = 1 + r.nextInt(54);
        
        while ( num3 == num1 || num3 == num2 )
        {
            num3 = 1 + r.nextInt(54);
        }
        
        num4 = 1 + r.nextInt(54);
        
        while ( num4 == num1 || num4 == num2 || num4 == num3 )
        {
            num4 = 1 + r.nextInt(54);
        }
        
        num5 = 1 + r.nextInt(54);
        
        while ( num5 == num1 || num5 == num2 || num5 == num3 || num5 == num4 )
        {
            num5 = 1 + r.nextInt(54);
        }
        
        num6 = 1 + r.nextInt(54);
        
        while ( num6 == num1 || num6 == num2 || num6 == num3 || num6 == num4 || num6 == num5 )
        {
            num6 = 1 + r.nextInt(54);
        }
        
        if ( fortune == 1 )
        {
            System.out.println( "Fortune cookie says: Wealth awaits you very soon." );
        }
        
        else if (fortune == 2 )
        {
            System.out.println( "Fortune cookie says: Serious trouble will bypass you." );
        }
        
        else if ( fortune == 3 )
        {
            System.out.println( "Fortune cookie says: A very attractive person has a message for you." );
        }
        
        else if ( fortune == 4 )
        {
            System.out.println( "Fortune cookie says: You will receive an object of which you do not desire." );
        }
        
        else if ( fortune == 5 )
        {
            System.out.println( "Fortune cookie says: A pleasant surprise awaits you." );
        }
        
        else if ( fortune == 6 )
        {
            System.out.println( "Fortune cookie says: All your sorrows will vanish." );
        }
        
        System.out.println( "Lucky numbers: " + num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6 );
    }
}