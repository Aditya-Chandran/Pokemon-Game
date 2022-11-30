package GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;


public class DifficultyWindow {
    
    public static JFrame dwFrame;
    public static JPanel PANEL,gym1Panel, gym2Panel, gym3Panel, gym4Panel, gym5Panel;;
    public static JButton gym1Button,gym2Button, gym3Button, gym4Button, gym5Button;
    static Border border = BorderFactory.createRaisedBevelBorder();


    public static void createDW()
    {   
        /////////////////////////////////////////////       FRAME     //////////////////////////////////////////////////////////

        dwFrame = new JFrame();
        dwFrame.setIconImage(MainWindowGUI.imageTitle.getImage());
        dwFrame.setSize(1920, 1080);
        dwFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit the program on close
        dwFrame.setLayout(null);
        dwFrame.setTitle("Pokemon");
        
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


        ////////////////////        gym1Button       //////////////////////

        gym1Button.setBounds(0, 0, 400, 250);
        gym1Button.setBackground(new Color(0, 99,0));
        gym1Button.setFont(new Font("comic sans ms", Font.BOLD, 30));
        gym1Button.setForeground(new Color(0, 0, 0));
        gym1Button.setText("GYM 1 : EASY");
        gym1Button.setFocusable(false);
        gym1Button.setBorder(border);
        gym1Panel.add(gym1Button);


        ////////////////////        gym1Button       //////////////////////

        gym1Button.setBounds(0, 0, 400, 250);
        gym1Button.setBackground(new Color(0, 99,0));
        gym1Button.setFont(new Font("comic sans ms", Font.BOLD, 30));
        gym1Button.setForeground(new Color(0, 0, 0));
        gym1Button.setText("GYM 1 : EASY");
        gym1Button.setFocusable(false);
        gym1Button.setBorder(border);
        gym1Panel.add(gym1Button);


        ////////////////////        gym1Button       //////////////////////

        gym1Button.setBounds(0, 0, 400, 250);
        gym1Button.setBackground(new Color(0, 99,0));
        gym1Button.setFont(new Font("comic sans ms", Font.BOLD, 30));
        gym1Button.setForeground(new Color(0, 0, 0));
        gym1Button.setText("GYM 1 : EASY");
        gym1Button.setFocusable(false);
        gym1Button.setBorder(border);
        gym1Panel.add(gym1Button);
        

        ////////////////////        gym1Button       //////////////////////
        
        gym1Button.setBounds(0, 0, 400, 250);
        gym1Button.setBackground(new Color(0, 99,0));
        gym1Button.setFont(new Font("comic sans ms", Font.BOLD, 30));
        gym1Button.setForeground(new Color(0, 0, 0));
        gym1Button.setText("GYM 1 : EASY");
        gym1Button.setFocusable(false);
        gym1Button.setBorder(border);
        gym1Panel.add(gym1Button);

        
        dwFrame.setVisible(true);
    }

    public static void main(String[] args) {
        createDW();
    }
}
