package GUI;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class DifficultyWindow implements ActionListener {
    
    public static JFrame dwFrame;
    public static JPanel PANEL,gym1Panel, gym2Panel, gym3Panel, gym4Panel, gym5Panel;;
    public static JButton gym1Button,gym2Button, gym3Button, gym4Button, gym5Button,homeButton;
    public static JLabel backGround, head;
    static Border border = BorderFactory.createRaisedBevelBorder();
    static ImageIcon icon = new ImageIcon("./images/Background.png"); 
    static ImageIcon iconHead = new ImageIcon("./images/PokemonMainLogo.png");


    public static void createDW()
    {   
        /////////////////////////////////////////////       FRAME     //////////////////////////////////////////////////////////

        dwFrame = new JFrame();
        dwFrame.setIconImage(MainWindowGUI.imageTitle.getImage());
        dwFrame.setSize(1920, 1080);
        dwFrame.setResizable(false);
        dwFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit the program on close
        dwFrame.setLayout(null);
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
        PANEL.setPreferredSize(new Dimension(1920, 1080));
        PANEL.setBounds(0, 0, 1920, 1080);
        PANEL.setBorder(BorderFactory.createLineBorder(Color.RED));
        PANEL.setLayout(null);
        dwFrame.add(PANEL);


        
        
        ////////////////////        gym1Panel       //////////////////////
        
        gym1Panel.setBackground(new Color(0, 0, 100));
        gym1Panel.setPreferredSize(new Dimension(1424, 808));
        gym1Panel.setBounds(250, 300, 400, 250);
        gym1Panel.setBorder(BorderFactory.createLineBorder(Color.RED));
        gym1Panel.setLayout(null);
        PANEL.add(gym1Panel);
        
        
        ////////////////////        gym2Panel       //////////////////////
        
        gym2Panel.setBackground(new Color(0, 0, 100));
        gym2Panel.setPreferredSize(new Dimension(1424, 808));
        gym2Panel.setBounds(750, 300, 400, 250);
        gym2Panel.setBorder(BorderFactory.createLineBorder(Color.RED));
        gym2Panel.setLayout(null);
        PANEL.add(gym2Panel);
        
        
        ////////////////////        gym3Panel       //////////////////////
        
        gym3Panel.setBackground(new Color(0, 0, 100));
        gym3Panel.setPreferredSize(new Dimension(1424, 808));
        gym3Panel.setBounds(1250, 300, 400, 250);
        gym3Panel.setBorder(BorderFactory.createLineBorder(Color.RED));
        gym3Panel.setLayout(null);
        PANEL.add(gym3Panel);
        
        
        ////////////////////        gym4Panel       //////////////////////

        gym4Panel.setBackground(new Color(0, 0, 100));
        gym4Panel.setPreferredSize(new Dimension(1424, 808));
        gym4Panel.setBounds(500, 650, 400, 250);
        gym4Panel.setBorder(BorderFactory.createLineBorder(Color.RED));
        gym4Panel.setLayout(null);
        PANEL.add(gym4Panel);
        

        ////////////////////        gym5Panel       //////////////////////
        
        gym5Panel.setBackground(new Color(0, 0, 100));
        gym5Panel.setPreferredSize(new Dimension(1424, 808));
        gym5Panel.setBounds(1000, 650, 400, 250);
        gym5Panel.setBorder(BorderFactory.createLineBorder(Color.RED));
        gym5Panel.setLayout(null);
        PANEL.add(gym5Panel);
        
        
        //////////////////////////////////////////////    BUTTONS    ///////////////////////////////////////////////////////////
        gym1Button = new JButton();
        gym2Button = new JButton();
        gym3Button = new JButton();
        gym4Button = new JButton();
        gym5Button = new JButton();
        
        
        ////////////////////        gym1Button       //////////////////////
        
        gym1Button.setBounds(0, 0, 400, 250);
        gym1Button.setBackground(new Color(0, 99,0));
        gym1Button.setFont(new Font("comic sans ms", Font.BOLD, 30));
        gym1Button.setForeground(new Color(0, 0, 0));
        gym1Button.setText("GYM 1 : EASY");
        gym1Button.setFocusable(false);
        gym1Button.setBorder(border);
        gym1Panel.add(gym1Button);
        
        
        ////////////////////        gym2Button       //////////////////////
        
        gym2Button.setBounds(0, 0, 400, 250);
        gym2Button.setBackground(new Color(90,90,90));
        gym2Button.setFont(new Font("comic sans ms", Font.BOLD, 30));
        gym2Button.setForeground(new Color(0, 0, 0));
        gym2Button.setText("GYM 2 : NORMAL");
        gym2Button.setFocusable(false);
        gym2Button.setBorder(border);
        gym2Panel.add(gym2Button);
        
        
        ////////////////////        gym3Button       //////////////////////
        
        gym3Button.setBounds(0, 0,400, 250);
        gym3Button.setBackground(new Color(90,90,90));
        gym3Button.setFont(new Font("comic sans ms", Font.BOLD, 30));
        gym3Button.setForeground(new Color(0, 0, 0));
        gym3Button.setText("GYM 3 : INTERMEDIATE");
        gym3Button.setFocusable(false);
        gym3Button.setBorder(border);
        gym3Panel.add(gym3Button);
        
        
        ////////////////////        gym4Button       //////////////////////
        
        gym4Button.setBounds(0, 0, 400, 250);
        gym4Button.setBackground(new Color(90,90,90));
        gym4Button.setFont(new Font("comic sans ms", Font.BOLD, 30));
        gym4Button.setForeground(new Color(0, 0, 0));
        gym4Button.setText("GYM 4 : HARD");
        gym4Button.setFocusable(false);
        gym4Button.setBorder(border);
        gym4Panel.add(gym4Button);
        
        
        ////////////////////        gym5Button       //////////////////////
        
        gym5Button.setBounds(0, 0, 400, 250);
        gym5Button.setBackground(new Color(90,90,90));
        gym5Button.setFont(new Font("comic sans ms", Font.BOLD, 30));
        gym5Button.setForeground(new Color(0, 0, 0));
        gym5Button.setText("GYM 5 : EXPERT");
        gym5Button.setFocusable(false);
        gym5Button.setBorder(border);
        gym5Panel.add(gym5Button);

        //////////////////////////////////////////////    LABELS    ///////////////////////////////////////////////////////////

        
        backGround = new JLabel();
        backGround.setBounds(0, 0, 1920, 1080);
        backGround.setIcon(icon);
        
        head = new JLabel();
        head.setIcon(iconHead);
        head.setBounds(0,50,1920,1080);
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
            NewWindow.createNewFrame();
            dwFrame.setVisible(false);
        }

        
    }
}
