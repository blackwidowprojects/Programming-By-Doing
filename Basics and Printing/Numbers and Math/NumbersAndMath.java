public class NumbersAndMath {
    public static void main(String[] args) {
        // Println arithmetic using operators
        System.out.println("I will now count my chickens:");
        System.out.println("Hens " + ( 25 + 30 / 6 ));
        double i = 100 - 25 * 3 % 4;
        System.out.println("Roosters " + i);
        
        System.out.println("Now I will count the eggs:");
        
        double j = 3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6;
        System.out.println(j);
        
        System.out.println("Is it true that 3 + 2 < 5 - 7?" );
        
        System.out.println( 3 + 2 < 5 - 7 );
        
        System.out.println("What is 3 + 2? " + ( 3 + 2 ));
        System.out.println("What is 5 - 7? " + ( 5 - 7 ));
        
        System.out.println("Oh, that's why it's false.");
        
        System.out.println("How about some more.");
        
        System.out.println("Is it greater? " + ( 5 > -2 ));
        System.out.println("Is it greater or equal? " + ( 5 >= -2 ));
        System.out.println("Is it less or equal? " + ( 5 <= -2 ));
    }
}