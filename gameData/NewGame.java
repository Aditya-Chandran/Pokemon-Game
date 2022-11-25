package gameData;

import java.io.*;
import java.util.*;

public class NewGame {
    public String newUser(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n    Enter username : ");
        String userName= input.nextLine();
        File file=new File("userData\\"+userName);
        if(file.mkdir()){
            System.out.println("\n  Account created.");
            return userName;
        }
        else{
            System.out.print("\n    This username already exists.");
            return "";
        }
    }
}
