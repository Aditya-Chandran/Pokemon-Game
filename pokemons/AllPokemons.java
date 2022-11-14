package pokemons;
import java.util.*;

public class AllPokemons {
    public int pokemonType;
    public String pokemonName;

    public static ArrayList<AllPokemons> pokemonList=new ArrayList<>();
    
    AllPokemons(String pokemonName, int pokemonType){
        this.pokemonName=pokemonName;
        this.pokemonType=pokemonType;
    }

    public static void addPokemons(){
        AllPokemons charmander=new AllPokemons("Charmander",1);
        pokemonList.add(charmander);
    }
}