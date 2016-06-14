import java.awt.*;
import javax.swing.JFrame;

public class SmilingFace extends Canvas
{
    public void paint ( Graphics g )
    {
        g.setColor(Color.yellow);
        g.fillArc(50,50,400,400,0,360);
        
        g.setColor(Color.blue);
        g.fillArc(150,150,50,50,0,360);
        g.fillArc(300,150,50,50,0,360);
        g.setColor(Color.red);
        g.drawArc(150,250,200,100,200,140);
        
    }

    public static void main ( String[] args )
    {
		JFrame win = new JFrame("Smiling Face");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SmilingFace canvas = new SmilingFace();
		win.add( canvas );
		win.setVisible(true);
    }
}