import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;


public class JTabbedPaneFrame extends JFrame
{
    //set up GUI
    public JTabbedPaneFrame()
    {
        super("JTabbedPane Demo");

        JTabbedPane tabbedPane = new JTabbedPane(); //creates the tabbed pane

        //add first tab
        JLabel label1 = new JLabel ("panel one", SwingConstants.CENTER);
        JPanel panel1 = new JPanel();
        panel1.add(label1);
        panel1.setBackground(Color.YELLOW);
        tabbedPane.addTab("Tab One", null, panel1, "FirstPanel");

        //add second tab
        JLabel label2 = new JLabel ("Serif, Italic, 25", SwingConstants.CENTER);
        label2.setFont(new Font("Serif", Font.ITALIC, 25));

        JTextArea labelBold = new JTextArea("Sans Serif, Bold, 19, blue (RGB)");//TA has wordwrap, label does not.
        labelBold.setFont(new Font("Sans Serif", Font.BOLD, 19));
        labelBold.setForeground(new Color(64, 103, 162));//can use presets as with setBackground above, or RGB values
        labelBold.setBackground(Color.LIGHT_GRAY);
        JLabel label4 = new JLabel("Dialog, Plain, 19, purple (RGB)");
        label4.setFont(new Font("Dialog", Font.PLAIN, 19));
        label4.setForeground(new Color(191,5,247));
        JPanel panel2 = new JPanel(new GridLayout(2,3, 20, 20));
        panel2.add(label2);
        panel2.add(labelBold);
        panel2.add(label4);
        tabbedPane.addTab("Tab Too", null, panel2, "SecondPanel");

        //add third tab
        JLabel label3 = new JLabel ("These are fabulous buttons!", SwingConstants.CENTER);
        JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout());
        panel3.add(label3);
        panel3.add(new JButton("North"), BorderLayout.NORTH);
        panel3.add(new JButton("East"), BorderLayout.EAST);
        panel3.add(new JButton("West"), BorderLayout.WEST);
        panel3.add(new JButton("South"), BorderLayout.SOUTH);
        tabbedPane.addTab("Tab Three", null, panel3, "ThirdPanel");//keep the add below all the tab's formatting
        add(tabbedPane); //add this tabbed pane to the frame
    }//end constructor

}//end class