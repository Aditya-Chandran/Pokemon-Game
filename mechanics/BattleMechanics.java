package mechanics;
import moves.*;
import pokemons.*;

class myBattlePokemon{
    static UserPokemons myPokemons[]=new UserPokemons[3];

    public static void addUserPokemons(UserPokemons pokemon,int i){
        myPokemons[i] = pokemon; 
    }
}
