package mainData;
import moves.*;
import pokemons.*;
import java.util.*;


class PokemonAttributes {
    public int damageGiven, damageTaken, level=0, maxHealth;
    public int[] moves=new int[4];
    public void increaseHealth(){
        maxHealth += level*0.25*maxHealth ;
    }
}

class Mechanics extends PokemonAttributes{
    float constantTaken=1, constantGiven=1;
    public void damage(){
        damageTaken *= level*constantTaken;
        damageGiven *= level*constantGiven;
    }
}

// class Types{
//     class FireType extends Mechanics {
//         {
//             if (pokemonType == 1)
//             {
//                 constantGiven = 1;
//                 constantTaken = 1;
//             }
//             else if (pokemonType == 2)
//             {
//                 constantGiven = 0.75f;
//                 constantTaken = 1.25f;
//             }
//             else if (pokemonType == 3)
//             {
//                 constantGiven = 1.25f;
//                 constantTaken = 0.75f;
//             }
//         }
//     }
    
//     class WaterType extends Mechanics {
//         {
//             if (pokemonType == 1)
//             {
//                 constantGiven = 1.25f;
//                 constantTaken = 0.75f;
//             }
//             else if (pokemonType == 2)
//             {
//                 constantGiven = 1;
//                 constantTaken = 1;
//             }
//             else if (pokemonType == 3)
//             {
//                 constantTaken = 1.25f;
//                 constantGiven = 0.75f;
//             }
//         }
    
//     }
    
//     class GrassType extends Mechanics {
//         {
//             if (pokemonType == 1)
//             {
//                 constantGiven = 0.75f;
//                 constantTaken = 1.25f;
//             }
//             else if (pokemonType == 2)
//             {
//                 constantTaken = 0.75f;
//                 constantGiven = 1.25f;
//             }
//             else if (pokemonType == 3)
//             {
//                 constantGiven = 1;
//                 constantTaken = 1;
//             }
//         }
//     }
// }

public class MainGame{
    public static void main(String[] args) {
        AllPokemons.addPokemons();
        PokemonMoves.addMoves();
        System.out.println(AllPokemons.pokemonList.size());
        System.out.println(AllPokemons.pokemonList.get(0).pokemonName);
    }
}
