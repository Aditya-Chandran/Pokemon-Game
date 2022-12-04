package GUI;

import javax.swing.*;
import javax.swing.border.*;
import mechanics.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static_database.*;


public class DifficultyWindow implements ActionListener {
    
    public static JFrame dwFrame;
    public static JPanel PANEL,gym1Panel, gym2Panel, gym3Panel, gym4Panel, gym5Panel;
    public static JButton gym1Button,gym2Button, gym3Button, gym4Button, gym5Button,homeButton;
    public static JLabel backGround, head, pokSet1,pokSet2,pokSet3,pokSet4,pokSet5;
    static Border border = BorderFactory.createRaisedBevelBorder();
    static ImageIcon icon = new ImageIcon("./images/Background.png"); 
    static ImageIcon iconHead = new ImageIcon("./images/PokemonMainLogo.png");
    static ImageIcon gym1 = new ImageIcon("./images/Gym1.png");
    static ImageIcon gym2 = new ImageIcon("./images/Gym2.png");
    static ImageIcon gym3 = new ImageIcon("./images/Gym3.png");
    static ImageIcon gym4 = new ImageIcon("./images/Gym4.png");
    static ImageIcon gym5 = new ImageIcon("./images/Gym5.png");
    public static GymDiff gymList;
    public static int gymIndex;

    public static void createDW()
    {   
        /////////////////////////////////////////////       FRAME     //////////////////////////////////////////////////////////

        dwFrame = new JFrame();
        dwFrame.setIconImage(MainWindowGUI.imageTitle.getImage());
        dwFrame.setSize(1440, 850);
        dwFrame.setResizable(false);
        dwFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit the program on close
        dwFrame.setLayout(null);
        dwFrame.setLocationRelativeTo(null);
        dwFrame.setTitle("Pokemon");
        dwFrame.setLocationRelativeTo(null);
        
        //////////////////////////////////////////////    PANELS     ///////////////////////////////////////////////////////////
        PANEL = new JPanel();
        gym1Panel = new JPanel();
        gym2Panel = new JPanel();
        gym3Panel = new JPanel();
        gym4Panel = new JPanel();
        gym5Panel = new JPanel();

        
        /////////////////////       mainPanel       ///////////////////////
        
        PANEL.setBackground(new Color(0, 0, 0));
        PANEL.setPreferredSize(new Dimension(1440, 850));
        PANEL.setBounds(0, 0, 1440, 850);
        PANEL.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        PANEL.setLayout(null);
        dwFrame.add(PANEL);        
        
        ////////////////////        gym1Panel       //////////////////////
        
        gym1Panel.setBackground(new Color(150,150,150));
        gym1Panel.setPreferredSize(new Dimension(1424, 808));
        gym1Panel.setBounds(50, 250, 220, 500);
        gym1Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        gym1Panel.setLayout(null);
        PANEL.add(gym1Panel);
        
        
        ////////////////////        gym2Panel       //////////////////////
        
        gym2Panel.setBackground(new Color(150,150,150));
        gym2Panel.setPreferredSize(new Dimension(1424, 808));
        gym2Panel.setBounds(320, 250, 220, 500);
        gym2Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        gym2Panel.setLayout(null);
        PANEL.add(gym2Panel);
        
        
        ////////////////////        gym3Panel       //////////////////////
        
        gym3Panel.setBackground(new Color(150,150,150));
        gym3Panel.setPreferredSize(new Dimension(1424, 808));
        gym3Panel.setBounds(599, 250, 220, 500);
        gym3Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        gym3Panel.setLayout(null);
        PANEL.add(gym3Panel);
        
        
        ////////////////////        gym4Panel       //////////////////////

        gym4Panel.setBackground(new Color(150,150,150));
        gym4Panel.setPreferredSize(new Dimension(1424, 808));
        gym4Panel.setBounds(860, 250, 220, 500);
        gym4Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        gym4Panel.setLayout(null);
        PANEL.add(gym4Panel);
        

        ////////////////////        gym5Panel       //////////////////////
        
        gym5Panel.setBackground(new Color(150,150,150));
        gym5Panel.setPreferredSize(new Dimension(1424, 808));
        gym5Panel.setBounds(1130, 250, 220, 500);
        gym5Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        gym5Panel.setLayout(null);
        PANEL.add(gym5Panel);
        
        
        //////////////////////////////////////////////    BUTTONS    ///////////////////////////////////////////////////////////
        gym1Button = new JButton();
        gym2Button = new JButton();
        gym3Button = new JButton();
        gym4Button = new JButton();
        gym5Button = new JButton();
        
        
        ////////////////////        gym1Button       //////////////////////
        
        gym1Button.setBounds(0,0, 220, 90);
        gym1Button.setBackground(new Color(99, 99,99));
        gym1Button.setFont(new Font("comic sans ms", Font.BOLD, 30));
        gym1Button.setForeground(new Color(0, 0, 0));
        gym1Button.setText("GYM 1");
        gym1Button.setFocusable(false);
        gym1Button.setBorder(border);
        gym1Button.addActionListener(new DifficultyWindow());
        gym1Panel.add(gym1Button);
        
        
        ////////////////////        gym2Button       //////////////////////
        
        gym2Button.setBounds(0,0, 220, 90);
        gym2Button.setBackground(new Color(99,99,99));
        gym2Button.setFont(new Font("comic sans ms", Font.BOLD, 30));
        gym2Button.setForeground(new Color(0, 0, 0));
        gym2Button.setText("GYM 2");
        gym2Button.setFocusable(false);
        gym2Button.setBorder(border);
        gym2Button.addActionListener(new DifficultyWindow());
        gym2Panel.add(gym2Button);
        
        
        ////////////////////        gym3Button       //////////////////////
        
        gym3Button.setBounds(0,0, 220, 90);
        gym3Button.setBackground(new Color(99,99,99));
        gym3Button.setFont(new Font("comic sans ms", Font.BOLD, 30));
        gym3Button.setForeground(new Color(0, 0, 0));
        gym3Button.setText("GYM 3");
        gym3Button.setFocusable(false);
        gym3Button.setBorder(border);
        gym3Button.addActionListener(new DifficultyWindow());
        gym3Panel.add(gym3Button);
        
        
        ////////////////////        gym4Button       //////////////////////
        
        gym4Button.setBounds(0,0, 220, 90);
        gym4Button.setBackground(new Color(99,99,99));
        gym4Button.setFont(new Font("comic sans ms", Font.BOLD, 30));
        gym4Button.setForeground(new Color(0, 0, 0));
        gym4Button.setText("GYM 4");
        gym4Button.setFocusable(false);
        gym4Button.setBorder(border);
        gym4Button.addActionListener(new DifficultyWindow());
        gym4Panel.add(gym4Button);
        
        
        ////////////////////        gym5Button       //////////////////////
        
        gym5Button.setBounds(0,0, 220, 90);
        gym5Button.setBackground(new Color(99,99,99));
        gym5Button.setFont(new Font("comic sans ms", Font.BOLD, 30));
        gym5Button.setForeground(new Color(0, 0, 0));
        gym5Button.setText("GYM 5");
        gym5Button.setFocusable(false);
        gym5Button.setBorder(border);
        gym5Button.addActionListener(new DifficultyWindow());
        gym5Panel.add(gym5Button);

        //////////////////////////////////////////////    LABELS    ///////////////////////////////////////////////////////////

        
        backGround = new JLabel();
        backGround.setBounds(0, 0, 1440, 850);
        backGround.setIcon(icon);
        
        head = new JLabel();
        head.setIcon(iconHead);
        head.setBounds(0,30,1440,850);
        head.setVerticalAlignment(JLabel.TOP);
        head.setHorizontalAlignment(JLabel.CENTER);

        //////////////////////////////////////////////    HOME BUTTON    ///////////////////////////////////////////////////////////
        homeButton =new JButton();
        homeButton.setPreferredSize(new Dimension( 40, 40));
        homeButton.setBounds(10,10, 40,40);
        homeButton.setBackground(Color.GRAY);
        homeButton.setBorder(border);
        homeButton.setFocusable(false);
        homeButton.setLayout(null);
        homeButton.setIcon(MainWindowGUI.homeIcon); // adds image on newlabel
        homeButton.addActionListener(new DifficultyWindow());

        //////////////////////////////////////////////    PokSprites    ///////////////////////////////////////////////////////////
        pokSet1 = new JLabel();
        pokSet2 = new JLabel();
        pokSet3 = new JLabel();
        pokSet4 = new JLabel();
        pokSet5 = new JLabel();

        ////////////////////        pokSet1       //////////////////////
        pokSet1.setBounds(20, 40, 220, 500);
        pokSet1.setIcon(gym1);
        gym1Panel.add(pokSet1);

        pokSet2.setBounds(20, 40, 220, 500);
        pokSet2.setIcon(gym2);
        gym2Panel.add(pokSet2);

        pokSet3.setBounds(20, 40, 220, 490);
        pokSet3.setIcon(gym3);
        gym3Panel.add(pokSet3);

        pokSet4.setBounds(20, 40, 220, 500);
        pokSet4.setIcon(gym4);
        gym4Panel.add(pokSet4);

        pokSet5.setBounds(30, 50, 220, 497);
        pokSet5.setIcon(gym5);
        gym5Panel.add(pokSet5);
        


        
        PANEL.add(homeButton);
        PANEL.add(head);
        PANEL.add(backGround);
        dwFrame.setVisible(true);
    }
    
    public static void main(String[] args) {
        createDW();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==homeButton){
            MainWindowGUI.createFrame();
            dwFrame.setVisible(false);
        }
        else if (e.getSource()== gym1Button){
            gymIndex=1;
            SelectionWindow.userSelection();
            dwFrame.setVisible(false);
        }
        else if (e.getSource()== gym2Button){
            gymIndex=2;
            SelectionWindow.userSelection();
            dwFrame.setVisible(false);
        }
        else if (e.getSource()== gym3Button){
            gymIndex=3;
            SelectionWindow.userSelection();
            dwFrame.setVisible(false);
        }
        else if (e.getSource()== gym4Button){
            gymIndex=4;
            SelectionWindow.userSelection();
            dwFrame.setVisible(false);
        }
        else if (e.getSource()== gym5Button){
            SelectPokemon.addInSet();
            gymIndex=5;
            SelectionWindow.index=5;
            dwFrame.setVisible(false);
            BattleWindow.battle();
        }

    }
}
