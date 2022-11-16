package mainData;
import moves.*;
import pokemons.*;
import java.util.*;

public class MainGame{
    public static void main(String[] args) {
        AllPokemons.addPokemons();
        PokemonMoves.addMoves();
        System.out.println(AllPokemons.pokemonList.size());
        System.out.println(AllPokemons.pokemonList.get(0).pokemonName);

        Scanner input=new Scanner(System.in);
        System.out.print("\n  Select pokemon : ");
        String select=input.next();
        for(int i=0;i<AllPokemons.pokemonList.size();i++){
            if(select.toLowerCase().equals(AllPokemons.pokemonList.get(i).pokemonName.toLowerCase())){
                System.out.print("\n    Congrats! "+AllPokemons.pokemonList.get(i).pokemonName+" is now yours."+(i+1));
                break;
            }
        }
        input.close();
    }
}
