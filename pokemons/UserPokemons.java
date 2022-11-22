package pokemons;
import java.util.*;

public class UserPokemons{
    int level=0, health, speed, type;
    String name;
    public static ArrayList<UserPokemons> userPokemonList = new ArrayList<UserPokemons>();

    UserPokemons(){
    }

    public static void addUserPokemons(UserPokemons pokemon){
        userPokemonList.add(pokemon);
    }
}  