package mechanics;

import static_database.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SelectPokemon {
    public static void SelectPok(String userName){
        Pokemon.addPokemons();
        Scanner input=new Scanner(System.in);
        System.out.print("\n    Select a pokemon : ");
        int num=input.nextInt();
        Pokemon p=Pokemon.pokList.get(num);
        String pokemonName=p.pokName;
        try{
            File file=new File("userData\\"+userName+"\\"+pokemonName+".txt");
            if(file.createNewFile()){
                System.out.println("\n  "+pokemonName+" is now yours.");
                FileWriter fw = new FileWriter("userData\\"+userName+"\\"+pokemonName+".txt");
                fw.write(p.pokName+"\n"+p.pokType+"\n"+p.pokSpeed+"\n"+p.pokLevel+"\n"+p.pokSprite);
                fw.close();
            }
            else{
                System.out.println("\n  You already have selected "+pokemonName);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
