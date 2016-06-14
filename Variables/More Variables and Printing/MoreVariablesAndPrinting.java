public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name, eyes, teeth, hair;
        int age;
        double height, weight;
        
        name = "Brandon L. Widow";
        age = 21; // years
        height = ( 71 * 2.54 ); // inches converted to centimeters
        weight = ( 150 * 0.453592 ); // lbs converted to kilos
        eyes = "Brown";
        teeth = "White";
        hair = "Black";
        
        System.out.println("");
        System.out.println( "Let's talk about " + name + "." );
        System.out.println( "He's " + Math.round(height) + " centimeters tall." ); // Math.round(double) rounds to whole number
        System.out.println( "He's " + Math.round(weight) + " kilograms heavy." );
        System.out.println( "Actually, thats not too heavy." );
        System.out.println( "He's got " + eyes + " eyes and " + hair + " hair." );
        System.out.println( "His teeth are usually " + teeth + " depending on the coffee." );
        
        System.out.println( "If I add " + age + ", " + Math.round(height) + ", and " + Math.round(weight) + " I get " + (age + Math.round(height) + Math.round(weight) ) + "." );
        System.out.println("");
    }
}