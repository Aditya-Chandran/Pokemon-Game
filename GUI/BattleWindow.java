package GUI;
import GUI.*;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import static_database.*;
import GUIMechanics.*;
import mechanics.BattleMechanics;
import java.util.*;

public class BattleWindow implements ActionListener{
    
    static Border border = BorderFactory.createRaisedBevelBorder();
    static JFrame battleFrame = new JFrame();
    static BattleWindow obj2 = new BattleWindow();
    static JButton Button2 = new JButton();
    static JButton moveButton1 = new JButton();
    static JButton moveButton2 = new JButton();
    static JButton moveButton3 = new JButton();
    static JButton moveButton4 = new JButton();
    static JLabel myUpdateLabel = new JLabel();
    static JLabel gymUpdateLabel = new JLabel();
    static JLabel statusLabel=new JLabel();
    static String gymPokImage,myPokImage;
    static ImageIcon backgroundImage = new ImageIcon(".\\images\\battleSequence.png");
    static Pokemon myPok[],gymPok[];
    public static int a=0,b=0;
    static String status,myStatus,gymStatus;

    
    public static void main(String[] args) {
        battle();
        
    }
    
    public static void set(Pokemon gym[],Pokemon my[]){
        gymPok=gym;
        myPok=my;
        status="    You sent "+myPok[a].pokName+" and opponent sent "+gymPok[b].pokName;
        battle();
    }

    public static void myCheckHealth(){
        if(myPok[a].pokHealth<=0){
            status="    "+myPok[a].pokName+" fainted.";
            a++;
        }
        if(a>=3){
            JOptionPane.showMessageDialog(battleFrame, "        YOU LOST !", "Battle", JOptionPane.PLAIN_MESSAGE);
            DifficultyWindow.createDW();
            battleFrame.dispose();
        }
    }

    public static void gymCheckHealth(){
        if(gymPok[b].pokHealth<=0){
            status="    "+gymPok[b].pokName+" fainted.";
            b++;
        }
        if(b>=3){
            JOptionPane.showMessageDialog(battleFrame, "        YOU WON !", "Battle", JOptionPane.PLAIN_MESSAGE);
            DifficultyWindow.createDW();
            battleFrame.dispose();
        }
    }


    public static void battle(){
        myPokImage=myPok[a].pokSprite;
        gymPokImage=gymPok[b].pokSprite;
        ImageIcon userLogo = new ImageIcon(myPokImage);
        ImageIcon oppLogo = new ImageIcon(gymPokImage);
        JLabel pokeLabel1 = new JLabel();
        JLabel pokeLabel2 = new JLabel();
        JPanel Panel1 = new JPanel();
        JPanel Panel2 = new JPanel();
        JPanel Panel3 = new JPanel();
        JPanel Panel4 = new JPanel();
        JPanel textUpdate = new JPanel();
        JPanel healthPaneluser = new JPanel();
        JPanel healthPanelopp = new JPanel();
        JLabel bgLabel = new JLabel(); // create label and title
        JPanel homeButtonPanel = new JPanel();
        Button2 = new JButton();
        moveButton1 = new JButton();
        moveButton2 = new JButton();
        moveButton3 = new JButton();
        moveButton4 = new JButton();
        battleFrame = new JFrame("Pokemon Game");

        battleFrame.setBounds(0, 0, 1440, 850); // sets size dimensions
        battleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit the program on close
        battleFrame.setResizable(false); // Prevent newFrame from resize
        battleFrame.setIconImage(MainWindowGUI.imageTitle.getImage()); // create icon of newFrame
        battleFrame.getContentPane().setBackground(new Color(0, 0, 100)); // change color background
        battleFrame.setVisible(true); // make newFrame visible
        battleFrame.setLayout(null);
        battleFrame.setLocationRelativeTo(null);
        
        Panel1.setBounds(0, 0, 1424, 808);
        Panel1.setBackground(new Color(0,0,100));
        Panel1.setLayout(null);
        Panel1.setBorder(BorderFactory.createLineBorder(Color.RED));
        battleFrame.add(Panel1);

        healthPanelopp.setBounds(1020,10,200,40);
        healthPanelopp.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        healthPanelopp.setLayout(null);
        Panel1.add(healthPanelopp);
        JLabel healthLabelopp = new JLabel();
        healthLabelopp.setBounds(50,0,200,40);
        healthLabelopp.setText("    HEALTH : "+gymPok[b].pokHealth);
        healthPanelopp.add(healthLabelopp);
        
        healthPaneluser.setBounds(80,150,200,40);
        healthPaneluser.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        healthPaneluser.setLayout(null);
        Panel1.add(healthPaneluser);
        JLabel healthLabeluser = new JLabel();
        healthLabeluser.setBounds(50,0,200,40);
        // int i=0,j=0;
        healthLabeluser.setText("    HEALTH : "+myPok[a].pokHealth);
        healthPaneluser.add(healthLabeluser);

        Panel2.setBounds(0,550, 1424, 258);
        Panel2.setBackground(new Color(0,100,100));
        // Panel2.setBorder(BorderFactory.createLineBorder(Color.RED));
        Panel2.setLayout(null);
        Panel2.setOpaque(false);
        Panel1.add(Panel2);
        
        homeButtonPanel.setBounds(8, 8, 40, 40);
        homeButtonPanel.setBackground(new Color(0,0,100));
        homeButtonPanel.setLayout(null);
        // Button2.setPreferredSize(new Dimension(40, 40));
        Button2.setBounds(0,0,40,40);
        Button2.setBackground(Color.GRAY);
        Button2.setBorder(border);
        Button2.setFocusable(false);
        Button2.setLayout(null);
        Button2.setIcon(MainWindowGUI.homeIcon); // adds image on newlabel
        Button2.addActionListener(obj2);
        homeButtonPanel.add(Button2);
        Panel1.add(homeButtonPanel);

        moveButton1.setPreferredSize(new Dimension(100, 100));
        moveButton1.setBackground(Color.GRAY);
        moveButton1.setForeground(Color.BLACK);
        moveButton1.setBorder(border);
        moveButton1.setFocusable(false);
        moveButton1.setLayout(null);
        moveButton1.addActionListener(obj2);
        moveButton1.setBounds(20,20,685,100);
        moveButton1.setText(myPok[a].move1.moveName);
        moveButton1.setFont(new Font("consolas",Font.BOLD,30));
        Panel2.add(moveButton1);
        moveButton1.addActionListener(new BattleWindow());
        
        moveButton2.setPreferredSize(new Dimension(100, 100));
        moveButton2.setBackground(Color.GRAY);
        moveButton2.setBorder(border);
        moveButton2.setFocusable(false);
        moveButton2.setLayout(null);
        moveButton2.addActionListener(obj2);
        moveButton2.setBounds(715,20,685,100);
        moveButton2.setText(myPok[a].move2.moveName);
        moveButton2.setForeground(Color.BLACK);
        moveButton2.setFont(new Font("consolas",Font.BOLD,30));
        Panel2.add(moveButton2);
        moveButton2.addActionListener(new BattleWindow());

        
        moveButton3.setPreferredSize(new Dimension(100, 100));
        moveButton3.setBackground(Color.GRAY);
        moveButton3.setBorder(border);
        moveButton3.setFocusable(false);
        moveButton3.setLayout(null);
        moveButton3.addActionListener(obj2);
        moveButton3.setBounds(20,130,685,100);
        moveButton3.setText(myPok[a].move3.moveName);
        moveButton3.setForeground(Color.BLACK);
        moveButton3.setFont(new Font("consolas",Font.BOLD,30));
        Panel2.add(moveButton3);
        moveButton3.addActionListener(new BattleWindow());

        
        moveButton4.setPreferredSize(new Dimension(100, 100));
        moveButton4.setBackground(Color.GRAY);
        moveButton4.setBorder(border);
        moveButton4.setFocusable(false);
        moveButton4.setLayout(null);
        moveButton4.addActionListener(obj2);
        moveButton4.setBounds(715,130,685,100);
        moveButton4.setText(myPok[a].move4.moveName);
        moveButton4.setFont(new Font("consolas",Font.BOLD,30));
        moveButton4.setForeground(Color.BLACK);
        Panel2.add(moveButton4);
        moveButton4.addActionListener(new BattleWindow());


        Panel3.setBounds(60,190, 300, 300);
        Panel3.setBackground(new Color(0,100,100));
        pokeLabel2.setBounds(1,500,300,300);
        pokeLabel2.setIcon(userLogo);
        pokeLabel2.setVerticalAlignment(JLabel.BOTTOM);
        pokeLabel2.setHorizontalAlignment(JLabel.RIGHT);        
        // Panel3.setBorder(BorderFactory.createLineBorder(Color.RED));
        Panel3.add(pokeLabel2);
        Panel3.setOpaque(false);
        Panel1.add(Panel3);
        Panel4.setBounds(1020,50, 300,300);
        Panel4.setBackground(new Color(0,100,100));
        Panel4.setOpaque(false);
        pokeLabel1.setIcon(oppLogo);
        pokeLabel1.setVerticalAlignment(JLabel.BOTTOM);
        pokeLabel1.setHorizontalAlignment(JLabel.LEFT);        
        // Panel4.setBorder(BorderFactory.createLineBorder(Color.RED));
        Panel4.add(pokeLabel1);
        Panel1.add(Panel4);

        textUpdate.setBounds(450, 450, 500, 100);
        textUpdate.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        textUpdate.setLayout(null);
        Panel1.add(textUpdate);

        
        myUpdateLabel.setBounds(0,0,500,40);
        myUpdateLabel.setText(myStatus);
        textUpdate.add(myUpdateLabel);

        gymUpdateLabel.setBounds(0,25,500,40);
        gymUpdateLabel.setText(gymStatus);
        textUpdate.add(gymUpdateLabel);

        statusLabel.setBounds(0,50,500,40);
        statusLabel.setText(status);
        textUpdate.add(statusLabel);

        bgLabel.setBounds(0,0,1440,850);
        bgLabel.setIcon(backgroundImage);
        Panel1.add(bgLabel);
    }

    public static void myPokDamage(int i){
        int damage=0;
        if(i==1){
            damage=BattleMechanics.doDamage(myPok[a].move1, gymPok[b]);
            myStatus="    "+myPok[a].pokName+" used "+myPok[a].move1.moveName+" and did "+damage+" damage to "+gymPok[b].pokName;
        }
        if(i==2){
            damage=BattleMechanics.doDamage(myPok[a].move2, gymPok[b]);
            myStatus="    "+myPok[a].pokName+" used "+myPok[a].move2.moveName+" and did "+damage+" damage to "+gymPok[b].pokName;
        }
        if(i==3){
            damage=BattleMechanics.doDamage(myPok[a].move3, gymPok[b]);
            myStatus="    "+myPok[a].pokName+" used "+myPok[a].move3.moveName+" and did "+damage+" damage to "+gymPok[b].pokName;
        }
        if(i==4){
            damage=BattleMechanics.doDamage(myPok[a].move4, gymPok[b]);
            myStatus="    "+myPok[a].pokName+" used "+myPok[a].move4.moveName+" and did "+damage+" damage to "+gymPok[b].pokName;
        }
        gymPok[b].pokHealth-=damage;
    }

    public static void gymPokDamage(){
        Random rand=new Random();
        int m=rand.nextInt(4);
        int damage=0;
        if(m==0){
            damage=BattleMechanics.doDamage(gymPok[b].move1,myPok[a]);
            myPok[a].pokHealth-=damage;
            gymStatus="    "+gymPok[b].pokName+" used "+gymPok[b].move1.moveName+" and did "+damage+" damage to "+myPok[a].pokName;
        }
        else if(m==1){
            damage=BattleMechanics.doDamage(gymPok[b].move2,myPok[a]);
            myPok[a].pokHealth-=damage;
            gymStatus="    "+gymPok[b].pokName+" used "+gymPok[b].move2.moveName+" and did "+damage+" damage to "+myPok[a].pokName;
        }
        else if(m==2){
            damage=BattleMechanics.doDamage(gymPok[b].move3,myPok[a]);
            myPok[a].pokHealth-=damage;
            gymStatus="    "+gymPok[b].pokName+" used "+gymPok[b].move3.moveName+" and did "+damage+" damage to "+myPok[a].pokName;
        }
        else if(m==3){
            damage=BattleMechanics.doDamage(gymPok[b].move4,myPok[a]);
            myPok[a].pokHealth-=damage;
            gymStatus="    "+gymPok[b].pokName+" used "+gymPok[b].move4.moveName+" and did "+damage+" damage to "+myPok[a].pokName;
        }
        myCheckHealth();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Button2){
            DifficultyWindow.createDW();
            battleFrame.dispose();
        }
        if (e.getSource()==moveButton1){
            myPokDamage(1);
            status="";
            gymCheckHealth();
            gymPokDamage();
            battleFrame.dispose();
            battle();
        }
        if (e.getSource()==moveButton2){
            myPokDamage(2);
            status="";
            gymCheckHealth();
            gymPokDamage();
            battleFrame.dispose();
            battle();
        }
        if (e.getSource()==moveButton3){
            myPokDamage(3);
            status="";
            gymCheckHealth();
            gymPokDamage();
            battleFrame.dispose();
            battle();
        }
        if (e.getSource()==moveButton4){
            myPokDamage(4);
            status="";
            gymCheckHealth();
            gymPokDamage();
            battleFrame.dispose();
            battle();
        }
    }
}
