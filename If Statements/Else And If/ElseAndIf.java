import java.util.Scanner;

public class ElseAndIf {
    public static void main( String[] args) { 
        
        Scanner keyboard = new Scanner(System.in);
        
        int people = 40;
        int cars = 30;
        int buses = 45;
        
        System.out.println();
        
        if ( cars > people ) {
            System.out.println( "We should take the cars." );
        }
        
        else if ( cars < people ) {
            System.out.println( "We should not take the cars." );
        }
        
        else {
            System.out.println( "We can't decide." );
        }
        
        if ( buses > cars ) {
            System.out.println( "That's too many buses." );
        }
        
        else if ( buses < cars ) {
            System.out.println( "Maybe we could take the buses." );
        }
        
        else {
            System.out.println( "We still can't decide." );
        }
        
        if ( people > buses ) {
            System.out.println( "All right, let's just take the buses." );
        }
        
        else {
            System.out.println( "Fine, let's stay home then." );
        }
        
        System.out.println();
        
    }
}