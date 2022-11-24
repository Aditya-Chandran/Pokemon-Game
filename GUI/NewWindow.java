package GUI;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.border.Border;
import javax.swing.plaf.DimensionUIResource;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import GUI.*;
// import javafx.scene.paint.Color;

public class NewWindow implements ActionListener{

    static Border border = BorderFactory.createRaisedBevelBorder();
    static JButton Button1;
    static JFrame newFrame = new JFrame();
    static NewWindow obj1 = new NewWindow();
    public static void main(String[] args) {
        createNewFrame();
    }
    public static void menuPanel(){
        
    }
    public static void createNewFrame(){
        JLabel newLabel = new JLabel();
        JPanel homeButtonPanel = new JPanel();
        JPanel Panel1 = new JPanel();
        JPanel Panel2 = new JPanel();
        Button1 = new JButton();
        newFrame = new JFrame("Pokemon Game");

        newFrame.setBounds(0, 0, 1440, 850); // sets size dimensions
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit the program on close
        newFrame.setResizable(false); // Prevent newFrame from resize
        newFrame.setIconImage(MainWindowGUI.imageTitle.getImage()); // create icon of newFrame
        newFrame.getContentPane().setBackground(new Color(0, 0, 100)); // change color background
        newFrame.setVisible(true); // make newFrame visible
        newFrame.setLayout(null);

        homeButtonPanel.setBounds(8, 8, 50, 50);
        homeButtonPanel.setBackground(new Color(0,0,100));
        // homeButtonPanel.setLayout(null);
        Panel1.setBounds(0, 0, 1424, 808);
        Panel1.setBackground(new Color(0,0,100));
        Panel1.setLayout(null);
        Panel1.setBorder(BorderFactory.createLineBorder(Color.RED));
        newFrame.add(Panel1);
        
        Button1.setPreferredSize(new DimensionUIResource(40, 40));
        Button1.setBackground(Color.GRAY);
        Button1.setBorder(border);
        Button1.setFocusable(false);
        Button1.setLayout(null);
        // Button1.add(newLabel); // add label to panel
        Button1.setIcon(MainWindowGUI.homeIcon); // adds image on newlabel
        Button1.addActionListener(obj1);
        
        Panel2.setBackground(new Color(0, 0, 100));
        Panel2.setBounds(222, 5, 1000, 300);
        newLabel.setIcon(MainWindowGUI.imageLogo);
        newLabel.setVerticalAlignment(JLabel.TOP);
        newLabel.setHorizontalAlignment(JLabel.CENTER);
        Panel2.add(newLabel);
        Panel1.add(Panel2);

        homeButtonPanel.add(Button1);
        Panel1.add(homeButtonPanel);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Button1){
            MainWindowGUI.frame.setVisible(true);
            newFrame.setVisible(false);
        }
    }
}