package static_database;

import java.util.*;

public class Pokemon {
    public int pokType, pokSpeed,pokCost, pokLevel;
    public String pokSprite;
    public String pokName;
    public Moves move1;
    public Moves move2;
    public Moves move3;
    public Moves move4;

    //to store data of all poks as a list of objects
    public static ArrayList<Pokemon> pokList=new ArrayList<>();

    //initializes object of pok data
    public Pokemon(String pokName, int pokType, int pokSpeed, int pokLevel, int pokCost, String pokSprite/*,Moves move1, Moves move2,Moves move3,Moves move4 */){
        this.pokName=pokName;
        this.pokType=pokType;
        this.pokSpeed=pokSpeed;
        this.pokLevel=pokLevel;
        this.pokCost=pokCost;
        this.pokSprite=pokSprite;
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
    }

    public static void addPokemons(){

        // ************************             FIRE TYPE            *************************


        /*0*/Pokemon charmander=new Pokemon("Charmander",1,65,40 , 3000 ,"./pokemonSprites/charmander.png");
        pokList.add(charmander);

        /*1*/Pokemon vulpix=new Pokemon("Vulpix",1,65, 30, 2500 ,"./pokemonSprites/vulpix.png");
        pokList.add(vulpix);
        
        /*2*/Pokemon growlithe=new Pokemon("Growlithe",1,60,30 , 2500 ,"./pokemonSprites/growlithe.png");
        pokList.add(growlithe);
        
        /*3*/Pokemon ponyta=new Pokemon("Ponyta",1,90, 30, 2500 ,"./pokemonSprites/ponyta.png");
        pokList.add(ponyta);

        /*4*/Pokemon magmar=new Pokemon("Magmar",1,93,40 , 3000 ,"./pokemonSprites/magmar.png");
        pokList.add(magmar);

        /*5*/Pokemon cyndaquil=new Pokemon("Cyndaquil",1,65,40 , 3000 ,"./pokemonSprites/cyndaquil.png");
        pokList.add(cyndaquil);

        /*6*/Pokemon torchic=new Pokemon("Torchic",1,45, 40, 3000 ,"./pokemonSprites/torchic.png");
        pokList.add(torchic);

        /*7*/Pokemon fletchling =new Pokemon("Fletchling",1,62, 40, 3000 ,"./pokemonSprites/fletchling.png");
        pokList.add(fletchling);
        
        /*8*/Pokemon litten=new Pokemon("Litten",1,70, 40, 3000 ,"./pokemonSprites/litten.png");
        pokList.add(litten);

        
        // ************************             WATER TYPE            *************************


        /*9*/Pokemon squirtle=new Pokemon("Squirtle",2,43, 40,3000 ,"./pokemonSprites/squirtle.png");
        pokList.add(squirtle);
        
        /*10*/Pokemon psyduck=new Pokemon("Psyduck",2,55, 30,2500 ,"./pokemonSprites/psyduck.png");
        pokList.add(psyduck);
        
        /*11*/Pokemon krabby=new Pokemon("Krabby",2,50, 30,2500 ,"./pokemonSprites/krabby.png");
        pokList.add(krabby);

        /*12*/Pokemon totodile=new Pokemon("Totodile",2,43, 40,3000 ,"./pokemonSprites/totodile.png");
        pokList.add(totodile);

        /*13*/Pokemon mudkip=new Pokemon("Mudkip",2,40, 40,3000 ,"./pokemonSprites/mudkip.png");
        pokList.add(mudkip);
        
        /*14*/Pokemon froakie=new Pokemon("Froakie",2,71,40 ,3000 ,"./pokemonSprites/froakie.png");
        pokList.add(froakie);
        
        /*15*/Pokemon popplio=new Pokemon("Popplio",2,40,40 ,3000 ,"./pokemonSprites/popplio.png");
        pokList.add(popplio);


        
        // ************************             GRASS TYPE            *************************


        /*16*/Pokemon bulbasaur=new Pokemon("Bulbasaur",3,45, 40,3000 ,"./pokemonSprites/bulbasaur.png");
        pokList.add(bulbasaur);

        /*17*/Pokemon chikorita=new Pokemon("Chikorita",3,45,40,3000 ,"./pokemonSprites/chikorita.png");
        pokList.add(chikorita);

        /*18*/Pokemon treecko=new Pokemon("Treecko",3,70,40 ,3000 ,"./pokemonSprites/treecko.png");
        pokList.add(treecko);
        
        /*19*/Pokemon rowlet=new Pokemon("Rowlet",3,42,40 ,3000 ,"./pokemonSprites/rowlet.png");
        pokList.add(rowlet);
        
        // ************************             FLYING TYPE            *************************


        /*20*/Pokemon pidgey=new Pokemon("Pidgey",4,56, 40,3000 ,"./pokemonSprites/pidgey.png");
        pokList.add(pidgey);

        /*21*/Pokemon starly=new Pokemon("Starly",4,60, 40,3000 ,"./pokemonSprites/starly-f.png");
        pokList.add(starly);

        // ************************             ELECTRIC TYPE            *************************
        

        /*22*/Pokemon pikachu=new Pokemon("Pikachu",5,90,40 ,3000 ,"./pokemonSprites/pikachu-f.png");
        pokList.add(pikachu);

        /*23*/Pokemon electabuzz=new Pokemon("Electabuzz",5,105,40 ,3000 ,"./pokemonSprites/electabuzz.png");
        pokList.add(electabuzz);

        /*24*/Pokemon electrike=new Pokemon("Electrike",5,65,30 ,2500 ,"./pokemonSprites/electrike.png");
        pokList.add(electrike);


        // ************************             GROUND TYPE            *************************
        

        /*25*/Pokemon sandshrew=new Pokemon("Sandshrew",6,40,30 ,2500 ,"./pokemonSprites/sandshrew.png");
        pokList.add(sandshrew);
        
        /*26*/Pokemon diglet=new Pokemon("Diglet",6,95,30 ,2500 ,"./pokemonSprites/diglett.png");
        pokList.add(diglet);

        /*27*/Pokemon cubone=new Pokemon("Cubone",6,35,30 ,2500 ,"./pokemonSprites/cubone.png");
        pokList.add(cubone);
        
        // ************************             PSYCHIC TYPE            *************************


        /*28*/Pokemon abra=new Pokemon("Abra",7,90,40 ,3000 ,"./pokemonSprites/abra.png");
        pokList.add(abra);
        
        /*29*/Pokemon ralts=new Pokemon("Ralts",7,40,40 ,3000 ,"./pokemonSprites/ralts.png");
        pokList.add(ralts);

        /*30*/Pokemon gothita =new Pokemon("Gothita",7,45,30,2500 ,"./pokemonSprites/gothita.png");
        pokList.add(gothita);

        
        // ************************             FIGHTING TYPE            *************************


        /*31*/Pokemon machop=new Pokemon("Machop",8,35,30 ,2500 ,"./pokemonSprites/machop.png");
        pokList.add(machop);

        /*32*/Pokemon makuhita=new Pokemon("Makuhita",8,25, 30,2500 ,"./pokemonSprites/makuhita.png");
        pokList.add(makuhita);
        
        /*33*/Pokemon timburr=new Pokemon("Timburr",8,35, 30,2500 ,"./pokemonSprites/timburr.png");
        pokList.add(timburr);

        
        // ************************             POISON TYPE            *************************


        /*34*/Pokemon grimer=new Pokemon("Grimer",9,25, 30,2500 ,"./pokemonSprites/grimer.png");
        pokList.add(grimer);
        
        
        // ************************             NORMAL TYPE            *************************
        
        
        /*35*/Pokemon tauros=new Pokemon("Tauros",10,110, 30,2500 ,"./pokemonSprites/tauros.png");
        pokList.add(tauros);

        /*36*/Pokemon snorlax=new Pokemon("Snorlax",10,30, 40,3000 ,"./pokemonSprites/snorlax.png");
        pokList.add(snorlax);

        /*37*/Pokemon porygon2=new Pokemon("Porygon2",10,60,40 ,3000 ,"./pokemonSprites/porygon2.png");
        pokList.add(porygon2);
    

        // ************************             ROCK TYPE            *************************


        /*38*/Pokemon sudowoodo=new Pokemon("Sudowoodo",11,30,30 ,2500 ,"./pokemonSprites/sudowoodo-f.png");
        pokList.add(sudowoodo);

        /*39*/Pokemon roggenrola=new Pokemon("Roggenrola",11,20, 30,2500 ,"./pokemonSprites/roggenrola.png");
        pokList.add(roggenrola);
     
        /*40*/Pokemon rockruff=new Pokemon("Rockruff",11,60,40 ,3000 ,"./pokemonSprites/rockruff.png");
        pokList.add(rockruff);
        
        
        //  ***********************             DARK TYPE            *************************


        /*41*/Pokemon poochyena=new Pokemon("Poochyena",12,35,30 ,2500 ,"./pokemonSprites/poochyena.png");
        pokList.add(poochyena);

        /*42*/Pokemon absol=new Pokemon("Absol",12,75,40 ,3000 ,"./pokemonSprites/absol.png");
        pokList.add(absol);


        // ************************             DRAGON TYPE            *************************


        /*43*/Pokemon bagon=new Pokemon("Bagon",13,50, 45,3500 ,"./pokemonSprites/bagon.png");
        pokList.add(bagon);

        /*44*/Pokemon dratini=new Pokemon("Dratini",13,50, 45,3500 ,"./pokemonSprites/dratini.png");
        pokList.add(dratini);
        
        /*45*/Pokemon axew=new Pokemon("Axew",13,57, 45,3500 ,"./pokemonSprites/axew.png");
        pokList.add(axew);

        /*46*/Pokemon gible=new Pokemon("Gible",13,42, 45,3500 ,"./pokemonSprites/gible.png");
        pokList.add(gible);
        
        /*47*/Pokemon goomy=new Pokemon("Goomy",13,40,45 ,3500 ,"./pokemonSprites/goomy.png");
        pokList.add(goomy);



        // ************************             GHOST TYPE            *************************


        /*48*/Pokemon gastly=new Pokemon("Gastly",14,80,40 ,3000 ,"./pokemonSprites/gastly.png");
        pokList.add(gastly);
        
        /*49*/Pokemon duskull=new Pokemon("Duskull",14,20, 30,2500,"./pokemonSprites/duskull.png");
        pokList.add(duskull);



        // ************************             LEGENDARY TYPE            *************************


        /*50*/Pokemon arceus=new Pokemon("Arceus",15,120, 70, 5000,"./pokemonSprites/arceus.png");
        pokList.add(arceus);

        /*51*/Pokemon darkrai=new Pokemon("Darkrai",15,125, 70, 5000,"./pokemonSprites/darkrai.png");
        pokList.add(darkrai);

        /*52*/Pokemon deoxys=new Pokemon("Deoxys",15,150, 70,5000 ,"./pokemonSprites/deoxys.png");
        pokList.add(deoxys);

        /*53*/Pokemon dialga=new Pokemon("Dialga",15,90,70 ,5000 ,"./pokemonSprites/dialga.png");
        pokList.add(dialga);
        
        /*54*/Pokemon giratina=new Pokemon("Giratina",15,90,70 , 5000,"./pokemonSprites/giratina.png");
        pokList.add(giratina);
        
        /*55*/Pokemon groudon=new Pokemon("Groudon",15,90,70 , 5000,"./pokemonSprites/groudon.png");
        pokList.add(groudon);
        
        /*56*/Pokemon hoopa=new Pokemon("Hoopa",15,70,70 ,5000 ,"./pokemonSprites/hoopa.png");
        pokList.add(hoopa);
        
        /*57*/Pokemon kyogre=new Pokemon("Kyogre",15,90,70 ,5000 ,"./pokemonSprites/kyogre.png");
        pokList.add(kyogre);
        
        /*58*/Pokemon kyurem=new Pokemon("Kyurem",15,95,70 ,5000 ,"./pokemonSprites/kyurem.png");
        pokList.add(kyurem);

        /*59*/Pokemon latios=new Pokemon("Latios",15,110, 70, 5000,"./pokemonSprites/latios.png");
        pokList.add(latios);
        
        /*60*/Pokemon lugia=new Pokemon("Lugia",15,110, 70, 5000,"./pokemonSprites/lugia.png");
        pokList.add(lugia);
        
        /*61*/Pokemon mewtwo=new Pokemon("Mewtwo",15,130, 70, 5000,"./pokemonSprites/mewtwo.png");
        pokList.add(mewtwo);
        
        /*62*/Pokemon palkia=new Pokemon("Palkia",15,100,70 , 5000,"./pokemonSprites/palkia.png");
        pokList.add(palkia);

        /*63*/Pokemon rayquaza=new Pokemon("Rayquaza",15,95,70 ,5000 ,"./pokemonSprites/rayquaza.png");
        pokList.add(rayquaza);
        
        /*64*/Pokemon reshiram=new Pokemon("Reshiram",15,90, 70,5000 ,"./pokemonSprites/reshiram.png");
        pokList.add(reshiram);
        
        /*65*/Pokemon xerneas=new Pokemon("Xerneas",15,99, 70,5000 ,"./pokemonSprites/xerneas.png");
        pokList.add(xerneas);
        
        /*66*/Pokemon yveltal=new Pokemon("Yveltal",15,99,70 ,5000 ,"./pokemonSprites/yveltal.png");
        pokList.add(yveltal);
        
        /*67*/Pokemon zekrom=new Pokemon("Zekrom",15,90,70 , 5000,"./pokemonSprites/zekrom.png");
        pokList.add(zekrom);
        
        /*68*/Pokemon zygrade=new Pokemon("Zygrade",15,95, 70,5000,"./pokemonSprites/zygrade.png");
        pokList.add(zygrade);

    }
}