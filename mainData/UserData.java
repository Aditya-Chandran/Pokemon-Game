package mainData;

import static_database.Pokemon;
import java.util.*;

public class UserData {
    public int userLevel, userName;
    public ArrayList<Pokemon> userPokemonList = new ArrayList<Pokemon>();

    public static void addUserPokemons(Pokemon pok, UserData user){
        user.userPokemonList.add(pok);
    }
}  



