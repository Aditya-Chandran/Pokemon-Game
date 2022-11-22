package GUI;
import mainData.*;
import mechanics.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

public class MainWindowGUI /*implements ActionListener*/ {
    static JButton loadButton;
    static JButton newButton;
    static JButton exitButton;
    public static void main(String[] args) {
        ImageIcon imageTitle = new ImageIcon("./images/PokemonLogo.png");         //create image icon title
        ImageIcon imageLogo = new ImageIcon("./images/PokemonMainLogo.png");
        JFrame frame = new JFrame("Pokemon Game");        //creates frame
        loadButton = new JButton();
        newButton = new JButton();
        exitButton = new JButton();
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JLabel label = new JLabel();        //create label and title
        Border border = BorderFactory.createRaisedBevelBorder();

        // -------------- FRAME -----------------

        frame.setBounds(0,0,1440,850);         //sets size dimensions
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       //exit the program on close
        frame.setResizable(false);      //Prevent frame from resize
        frame.setIconImage(imageTitle.getImage());       //create icon of frame
        frame.getContentPane().setBackground(new Color(0,0,100));      //change color background
        frame.setVisible(true);         //make frame visible
        frame.setLayout(null);

        // --------------- PANEL ------------------
        
        panel.setBackground(new Color(0,0,100));
        panel.setPreferredSize(new Dimension(1440,850));
        panel.setBounds(0,0,1440,850);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setLayout(null);
        frame.add(panel);

        panel4.setBackground(new Color(0,0,100));
        panel4.setBounds(222,5,1000,300);
        panel.add(panel4);

        panel1.setBackground(new Color(0,0,100));
        panel1.setBounds(222,310,1000,100);
        panel.add(panel1);

        panel2.setBackground(new Color(0,0,100));
        panel2.setBounds(222,455,1000,100);
        panel.add(panel2);

        panel3.setBackground(new Color(0,0,100));
        panel3.setBounds(222,595,1000,100);
        panel.add(panel3);

        // -------------------- BUTTONS ----------------------
        
        loadButton.setPreferredSize(new DimensionUIResource(990,90));
        loadButton.setBackground(new Color(99,99,99));
        loadButton.setForeground(new Color(0,0,0));
        loadButton.setFont(new Font("consolas",Font.BOLD, 30));
        loadButton.setText("LOAD GAME");
        loadButton.setBorder(border);
        loadButton.setFocusable(false);
        loadButton.addActionListener(e -> System.out.println("1"));
        
        newButton.setPreferredSize(new DimensionUIResource(990, 90));
        newButton.setBackground(new Color(99,99,99));
        newButton.setFont(new Font("consolas",Font.BOLD, 30));
        newButton.setForeground(new Color(0,0,0));
        newButton.setText("NEW GAME");
        newButton.setBorder(border);
        newButton.setFocusable(false);
        newButton.addActionListener(e -> System.out.println("2"));
        
        exitButton.setPreferredSize(new DimensionUIResource(990,90));
        exitButton.setBackground(new Color(99,99,99));
        exitButton.setFont(new Font("consolas",Font.BOLD, 30));
        exitButton.setForeground(new Color(0,0,0));
        exitButton.setText("EXIT");
        exitButton.setBorder(border);
        exitButton.setFocusable(false);
        exitButton.addActionListener(e -> System.exit(0));

        panel1.add(loadButton);
        panel2.add(newButton);
        panel3.add(exitButton);

        // ------------------- LABEL ------------------------
        
        label.setIcon(imageLogo);       //adds image on label
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        panel4.add(label);      //add label to panel
        
    }
    // @Override
    // public void actionPerformed(ActionEvent e) {
    //     if (e.)
    // }
}
