import javax.swing.*;
import java.awt.*;

public class Main 
{
    public static void main(String[] args)
    {
        Window win = new Window();    
    }
}

class Window extends JFrame 
{
    public Window () 
    {
        super ("Window Title");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Container ca = getContentPane();
        ca.setBackground(Color.blue);
    }
}
