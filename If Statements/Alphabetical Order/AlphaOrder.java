import java.util.Scanner;

public class AlphaOrder {
    public static void main ( String[] args ) 
    {
        // Make a program that asks for the last name of the user. Depending on their last name, make a statement about how long they have to wait during roll call. You need to use else ifs to make sure only one statement gets printed.

        Scanner keyboard = new
        Scanner(System.in);

        String name;

        System.out.print( "What's your last name? " );
        name = keyboard.next();

        int str1 = name.compareTo("Carswell");

        if(str1 <= 0) 
        {
            System.out.println( " You don't have long to wait. " );
        }
        else 
        {

            int str2 = name.compareTo("Jones");

            if(str2 <= 0) 
            {
                System.out.println( " That's not that bad. " );
            }

            else 
            {

                int str3 = name.compareTo("Smith");

                if(str3 <= 0)
                {
                    System.out.println( " Looks like a bit of a wait! " );
                }

                else 
                {
                    int str4 = name.compareTo("Young");

                    if(str4 <= 0) 
                    {
                        System.out.println( " It's gonna be a while. " );
                    }

                    else 
                    {
                        System.out.println( " Not going anywhere for a while? " );
                    }
                }
            }
        }
    }
}