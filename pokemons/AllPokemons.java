package pokemons;
import java.util.*;

public class AllPokemons {
    public int pokemonType, pokemonSpeed;
    public String pokemonName;

    //to store data of all pokemons as a list of objects
    public static ArrayList<AllPokemons> pokemonList=new ArrayList<>();
    
    //initializes object of pokemon data
    AllPokemons(String pokemonName, int pokemonType, int pokemonSpeed){
        this.pokemonName=pokemonName;
        this.pokemonType=pokemonType;
        this.pokemonSpeed=pokemonSpeed;
    }

    public static void addPokemons(){

        // ************************             FIRE TYPE            *************************


        AllPokemons charmander=new AllPokemons("Charmander",1,65);
        pokemonList.add(charmander);

        AllPokemons vulpix=new AllPokemons("Vulpix",1,65);
        pokemonList.add(vulpix);
        
        AllPokemons growlithe=new AllPokemons("Growlithe",1,60);
        pokemonList.add(growlithe);
        
        AllPokemons ponyta=new AllPokemons("Ponyta",1,90);
        pokemonList.add(ponyta);

        AllPokemons magmar=new AllPokemons("Magmar",1,93);
        pokemonList.add(magmar);

        AllPokemons cyndaquil=new AllPokemons("Cyndaquil",1,65);
        pokemonList.add(cyndaquil);

        AllPokemons torchic=new AllPokemons("Torchic",1,45);
        pokemonList.add(torchic);

        
        // ************************             WATER TYPE            *************************


        AllPokemons squirtle=new AllPokemons("Squirtle",2,43);
        pokemonList.add(squirtle);
        
        AllPokemons psyduck=new AllPokemons("Psyduck",2,55);
        pokemonList.add(psyduck);
        
        AllPokemons krabby=new AllPokemons("Krabby",2,50);
        pokemonList.add(krabby);

        AllPokemons totodile=new AllPokemons("Totodile",2,43);
        pokemonList.add(totodile);

        AllPokemons mudkip=new AllPokemons("Mudkip",2,40);
        pokemonList.add(mudkip);
        
        // ************************             GRASS TYPE            *************************


        AllPokemons bulbasaur=new AllPokemons("Bulbasaur",3,45);
        pokemonList.add(bulbasaur);

        AllPokemons chikorita=new AllPokemons("Chikorita",3,45);
        pokemonList.add(chikorita);

        AllPokemons treecko=new AllPokemons("Treecko",3,70);
        pokemonList.add(treecko);
        
        // ************************             FLYING TYPE            *************************


        AllPokemons pidgey=new AllPokemons("Pidgey",4,56);
        pokemonList.add(pidgey);

        AllPokemons starly=new AllPokemons("Starly",4,60);
        pokemonList.add(starly);

        // ************************             ELECTRIC TYPE            *************************
        

        AllPokemons pikachu=new AllPokemons("Pikachu",5,90);
        pokemonList.add(pikachu);

        AllPokemons electabuzz=new AllPokemons("Electabuzz",5,105);
        pokemonList.add(electabuzz);

        AllPokemons electrike=new AllPokemons("Electrike",5,65);
        pokemonList.add(electrike);


        // ************************             GROUND TYPE            *************************
        

        AllPokemons sandshrew=new AllPokemons("Sandshrew",6,40);
        pokemonList.add(sandshrew);
        
        AllPokemons diglet=new AllPokemons("Diglet",6,95);
        pokemonList.add(diglet);

        AllPokemons cubone=new AllPokemons("Cubone",6,35);
        pokemonList.add(cubone);
        
        // ************************             PSYCHIC TYPE            *************************


        AllPokemons abra=new AllPokemons("Abra",7,90);
        pokemonList.add(abra);
        
        AllPokemons ralts=new AllPokemons("Ralts",7,40);
        pokemonList.add(ralts);

        
        // ************************             FIGHTING TYPE            *************************


        AllPokemons machop=new AllPokemons("Machop",8,35);
        pokemonList.add(machop);

        AllPokemons makuhita=new AllPokemons("Makuhita",8,25);
        pokemonList.add(makuhita);
        
        AllPokemons timburr=new AllPokemons("Timburr",8,35  );
        pokemonList.add(timburr);
        
        // ************************             POISON TYPE            *************************


        AllPokemons grimer=new AllPokemons("Grimer",9,25);
        pokemonList.add(grimer);
        
        
        // ************************             NORMAL TYPE            *************************
        
        
        AllPokemons tauros=new AllPokemons("Tauros",10,110);
        pokemonList.add(tauros);

        AllPokemons snorlax=new AllPokemons("Snorlax",10,30);
        pokemonList.add(snorlax);

        AllPokemons porygon2=new AllPokemons("Porygon2",10,60);
        pokemonList.add(porygon2);
    

        // ************************             ROCK TYPE            *************************


        AllPokemons sudowoodo=new AllPokemons("Sudowoodo",11,30);
        pokemonList.add(sudowoodo);

        AllPokemons boldore=new AllPokemons("Boldore",11,20);
        pokemonList.add(boldore);
        
        
        // ************************             DARK TYPE            *************************


        AllPokemons poochyena=new AllPokemons("Poochyena",12,35);
        pokemonList.add(poochyena);

        AllPokemons absol=new AllPokemons("Absol",12,75);
        pokemonList.add(absol);


        // ************************             DRAGON TYPE            *************************


        AllPokemons bagon=new AllPokemons("Bagon",13,50);
        pokemonList.add(bagon);

        AllPokemons dratini=new AllPokemons("Dratini",13,50);
        pokemonList.add(dratini);
        
        AllPokemons axew=new AllPokemons("Axew",13,57);
        pokemonList.add(axew);


        // ************************             GHOST TYPE            *************************


        AllPokemons ghastly=new AllPokemons("Ghastly",14,80);
        pokemonList.add(ghastly);
        
        AllPokemons duskull=new AllPokemons("Duskull",14,20);
        pokemonList.add(duskull);

    }
}