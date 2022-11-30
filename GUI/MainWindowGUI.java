package GUI;

import mainData.*;
import mechanics.*;
import static_database.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import GUI.*;
// import static_database.*;

public class MainWindowGUI implements ActionListener  {
    
    static Pokemon charmander;
    static {
        Moves.addMoves();
        charmander=new Pokemon("Charmander",1,65,7 ,300 ,"./pokemonSprites/charmander.png", Moves.moveList.get(0),Moves.moveList.get(1),Moves.moveList.get(2),Moves.moveList.get(3));
    }
    static MainWindowGUI obj = new MainWindowGUI();
    static JButton loadButton;
    static JFrame frame;
    static JButton newButton;
    static JButton exitButton;
    static JFrame newFrame;
    static JPanel newPanel;
    static JButton Button1;
    static ImageIcon imageTitle = new ImageIcon(".\\images\\PokemonLogo.png"); // create image icon title
    static ImageIcon homeIcon = new ImageIcon(".\\images\\homeIcon.png");
    static ImageIcon imageLogo = new ImageIcon(".\\images\\PokemonMainLogo.png");
    static ImageIcon backgroundImage = new ImageIcon(".\\images\\Background.png");
    static Border border = BorderFactory.createRaisedBevelBorder();
    static ImageIcon char_img = new ImageIcon(charmander.pokSprite);
    public static void main(String[] args) {
        createFrame();
    }

    public static void createFrame(){
        frame = new JFrame("Pokemon Game"); // creates frame
        loadButton = new JButton();
        newButton = new JButton();
        exitButton = new JButton();
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JLabel label = new JLabel(); // create label and title
        JLabel charlabel = new JLabel(); // create label and title

        /////////////////////////////////////////////       FRAME     //////////////////////////////////////////////////////////

        frame.setBounds(0, 0, 1440, 850); // sets size dimensions
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit the program on close
        frame.setResizable(false); // Prevent frame from resize
        frame.setIconImage(imageTitle.getImage()); // create icon of frame
        frame.getContentPane().setBackground(new Color(0, 0, 100)); // change color background
        frame.setLayout(null);

        ////////////////////////////////////////////        PANEL      ///////////////////////////////////////////////////////////

        panel.setBackground(new Color(0, 0, 100));
        panel.setPreferredSize(new Dimension(1424, 808));
        panel.setBounds(0, 0, 1424, 808);
        panel.setBorder(BorderFactory.createLineBorder(Color.RED));
        panel.setLayout(null);
        frame.add(panel);
        // panel5.setBackground(new Color(0, 0, 100));
        // panel5.setBounds(1000, 5, 50, 100);
        // panel.add(panel5);
        // charlabel.setIcon(char_img);
        // charlabel.setVerticalAlignment(JLabel.TOP);
        // charlabel.setHorizontalAlignment(JLabel.RIGHT);
        // panel5.add(charlabel);
        

        panel4.setBackground(new Color(0, 0, 100));
        panel4.setBounds(222, 5, 1000, 300);
        panel.add(panel4);

        panel1.setBackground(new Color(0, 0, 100));
        panel1.setBounds(222, 310, 1000, 100);
        panel.add(panel1);

        panel2.setBackground(new Color(0, 0, 100));
        panel2.setBounds(222, 455, 1000, 100);
        panel.add(panel2);

        panel3.setBackground(new Color(0, 0, 100));
        panel3.setBounds(222, 595, 1000, 100);
        panel.add(panel3);

        //////////////////////////////////////////////      BUTTON       /////////////////////////////////////////////////////////

        loadButton.setPreferredSize(new Dimension(990, 90));
        loadButton.setBackground(new Color(99, 99, 99));
        loadButton.setForeground(new Color(0, 0, 0));
        loadButton.setFont(new Font("consolas", Font.BOLD, 30));
        loadButton.setText("LOAD GAME");
        loadButton.setBorder(border);
        loadButton.setFocusable(false);
        loadButton.addActionListener(e -> System.out.println("1"));

        newButton.setPreferredSize(new Dimension(990, 90));
        newButton.setBackground(new Color(99, 99, 99));
        newButton.setFont(new Font("consolas", Font.BOLD, 30));
        newButton.setForeground(new Color(0, 0, 0));
        newButton.setText("NEW GAME");
        newButton.setBorder(border);
        newButton.setFocusable(false);
        newButton.addActionListener(obj);

        exitButton.setPreferredSize(new Dimension(990, 90));
        exitButton.setBackground(new Color(99, 99, 99));
        exitButton.setFont(new Font("consolas", Font.BOLD, 30));
        exitButton.setForeground(new Color(0, 0, 0));
        exitButton.setText("EXIT");
        exitButton.setBorder(border);
        exitButton.setFocusable(false);
        exitButton.addActionListener(e -> System.exit(0));

        panel1.add(loadButton);
        panel2.add(newButton);
        panel3.add(exitButton);

        ////////////////////////////////////////////////        LABEL      ///////////////////////////////////////////////////////

        label.setIcon(imageLogo); // adds image on label
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);
        panel4.add(label); // add label to panel

        frame.setVisible(true); // make frame visible

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==newButton){
            NewWindow.createNewFrame();
            frame.setVisible(false);
        }
    }
}
