public class CompareTo {
    public static void main ( String [] args ) {
    
    // Write a program that compares several Strings using the compareTo() method. You should display the Strings and display the integer that compareTo() gives you.
    
        System.out.print("Comparing \"axe\" with \"dog\" produces ");
        int i = "axe".compareTo("dog");
        System.out.println(i);

        System.out.print("Comparing \"car\" with \"jeep\" produces ");
        System.out.println( "car".compareTo("jeep") );
        
        System.out.print("Comparing \"egg\" with \"bread\" produces ");
        System.out.println( "egg".compareTo("bread") );
        
        System.out.print("Comparing \"applebee's\" with \"apple\" produces ");
        System.out.println( "applebee's".compareTo("apple") );
        
    }
}