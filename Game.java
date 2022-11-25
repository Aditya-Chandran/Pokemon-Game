import java.util.*;
import mainData.*;
import static_database.*;
import mechanics.*;
import gameData.*;

class PokemonGame{
    public static void options(){
        Scanner input=new Scanner(System.in);
        System.out.print("\n    (N) New game    (L) Load game   (E) Exit\n  >>> ");
        String opt=input.next();
        
        if(opt.equalsIgnoreCase("N")){
            NewGame user=new NewGame();
            String userName=user.newUser();
            SelectPokemon.SelectPok(userName);
        }
    }
}

public class Game {
    public static void main(String[] args) {
        PokemonGame.options();
    }
}
