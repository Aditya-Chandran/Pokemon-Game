package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class NewWindow implements ActionListener{

    static Border border = BorderFactory.createRaisedBevelBorder();
    static JButton Button1;
    static JButton enterButton;
    static JFrame newFrame = new JFrame();
    static NewWindow obj1 = new NewWindow();
    static JTextField NameText = new JTextField();
    public static void main(String[] args) {
        createNewFrame();
    }
    public static void menuPanel(){
        
    }
    public static void createNewFrame(){
        JLabel newLabel = new JLabel();
        JLabel nameLabel = new JLabel();
        JPanel homeButtonPanel = new JPanel();
        JPanel Panel1 = new JPanel();
        JPanel Panel2 = new JPanel();
        JPanel Panel3 = new JPanel();
        NameText = new JTextField();
        enterButton = new JButton();
        Button1 = new JButton();
        newFrame = new JFrame("Pokemon Game");

        newFrame.setBounds(0, 0, 1440, 850); // sets size dimensions
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit the program on close
        newFrame.setResizable(false); // Prevent newFrame from resize
        newFrame.setIconImage(MainWindowGUI.imageTitle.getImage()); // create icon of newFrame
        newFrame.getContentPane().setBackground(new Color(0, 0, 100)); // change color background
        newFrame.setVisible(true); // make newFrame visible
        newFrame.setLayout(null);
        newFrame.setLocationRelativeTo(null);


        homeButtonPanel.setBounds(8, 8, 50, 50);
        homeButtonPanel.setBackground(new Color(0,0,100));
        Panel1.setBounds(0, 0, 1424, 808);
        Panel1.setBackground(new Color(0,0,100));
        Panel1.setLayout(null);
        Panel1.setBorder(BorderFactory.createLineBorder(Color.RED));
        newFrame.add(Panel1);

        //                  MENU BUTTON
        
        Button1.setPreferredSize(new Dimension(40, 40));
        Button1.setBackground(Color.GRAY);
        Button1.setBorder(border);
        Button1.setFocusable(false);
        Button1.setLayout(null);
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
        
        //                      TEXT FIELD

        Panel3.setBackground(new Color(0, 0, 100));
        Panel3.setBounds(480, 310, 500, 200);
        Panel3.setLayout(null);
        Panel3.add(NameText);
        Panel1.add(Panel3);

        NameText.setPreferredSize(new Dimension(400,40));
        NameText.setBounds(50,60,400,40);
        nameLabel.setBounds(55,10,400,40);
        nameLabel.setFont(new Font("consolas",Font.PLAIN,30));
        nameLabel.setText("Enter your name....");
        nameLabel.setForeground(Color.RED);
        Panel3.add(nameLabel);
   
        enterButton.setPreferredSize(new Dimension(80, 40));
        enterButton.setBackground(Color.GRAY);
        enterButton.setBorder(border);
        enterButton.setFocusable(false);
        enterButton.setLayout(null);
        enterButton.setText("ENTER");
        enterButton.setForeground(Color.BLACK);
        enterButton.setBounds(210,125,80,40);
        enterButton.addActionListener(obj1);
        Panel3.add(enterButton);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Button1){
            MainWindowGUI.frame.setVisible(true);
            newFrame.setVisible(false);
        }

        if (e.getSource()==enterButton){
            System.out.println(NameText.getText());
            newFrame.setVisible(false);
            DifficultyWindow.createDW();
        }
    }
}