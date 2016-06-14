import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        
        // Make a BMI calculator. The body mass index (BMI) is commonly used by health and nutrition professionals to estimate human body fat in populations.

        // It is computed by taking the individual's weight (mass) in kilograms and dividing it by the square of their height in meters.
        
        Scanner keyboard = new Scanner(System.in);
 
        double height, weight, BMI;
        
        String BMIcat = "normal weight";
        
        System.out.println();
        
        System.out.print( "Your height in inches: " );
        height = keyboard.nextDouble();
        height = (height / 39.3701);
        
        System.out.print( "Your weight in lbs: " );
        weight = keyboard.nextDouble();
        weight = (weight / 2.20462);
        
        BMI = ( weight / ( height * height ) );
        
        System.out.println( "Your BMI is " + BMI );
        
        
        if ( BMI < 18.5 ) {
            BMIcat = "underweight";
        }
        
        if ( BMI >= 18.5 && BMI <= 24.9 ) {
            BMIcat = "normal weight";
        }
        
        if ( BMI >= 25 && BMI <= 29.9 ) {
            BMIcat = "overweight";
        }
        
        if ( BMI >= 30 ) {
            BMIcat = "obese";
        }
        
        System.out.println( "BMI Category: " + BMIcat );
            
        System.out.println();
 
    }
}