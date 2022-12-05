package GUI;

import GUI.*;
import GUIMechanics.GUImech;
import mechanics.*;
import static_database.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class SelectionWindow implements ActionListener {

    public static JFrame usFrame;
    public static JPanel usPANEL, us1Panel, us2Panel, us3Panel, us4Panel, us5Panel;
    public static JButton us1Button, us2Button, us3Button, us4Button, us5Button, homeButton;
    public static JLabel backGround, head, userSet1, userSet2, userSet3, userSet4, userSet5;
    static Border border = BorderFactory.createRaisedBevelBorder();
    static ImageIcon icon = new ImageIcon("./images/Background.png");
    static ImageIcon iconHead = new ImageIcon("./images/PokemonMainLogo.png");
    static ImageIcon user1 = new ImageIcon("./images/user1.png");
    static ImageIcon user2 = new ImageIcon("./images/user2.png");
    static ImageIcon user3 = new ImageIcon("./images/user3.png");
    static ImageIcon user4 = new ImageIcon("./images/user4.png");
    static ImageIcon user5 = new ImageIcon("./images/user5.png");
    static int index;

    public static void main(String[] args) {
        userSelection();
    }

    public static void userSelection() {

        ///////////////////////////////////////////// FRAME
        ///////////////////////////////////////////// //////////////////////////////////////////////////////////

        usFrame = new JFrame();
        usFrame.setIconImage(MainWindowGUI.imageTitle.getImage());
        usFrame.setSize(1440, 850);
        usFrame.setResizable(false);
        usFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit the program on close
        usFrame.setLayout(null);
        usFrame.setLocationRelativeTo(null);
        usFrame.setTitle("Pokemon");

        ////////////////////////////////////////////// PANELS
        ////////////////////////////////////////////// ///////////////////////////////////////////////////////////
        usPANEL = new JPanel();
        us1Panel = new JPanel();
        us2Panel = new JPanel();
        us3Panel = new JPanel();
        us4Panel = new JPanel();
        us5Panel = new JPanel();

        ///////////////////// mainPanel ///////////////////////
        usPANEL.setBackground(new Color(0, 0, 0));
        usPANEL.setPreferredSize(new Dimension(1440, 850));
        usPANEL.setBounds(0, 0, 1440, 850);
        usPANEL.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        usPANEL.setLayout(null);
        usFrame.add(usPANEL);

        //////////////////// us1Panel //////////////////////

        us1Panel.setBackground(new Color(150, 150, 150));
        us1Panel.setPreferredSize(new Dimension(1424, 808));
        us1Panel.setBounds(50, 250, 220, 500);
        us1Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        us1Panel.setLayout(null);
        usPANEL.add(us1Panel);

        //////////////////// us2Panel //////////////////////

        us2Panel.setBackground(new Color(150, 150, 150));
        us2Panel.setPreferredSize(new Dimension(1424, 808));
        us2Panel.setBounds(320, 250, 220, 500);
        us2Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        us2Panel.setLayout(null);
        usPANEL.add(us2Panel);

        //////////////////// us3Panel //////////////////////

        us3Panel.setBackground(new Color(150, 150, 150));
        us3Panel.setPreferredSize(new Dimension(1424, 808));
        us3Panel.setBounds(590, 250, 220, 500);
        us3Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        us3Panel.setLayout(null);
        usPANEL.add(us3Panel);

        //////////////////// us4Panel //////////////////////

        us4Panel.setBackground(new Color(150, 150, 150));
        us4Panel.setPreferredSize(new Dimension(1424, 808));
        us4Panel.setBounds(860, 250, 220, 500);
        us4Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        us4Panel.setLayout(null);
        usPANEL.add(us4Panel);

        //////////////////// us5Panel //////////////////////

        us5Panel.setBackground(new Color(150, 150, 150));
        us5Panel.setPreferredSize(new Dimension(1424, 808));
        us5Panel.setBounds(1130, 250, 220, 500);
        us5Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        us5Panel.setLayout(null);
        usPANEL.add(us5Panel);

        ////////////////////////////////////////////// BUTTONS
        ////////////////////////////////////////////// ///////////////////////////////////////////////////////////
        us1Button = new JButton();
        us2Button = new JButton();
        us3Button = new JButton();
        us4Button = new JButton();
        us5Button = new JButton();

        //////////////////// us1Button //////////////////////

        us1Button.setBounds(0, 0, 220, 90);
        us1Button.setBackground(new Color(99, 99, 99));
        us1Button.setFont(new Font("comic sans ms", Font.BOLD, 30));
        us1Button.setForeground(new Color(0, 0, 0));
        us1Button.setText("User Set 1");
        us1Button.setFocusable(false);
        us1Button.setBorder(border);
        us1Panel.add(us1Button);
        us1Button.addActionListener(new SelectionWindow());

        //////////////////// us2Button //////////////////////

        us2Button.setBounds(0, 0, 220, 90);
        us2Button.setBackground(new Color(99, 99, 99));
        us2Button.setFont(new Font("comic sans ms", Font.BOLD, 30));
        us2Button.setForeground(new Color(0, 0, 0));
        us2Button.setText("User Set 2");
        us2Button.setFocusable(false);
        us2Button.setBorder(border);
        us2Panel.add(us2Button);
        us2Button.addActionListener(new SelectionWindow());

        //////////////////// us3Button //////////////////////

        us3Button.setBounds(0, 0, 220, 90);
        us3Button.setBackground(new Color(99, 99, 99));
        us3Button.setFont(new Font("comic sans ms", Font.BOLD, 30));
        us3Button.setForeground(new Color(0, 0, 0));
        us3Button.setText("User Set 3");
        us3Button.setFocusable(false);
        us3Button.setBorder(border);
        us3Panel.add(us3Button);
        us3Button.addActionListener(new SelectionWindow());

        //////////////////// us4Button //////////////////////

        us4Button.setBounds(0, 0, 220, 90);
        us4Button.setBackground(new Color(99, 99, 99));
        us4Button.setFont(new Font("comic sans ms", Font.BOLD, 30));
        us4Button.setForeground(new Color(0, 0, 0));
        us4Button.setText("User Set 4");
        us4Button.setFocusable(false);
        us4Button.setBorder(border);
        us4Panel.add(us4Button);
        us4Button.addActionListener(new SelectionWindow());

        //////////////////// us5Button //////////////////////

        us5Button.setBounds(0, 0, 220, 90);
        us5Button.setBackground(new Color(99, 99, 99));
        us5Button.setFont(new Font("comic sans ms", Font.BOLD, 30));
        us5Button.setForeground(new Color(0, 0, 0));
        us5Button.setText("User Set 5");
        us5Button.setFocusable(false);
        us5Button.setBorder(border);
        us5Panel.add(us5Button);
        us5Button.addActionListener(new SelectionWindow());

        ////////////////////////////////////////////// LABELS
        ////////////////////////////////////////////// ///////////////////////////////////////////////////////////

        backGround = new JLabel();
        backGround.setBounds(0, 0, 1440, 850);
        backGround.setIcon(icon);

        head = new JLabel();
        head.setIcon(iconHead);
        head.setBounds(0, 30, 1440, 850);
        head.setVerticalAlignment(JLabel.TOP);
        head.setHorizontalAlignment(JLabel.CENTER);

        ////////////////////////////////////////////// HOME BUTTON
        ////////////////////////////////////////////// ///////////////////////////////////////////////////////////
        homeButton = new JButton();
        homeButton.setPreferredSize(new Dimension(40, 40));
        homeButton.setBounds(10, 10, 40, 40);
        homeButton.setBackground(Color.GRAY);
        homeButton.setBorder(border);
        homeButton.setFocusable(false);
        homeButton.setLayout(null);
        homeButton.setIcon(MainWindowGUI.homeIcon); // adds image on newlabel
        homeButton.addActionListener(new SelectionWindow());

        ////////////////////////////////////////////// PokSprites
        ////////////////////////////////////////////// ///////////////////////////////////////////////////////////
        userSet1 = new JLabel();
        userSet2 = new JLabel();
        userSet3 = new JLabel();
        userSet4 = new JLabel();
        userSet5 = new JLabel();

        userSet1.setBounds(10, 40, 220, 500);
        userSet1.setIcon(user1);
        us1Panel.add(userSet1);

        userSet2.setBounds(20, 40, 220, 500);
        userSet2.setIcon(user2);
        us2Panel.add(userSet2);

        userSet3.setBounds(20, 40, 220, 500);
        userSet3.setIcon(user3);
        us3Panel.add(userSet3);

        userSet4.setBounds(10, 50, 220, 470);
        userSet4.setIcon(user4);
        us4Panel.add(userSet4);

        userSet5.setBounds(20, 40, 220, 500);
        userSet5.setIcon(user5);
        us5Panel.add(userSet5);

        usPANEL.add(homeButton);
        usPANEL.add(head);
        usPANEL.add(backGround);
        usFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == homeButton) {
            DifficultyWindow.createDW();
            usFrame.setVisible(false);
        }
        if (e.getSource() == us1Button) {
            SelectPokemon.addInSet();
            index = 0;
            usFrame.setVisible(false);
            // BattleWindow.battle();
            GUImech.setPok(index, DifficultyWindow.gymIndex);
        }
        if (e.getSource() == us2Button) {
            SelectPokemon.addInSet();
            index = 1;
            usFrame.setVisible(false);
            // BattleWindow.battle();
            GUImech.setPok(index, DifficultyWindow.gymIndex);

        }
        if (e.getSource() == us3Button) {
            SelectPokemon.addInSet();
            index = 2;
            usFrame.setVisible(false);
            // BattleWindow.battle();
            GUImech.setPok(index, DifficultyWindow.gymIndex);
        }
        if (e.getSource() == us4Button) {
            SelectPokemon.addInSet();
            index = 3;
            usFrame.setVisible(false);
            // BattleWindow.battle();
            GUImech.setPok(index, DifficultyWindow.gymIndex);
        }
        if (e.getSource() == us5Button) {
            SelectPokemon.addInSet();
            index = 4;
            usFrame.setVisible(false);
            // BattleWindow.battle();
            GUImech.setPok(index, DifficultyWindow.gymIndex);
        }

    }
}
