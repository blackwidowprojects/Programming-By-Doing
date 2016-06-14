import java.util.Scanner;

public class CountingFor
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        
        int numOne, numTwo, numThree;
        
        System.out.print("Count from: ");
        numOne = keyboard.nextInt();
        
        System.out.print("Count to: ");
        numTwo = keyboard.nextInt();
        
        System.out.print("Count by: ");
        numThree = keyboard.nextInt();
        
        for(int i=numOne; i<numTwo; i+=numThree)
        {
            System.out.print(i)
        }
    }
}