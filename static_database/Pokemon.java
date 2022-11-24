package static_database;

import java.util.*;
import java.awt.image.BufferedImage;

public class Pokemon {
    public int pokType, pokSpeed,pokCost, pokLevel;
    public BufferedImage pokSprite;
    public String pokName;
    public Moves pokMoves[] = new Moves[4]; 

    //to store data of all poks as a list of objects
    public static ArrayList<Pokemon> pokList=new ArrayList<>();
    
    //initializes object of pok data
    Pokemon(String pokName, int pokType, int pokSpeed, int pokLevel, int pokCost, BufferedImage pokSprite, Moves[] pokMoves){
        this.pokName=pokName;
        this.pokType=pokType;
        this.pokSpeed=pokSpeed;
        this.pokLevel=pokLevel;
        this.pokCost=pokCost;
        this.pokSprite=pokSprite;
        this.pokMoves=pokMoves;
    }

    public static void addPokemons(){

        // ************************             FIRE TYPE            *************************


        /*0*/Pokemon charmander=new Pokemon("Charmander",1,65);
        pokList.add(charmander);

        /*1*/Pokemon vulpix=new Pokemon("Vulpix",1,65);
        pokList.add(vulpix);
        
        /*2*/Pokemon growlithe=new Pokemon("Growlithe",1,60);
        pokList.add(growlithe);
        
        Pokemon ponyta=new Pokemon("Ponyta",1,90);
        pokList.add(ponyta);

        Pokemon magmar=new Pokemon("Magmar",1,93);
        pokList.add(magmar);

        Pokemon cyndaquil=new Pokemon("Cyndaquil",1,65);
        pokList.add(cyndaquil);

        Pokemon torchic=new Pokemon("Torchic",1,45);
        pokList.add(torchic);

        
        // ************************             WATER TYPE            *************************


        Pokemon squirtle=new Pokemon("Squirtle",2,43);
        pokList.add(squirtle);
        
        Pokemon psyduck=new Pokemon("Psyduck",2,55);
        pokList.add(psyduck);
        
        Pokemon krabby=new Pokemon("Krabby",2,50);
        pokList.add(krabby);

        Pokemon totodile=new Pokemon("Totodile",2,43);
        pokList.add(totodile);

        Pokemon mudkip=new Pokemon("Mudkip",2,40);
        pokList.add(mudkip);
        
        // ************************             GRASS TYPE            *************************


        Pokemon bulbasaur=new Pokemon("Bulbasaur",3,45);
        pokList.add(bulbasaur);

        Pokemon chikorita=new Pokemon("Chikorita",3,45);
        pokList.add(chikorita);

        Pokemon treecko=new Pokemon("Treecko",3,70);
        pokList.add(treecko);
        
        // ************************             FLYING TYPE            *************************


        Pokemon pidgey=new Pokemon("Pidgey",4,56);
        pokList.add(pidgey);

        Pokemon starly=new Pokemon("Starly",4,60);
        pokList.add(starly);

        // ************************             ELECTRIC TYPE            *************************
        

        Pokemon pikachu=new Pokemon("Pikachu",5,90);
        pokList.add(pikachu);

        Pokemon electabuzz=new Pokemon("Electabuzz",5,105);
        pokList.add(electabuzz);

        Pokemon electrike=new Pokemon("Electrike",5,65);
        pokList.add(electrike);


        // ************************             GROUND TYPE            *************************
        

        Pokemon sandshrew=new Pokemon("Sandshrew",6,40);
        pokList.add(sandshrew);
        
        Pokemon diglet=new Pokemon("Diglet",6,95);
        pokList.add(diglet);

        Pokemon cubone=new Pokemon("Cubone",6,35);
        pokList.add(cubone);
        
        // ************************             PSYCHIC TYPE            *************************


        Pokemon abra=new Pokemon("Abra",7,90);
        pokList.add(abra);
        
        Pokemon ralts=new Pokemon("Ralts",7,40);
        pokList.add(ralts);

        
        // ************************             FIGHTING TYPE            *************************


        Pokemon machop=new Pokemon("Machop",8,35);
        pokList.add(machop);

        Pokemon makuhita=new Pokemon("Makuhita",8,25);
        pokList.add(makuhita);
        
        Pokemon timburr=new Pokemon("Timburr",8,35  );
        pokList.add(timburr);
        
        // ************************             POISON TYPE            *************************


        Pokemon grimer=new Pokemon("Grimer",9,25);
        pokList.add(grimer);
        
        
        // ************************             NORMAL TYPE            *************************
        
        
        Pokemon tauros=new Pokemon("Tauros",10,110);
        pokList.add(tauros);

        Pokemon snorlax=new Pokemon("Snorlax",10,30);
        pokList.add(snorlax);

        Pokemon porygon2=new Pokemon("Porygon2",10,60);
        pokList.add(porygon2);
    

        // ************************             ROCK TYPE            *************************


        Pokemon sudowoodo=new Pokemon("Sudowoodo",11,30);
        pokList.add(sudowoodo);

        Pokemon boldore=new Pokemon("Boldore",11,20);
        pokList.add(boldore);
        
        
        // ************************             DARK TYPE            *************************


        Pokemon poochyena=new Pokemon("Poochyena",12,35);
        pokList.add(poochyena);

        Pokemon absol=new Pokemon("Absol",12,75);
        pokList.add(absol);


        // ************************             DRAGON TYPE            *************************


        Pokemon bagon=new Pokemon("Bagon",13,50);
        pokList.add(bagon);

        Pokemon dratini=new Pokemon("Dratini",13,50);
        pokList.add(dratini);
        
        Pokemon axew=new Pokemon("Axew",13,57);
        pokList.add(axew);


        // ************************             GHOST TYPE            *************************


        Pokemon ghastly=new Pokemon("Ghastly",14,80);
        pokList.add(ghastly);
        
        Pokemon duskull=new Pokemon("Duskull",14,20);
        pokList.add(duskull);

    }
}