package GUI;
import GUI.*;
import mechanics.SelectPokemon;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import static_database.*;

public class BattleWindow implements ActionListener{
    
    static Border border = BorderFactory.createRaisedBevelBorder();
    static JFrame battleFrame = new JFrame();
    static BattleWindow obj2 = new BattleWindow();
    static JButton Button2 = new JButton();
    static JButton moveButton1 = new JButton();
    static JButton moveButton2 = new JButton();
    static JButton moveButton3 = new JButton();
    static JButton moveButton4 = new JButton();
    static ImageIcon backgroundImage = new ImageIcon(".\\images\\battleSequence.png");

    
    public static void main(String[] args) {
        battle();
        
    }
    
    public static void battle(){
        SelectPokemon.addInSet();
        DifficultyWindow.gymList=AllGyms.getGym(DifficultyWindow.gymIndex);
        Pokemon.addPokemons();
        ImageIcon userLogo = new ImageIcon(SelectPokemon.pokemonSet[SelectionWindow.index][0].pokSprite);
        ImageIcon oppLogo = new ImageIcon(DifficultyWindow.gymList.gymPok[0].pokSprite);
        JLabel pokeLabel1 = new JLabel();
        JLabel pokeLabel2 = new JLabel();
        JPanel Panel1 = new JPanel();
        JPanel Panel2 = new JPanel();
        JPanel Panel3 = new JPanel();
        JPanel Panel4 = new JPanel();
        JPanel Panel5 = new JPanel();
        JLabel bgLabel = new JLabel(); // create label and title
        JPanel homeButtonPanel = new JPanel();
        BattleWindow move1 = new BattleWindow();
        BattleWindow move2 = new BattleWindow();
        BattleWindow move3 = new BattleWindow();
        BattleWindow move4 = new BattleWindow();
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
        
        Panel2.setBounds(0,550, 1424, 258);
        Panel2.setBackground(new Color(0,100,100));
        Panel2.setBorder(BorderFactory.createLineBorder(Color.RED));
        Panel2.setLayout(null);
        Panel1.add(Panel2);
        
        homeButtonPanel.setBounds(8, 8, 50, 50);
        homeButtonPanel.setBackground(new Color(0,0,100));
        Button2.setPreferredSize(new Dimension(40, 40));
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
        moveButton1.setText("move1");
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
        moveButton2.setText("move2");
        moveButton2.setForeground(Color.BLACK);
        moveButton2.setFont(new Font("consolas",Font.BOLD,30));
        Panel2.add(moveButton2);
        
        moveButton3.setPreferredSize(new Dimension(100, 100));
        moveButton3.setBackground(Color.GRAY);
        moveButton3.setBorder(border);
        moveButton3.setFocusable(false);
        moveButton3.setLayout(null);
        moveButton3.addActionListener(obj2);
        moveButton3.setBounds(20,130,685,100);
        moveButton3.setText("move3");
        moveButton3.setForeground(Color.BLACK);
        moveButton3.setFont(new Font("consolas",Font.BOLD,30));
        Panel2.add(moveButton3);
        
        moveButton4.setPreferredSize(new Dimension(100, 100));
        moveButton4.setBackground(Color.GRAY);
        moveButton4.setBorder(border);
        moveButton4.setFocusable(false);
        moveButton4.setLayout(null);
        moveButton4.addActionListener(obj2);
        moveButton4.setBounds(715,130,685,100);
        moveButton4.setText("move4");
        moveButton4.setFont(new Font("consolas",Font.BOLD,30));
        moveButton4.setForeground(Color.BLACK);
        Panel2.add(moveButton4);

        Panel3.setBounds(60,190, 300, 300);
        Panel3.setBackground(new Color(0,100,100));
        pokeLabel2.setIcon(userLogo);
        pokeLabel2.setVerticalAlignment(JLabel.BOTTOM);
        pokeLabel2.setHorizontalAlignment(JLabel.RIGHT);        
        Panel3.setBorder(BorderFactory.createLineBorder(Color.RED));
        Panel3.add(pokeLabel2);
        Panel1.add(Panel3);

        Panel4.setBounds(1020,50, 300,300);
        Panel4.setBackground(new Color(0,100,100));
        pokeLabel1.setIcon(oppLogo);
        pokeLabel1.setVerticalAlignment(JLabel.BOTTOM);
        pokeLabel1.setHorizontalAlignment(JLabel.LEFT);        
        Panel4.setBorder(BorderFactory.createLineBorder(Color.RED));
        Panel4.add(pokeLabel1);
        Panel1.add(Panel4);

        bgLabel.setBounds(0,0,1440,850);
        bgLabel.setIcon(backgroundImage);
        Panel1.add(bgLabel);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Button2){
            DifficultyWindow.createDW();
            battleFrame.setVisible(false);
        }
        if (e.getSource()==moveButton1){
            
        }
        if (e.getSource()==moveButton2){
            
        }
        if (e.getSource()==moveButton3){
            
        }
        if (e.getSource()==moveButton4){
            
        }
    }
}
