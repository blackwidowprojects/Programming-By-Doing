import java.awt.*;
import javax.swing.JFrame;

public class ClockFace extends Canvas
{
    public void paint ( Graphics g )
    {
        g.setColor(Color.black); // Change graphics color to Black
        g.drawArc(100,50,200,200,0,360); // Draw clock circle



    		g.setFont(new Font("Times", Font.PLAIN, 20));
    		g.drawString("3", 280, 160);
    		g.drawString("6", 195 , 240);
    		g.drawString("9", 110, 160);
    		g.drawString("12", 190, 75);

        g.setColor(Color.gray); // Change graphics color to Gray
        g.fillArc(195,145,10,10,0,360); // Draw center peg for clock hands



    }

    public static void main ( String[] args )
    {
        JFrame win = new JFrame("Clock Face");
        win.setSize(400,400);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ClockFace canvas = new ClockFace();
        win.add ( canvas );
        win.setVisible(true);
    }
}
