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
    public Window () {
        super ("Window Title");
        
        JLabel nume = new JLabel("Nume: ");
        JTextField tfNume = new JTextField(10);
        JButton b_close = new JButton("Quit");
        
        b_close.addActionListener(e -> {
        	System.exit(0);
        });
        
        add(nume);
        add(tfNume);
        add(b_close);
        
        setLayout(new FlowLayout());
        
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
