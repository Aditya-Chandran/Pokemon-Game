package mainData;
import moves.*;
import pokemons.*;
import java.util.*;


class UserPokemons {
    public int damageGiven, damageTaken, level=0, maxHealth;
    public int[] moves=new int[4];
    public void increaseHealth(){
        maxHealth += level*0.25*maxHealth ;
    }
}

public class MainGame{
    public static void main(String[] args) {
        AllPokemons.addPokemons();
        PokemonMoves.addMoves();
        System.out.println(AllPokemons.pokemonList.size());
        System.out.println(AllPokemons.pokemonList.get(0).pokemonName);
    }
}
