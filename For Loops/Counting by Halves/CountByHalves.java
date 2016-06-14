import java.util.Scanner;

public class CountByHalves
{
    public static void main (String[] args)
    {
        // Write a program that uses a for loop. With the loop, make the variable 
        // x go from -10 to 10, counting by 0.5. (This means that x can't be an int.)
        
        float x = -10;
        float y = x*x;
        
        System.out.println("x\t y");
        System.out.println("----------");
        for(int i=1;x<=10;i++)
        {
            System.out.println(x+"\t"+y);
            x += 0.5;
            y = x*x;
        }
    }
}