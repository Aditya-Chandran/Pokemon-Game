package mechanics;

import static_database.*;
import java.util.*;

public class SelectPokemon {
    public static Pokemon pokemonSet[][]=new Pokemon[5][3];
    public static void addInSet(){
        Pokemon.addPokemons();
        ArrayList<Pokemon> pok=Pokemon.pokList;
        
        Pokemon set0[]=new Pokemon[3];
        set0[0]=pok.get(0);
        set0[0].pokLevel=50;

        set0[1]=pok.get(15);
        set0[0].pokLevel=51;

        set0[2]=pok.get(29);
        set0[0].pokLevel=49;

        pokemonSet[0]=set0;
        
        Pokemon set1[]=new Pokemon[3];
        set1[0]=pok.get(5);
        set1[0].pokLevel=53;

        set1[1]=pok.get(18);
        set1[0].pokLevel=48;

        set1[2]=pok.get(49);
        set1[0].pokLevel=51;

        pokemonSet[1]=set1;
        
        Pokemon set2[]=new Pokemon[3];
        set2[0]=pok.get(9);
        set1[0].pokLevel=47;

        set2[1]=pok.get(22);
        set1[0].pokLevel=50;

        set2[2]=pok.get(43);
        set1[0].pokLevel=54;

        pokemonSet[2]=set2;
        
        Pokemon set3[]=new Pokemon[3];
        set2[0]=pok.get(13);
        set1[0].pokLevel=50;

        set2[1]=pok.get(20);
        set1[0].pokLevel=50;

        set2[2]=pok.get(45);
        set1[0].pokLevel=50;

        pokemonSet[3]=set3;
        
        Pokemon set4[]=new Pokemon[3];
        set2[0]=pok.get(7);
        set1[0].pokLevel=45;

        set2[1]=pok.get(31);
        set1[0].pokLevel=52;

        set2[2]=pok.get(46);
        set1[0].pokLevel=50;

        pokemonSet[4]=set4;
    }
}
