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
        
        /*3*/Pokemon ponyta=new Pokemon("Ponyta",1,90);
        pokList.add(ponyta);

        /*4*/Pokemon magmar=new Pokemon("Magmar",1,93);
        pokList.add(magmar);

        /*5*/Pokemon cyndaquil=new Pokemon("Cyndaquil",1,65);
        pokList.add(cyndaquil);

        /*6*/Pokemon torchic=new Pokemon("Torchic",1,45);
        pokList.add(torchic);

        /*7*/Pokemon fletchling =new Pokemon("Fletchling",1,62);
        pokList.add(fletchling);
        
        /*8*/Pokemon litten=new Pokemon("Litten",1,70);
        pokList.add(litten);

        
        // ************************             WATER TYPE            *************************


        /*9*/Pokemon squirtle=new Pokemon("Squirtle",2,43);
        pokList.add(squirtle);
        
        /*10*/Pokemon psyduck=new Pokemon("Psyduck",2,55);
        pokList.add(psyduck);
        
        /*11*/Pokemon krabby=new Pokemon("Krabby",2,50);
        pokList.add(krabby);

        /*12*/Pokemon totodile=new Pokemon("Totodile",2,43);
        pokList.add(totodile);

        /*13*/Pokemon mudkip=new Pokemon("Mudkip",2,40);
        pokList.add(mudkip);
        
        /*14*/Pokemon froakie=new Pokemon("Froakie",2,71);
        pokList.add(froakie);
        
        /*15*/Pokemon poplio=new Pokemon("Poplio",2,40);
        pokList.add(poplio);


        
        // ************************             GRASS TYPE            *************************


        /*16*/Pokemon bulbasaur=new Pokemon("Bulbasaur",3,45);
        pokList.add(bulbasaur);

        /*17*/Pokemon chikorita=new Pokemon("Chikorita",3,45);
        pokList.add(chikorita);

        /*18*/Pokemon treecko=new Pokemon("Treecko",3,70);
        pokList.add(treecko);
        
        /*19*/Pokemon rowlet=new Pokemon("Rowlet",3,42);
        pokList.add(rowlet);
        
        // ************************             FLYING TYPE            *************************


        /*20*/Pokemon pidgey=new Pokemon("Pidgey",4,56);
        pokList.add(pidgey);

        /*21*/Pokemon starly=new Pokemon("Starly",4,60);
        pokList.add(starly);

        // ************************             ELECTRIC TYPE            *************************
        

        /*22*/Pokemon pikachu=new Pokemon("Pikachu",5,90);
        pokList.add(pikachu);

        /*23*/Pokemon electabuzz=new Pokemon("Electabuzz",5,105);
        pokList.add(electabuzz);

        /*24*/Pokemon electrike=new Pokemon("Electrike",5,65);
        pokList.add(electrike);


        // ************************             GROUND TYPE            *************************
        

        /*25*/Pokemon sandshrew=new Pokemon("Sandshrew",6,40);
        pokList.add(sandshrew);
        
        /*26*/Pokemon diglet=new Pokemon("Diglet",6,95);
        pokList.add(diglet);

        /*27*/Pokemon cubone=new Pokemon("Cubone",6,35);
        pokList.add(cubone);
        
        // ************************             PSYCHIC TYPE            *************************


        /*28*/Pokemon abra=new Pokemon("Abra",7,90);
        pokList.add(abra);
        
        /*29*/Pokemon ralts=new Pokemon("Ralts",7,40);
        pokList.add(ralts);

        /*30*/Pokemon gothita =new Pokemon("Gothita",7,45);
        pokList.add(gothita);

        
        // ************************             FIGHTING TYPE            *************************


        /*31*/Pokemon machop=new Pokemon("Machop",8,35);
        pokList.add(machop);

        /*32*/Pokemon makuhita=new Pokemon("Makuhita",8,25);
        pokList.add(makuhita);
        
        /*33*/Pokemon timburr=new Pokemon("Timburr",8,35  );
        pokList.add(timburr);
        
        // ************************             POISON TYPE            *************************


        /*34*/Pokemon grimer=new Pokemon("Grimer",9,25);
        pokList.add(grimer);
        
        
        // ************************             NORMAL TYPE            *************************
        
        
        /*35*/Pokemon tauros=new Pokemon("Tauros",10,110);
        pokList.add(tauros);

        /*36*/Pokemon snorlax=new Pokemon("Snorlax",10,30);
        pokList.add(snorlax);

        /*37*/Pokemon porygon2=new Pokemon("Porygon2",10,60);
        pokList.add(porygon2);
    

        // ************************             ROCK TYPE            *************************


        /*38*/Pokemon sudowoodo=new Pokemon("Sudowoodo",11,30);
        pokList.add(sudowoodo);

        /*39*/Pokemon roggenrola=new Pokemon("Roggenrola",11,20);
        pokList.add(roggenrola);
     
        /*40*/Pokemon rockruff=new Pokemon("Rockruff",11,60);
        pokList.add(rockruff);
        
        
        //  ***********************             DARK TYPE            *************************


        /*41*/Pokemon poochyena=new Pokemon("Poochyena",12,35);
        pokList.add(poochyena);

        /*42*/Pokemon absol=new Pokemon("Absol",12,75);
        pokList.add(absol);


        // ************************             DRAGON TYPE            *************************


        /*43*/Pokemon bagon=new Pokemon("Bagon",13,50);
        pokList.add(bagon);

        /*44*/Pokemon dratini=new Pokemon("Dratini",13,50);
        pokList.add(dratini);
        
        /*45*/Pokemon axew=new Pokemon("Axew",13,57);
        pokList.add(axew);

        /*46*/Pokemon gible=new Pokemon("Gible",13,42);
        pokList.add(gible);
        
        /*47*/Pokemon goomy=new Pokemon("Goomy",13,40);
        pokList.add(goomy);



        // ************************             GHOST TYPE            *************************


        /*48*/Pokemon ghastly=new Pokemon("Ghastly",14,80);
        pokList.add(ghastly);
        
        /*49*/Pokemon duskull=new Pokemon("Duskull",14,20);
        pokList.add(duskull);

    }
}