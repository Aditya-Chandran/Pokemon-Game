package static_database;

import java.util.*;

public class Pokemon {
    public int pokType, pokSpeed,pokCost, pokLevel,pokHealth;
    public String pokSprite;
    public String pokName;
    public Moves move1;
    public Moves move2;
    public Moves move3;
    public Moves move4;

    //to store data of all poks as a list of objects
    public static ArrayList<Pokemon> pokList=new ArrayList<>();

    //initializes object of pok data
    public Pokemon(String pokName, int pokType, int pokSpeed, int pokHealth, int pokCost, String pokSprite,Moves move1, Moves move2,Moves move3,Moves move4 ){
        this.pokName=pokName;
        this.pokType=pokType;
        this.pokSpeed=pokSpeed;
        this.pokHealth=pokHealth;
        this.pokCost=pokCost;
        this.pokSprite=pokSprite;
        this.move1 = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
    }

    public static void addPokemons(){
        Moves.addMoves();
        ArrayList<Moves> list = Moves.moveList;

        // ************************             FIRE TYPE            *************************


        /*0*/Pokemon charmander=new Pokemon("Charmander",1,65,40 , 3000 ,"./pokemonSprites/charmander.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(charmander);

        /*1*/Pokemon vulpix=new Pokemon("Vulpix",1,65, 30, 2500 ,"./pokemonSprites/vulpix.png",list.get(1),list.get(2),list.get(52),list.get(44));
        pokList.add(vulpix);
        
        /*2*/Pokemon growlithe=new Pokemon("Growlithe",1,60,30 , 2500 ,"./pokemonSprites/growlithe.png",list.get(2),list.get(57),list.get(56),list.get(24));
        pokList.add(growlithe);
        
        /*3*/Pokemon ponyta=new Pokemon("Ponyta",1,90, 30, 2500 ,"./pokemonSprites/ponyta.png",list.get(3),list.get(1),list.get(27),list.get(32));
        pokList.add(ponyta);

        /*4*/Pokemon magmar=new Pokemon("Magmar",1,93,40 , 3000 ,"./pokemonSprites/magmar.png",list.get(33),list.get(4),list.get(27),list.get(35));
        pokList.add(magmar);

        /*5*/Pokemon cyndaquil=new Pokemon("Cyndaquil",1,65,40 , 3000 ,"./pokemonSprites/cyndaquil.png",list.get(2),list.get(1),list.get(40),list.get(54));
        pokList.add(cyndaquil);

        /*6*/Pokemon torchic=new Pokemon("Torchic",1,45, 40, 3000 ,"./pokemonSprites/torchic.png",list.get(6),list.get(29),list.get(36),list.get(43));
        pokList.add(torchic);

        /*7*/Pokemon fletchling =new Pokemon("Fletchling",1,62, 40, 3000 ,"./pokemonSprites/fletchling.png",list.get(1),list.get(2),list.get(47),list.get(55));
        pokList.add(fletchling);
        
        /*8*/Pokemon litten=new Pokemon("Litten",1,70, 40, 3000 ,"./pokemonSprites/litten.png",list.get(4),list.get(1),list.get(42),list.get(53));
        pokList.add(litten);

        
        // ************************             WATER TYPE            *************************


        /*9*/Pokemon squirtle=new Pokemon("Squirtle",2,43, 40,3000 ,"./pokemonSprites/squirtle.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(squirtle);
        
        /*10*/Pokemon psyduck=new Pokemon("Psyduck",2,55, 30,2500 ,"./pokemonSprites/psyduck.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(psyduck);
        
        /*11*/Pokemon krabby=new Pokemon("Krabby",2,50, 30,2500 ,"./pokemonSprites/krabby.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(krabby);

        /*12*/Pokemon totodile=new Pokemon("Totodile",2,43, 40,3000 ,"./pokemonSprites/totodile.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(totodile);

        /*13*/Pokemon mudkip=new Pokemon("Mudkip",2,40, 40,3000 ,"./pokemonSprites/mudkip.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(mudkip);
        
        /*14*/Pokemon froakie=new Pokemon("Froakie",2,71,40 ,3000 ,"./pokemonSprites/froakie.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(froakie);
        
        /*15*/Pokemon popplio=new Pokemon("Popplio",2,40,40 ,3000 ,"./pokemonSprites/popplio.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(popplio);


        
        // ************************             GRASS TYPE            *************************


        /*16*/Pokemon bulbasaur=new Pokemon("Bulbasaur",3,45, 40,3000 ,"./pokemonSprites/bulbasaur.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(bulbasaur);

        /*17*/Pokemon chikorita=new Pokemon("Chikorita",3,45,40,3000 ,"./pokemonSprites/chikorita.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(chikorita);

        /*18*/Pokemon treecko=new Pokemon("Treecko",3,70,40 ,3000 ,"./pokemonSprites/treecko.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(treecko);
        
        /*19*/Pokemon rowlet=new Pokemon("Rowlet",3,42,40 ,3000 ,"./pokemonSprites/rowlet.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(rowlet);
        
        // ************************             FLYING TYPE            *************************


        /*20*/Pokemon pidgey=new Pokemon("Pidgey",4,56, 40,3000 ,"./pokemonSprites/pidgey.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(pidgey);

        /*21*/Pokemon starly=new Pokemon("Starly",4,60, 40,3000 ,"./pokemonSprites/starly-f.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(starly);

        // ************************             ELECTRIC TYPE            *************************
        

        /*22*/Pokemon pikachu=new Pokemon("Pikachu",5,90,40 ,3000 ,"./pokemonSprites/pikachu-f.png",list.get(25),list.get(24),list.get(28),list.get(30));
        pokList.add(pikachu);

        /*23*/Pokemon electabuzz=new Pokemon("Electabuzz",5,105,40 ,3000 ,"./pokemonSprites/electabuzz.png",list.get(27),list.get(35),list.get(47),list.get(53));
        pokList.add(electabuzz);

        /*24*/Pokemon electrike=new Pokemon("Electrike",5,65,30 ,2500 ,"./pokemonSprites/electrike.png",list.get(46),list.get(63),list.get(25),list.get(39));
        pokList.add(electrike);


        // ************************             GROUND TYPE            *************************
        

        /*25*/Pokemon sandshrew=new Pokemon("Sandshrew",6,40,30 ,2500 ,"./pokemonSprites/sandshrew.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(sandshrew);
        
        /*26*/Pokemon diglet=new Pokemon("Diglet",6,95,30 ,2500 ,"./pokemonSprites/diglett.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(diglet);

        /*27*/Pokemon cubone=new Pokemon("Cubone",6,35,30 ,2500 ,"./pokemonSprites/cubone.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(cubone);
        
        // ************************             PSYCHIC TYPE            *************************


        /*28*/Pokemon abra=new Pokemon("Abra",7,90,40 ,3000 ,"./pokemonSprites/abra.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(abra);
        
        /*29*/Pokemon ralts=new Pokemon("Ralts",7,40,40 ,3000 ,"./pokemonSprites/ralts.png",list.get(56),list.get(36),list.get(32),list.get(3));
        pokList.add(ralts);

        /*30*/Pokemon gothita =new Pokemon("Gothita",7,45,30,2500 ,"./pokemonSprites/gothita.png",list.get(55),list.get(45),list.get(24),list.get(15));
        pokList.add(gothita);

        
        // ************************             FIGHTING TYPE            *************************


        /*31*/Pokemon machop=new Pokemon("Machop",8,35,30 ,2500 ,"./pokemonSprites/machop.png",list.get(28),list.get(52),list.get(58),list.get(61));
        pokList.add(machop);

        /*32*/Pokemon makuhita=new Pokemon("Makuhita",8,25, 30,2500 ,"./pokemonSprites/makuhita.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(makuhita);
        
        /*33*/Pokemon timburr=new Pokemon("Timburr",8,35, 30,2500 ,"./pokemonSprites/timburr.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(timburr);

        
        // ************************             POISON TYPE            *************************


        /*34*/Pokemon grimer=new Pokemon("Grimer",9,25, 30,2500 ,"./pokemonSprites/grimer.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(grimer);
        
        
        // ************************             NORMAL TYPE            *************************
        
        
        /*35*/Pokemon tauros=new Pokemon("Tauros",10,110, 30,2500 ,"./pokemonSprites/tauros.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(tauros);

        /*36*/Pokemon snorlax=new Pokemon("Snorlax",10,30, 40,3000 ,"./pokemonSprites/snorlax.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(snorlax);

        /*37*/Pokemon porygon2=new Pokemon("Porygon2",10,60,40 ,3000 ,"./pokemonSprites/porygon2.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(porygon2);
    

        // ************************             ROCK TYPE            *************************


        /*38*/Pokemon sudowoodo=new Pokemon("Sudowoodo",11,30,30 ,2500 ,"./pokemonSprites/sudowoodo-f.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(sudowoodo);

        /*39*/Pokemon roggenrola=new Pokemon("Roggenrola",11,20, 30,2500 ,"./pokemonSprites/roggenrola.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(roggenrola);
     
        /*40*/Pokemon rockruff=new Pokemon("Rockruff",11,60,40 ,3000 ,"./pokemonSprites/rockruff.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(rockruff);
        
        
        //  ***********************             DARK TYPE            *************************


        /*41*/Pokemon poochyena=new Pokemon("Poochyena",12,35,30 ,2500 ,"./pokemonSprites/poochyena.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(poochyena);

        /*42*/Pokemon absol=new Pokemon("Absol",12,75,40 ,3000 ,"./pokemonSprites/absol.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(absol);


        // ************************             DRAGON TYPE            *************************


        /*43*/Pokemon bagon=new Pokemon("Bagon",13,50, 45,3500 ,"./pokemonSprites/bagon.png",list.get(57),list.get(63),list.get(65),list.get(7));
        pokList.add(bagon);

        /*44*/Pokemon dratini=new Pokemon("Dratini",13,50, 45,3500 ,"./pokemonSprites/dratini.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(dratini);
        
        /*45*/Pokemon axew=new Pokemon("Axew",13,57, 45,3500 ,"./pokemonSprites/axew.png",list.get(66),list.get(38),list.get(63),list.get(54));
        pokList.add(axew);

        /*46*/Pokemon gible=new Pokemon("Gible",13,42, 45,3500 ,"./pokemonSprites/gible.png",list.get(46),list.get(34),list.get(3),list.get(50));
        pokList.add(gible);
        
        /*47*/Pokemon goomy=new Pokemon("Goomy",13,40,45 ,3500 ,"./pokemonSprites/goomy.png",list.get(66),list.get(38),list.get(63),list.get(54));
        pokList.add(goomy);



        // ************************             GHOST TYPE            *************************


        /*48*/Pokemon gastly=new Pokemon("Gastly",14,80,40 ,3000 ,"./pokemonSprites/gastly.png",list.get(59),list.get(48),list.get(68),list.get(61));
        pokList.add(gastly);
        
        /*49*/Pokemon duskull=new Pokemon("Duskull",14,20, 30,2500,"./pokemonSprites/duskull.png",list.get(67),list.get(61),list.get(58),list.get(35));
        pokList.add(duskull);



        // ************************             LEGENDARY TYPE            *************************


        /*50*/Pokemon arceus=new Pokemon("Arceus",15,120, 70, 5000,"./pokemonSprites/arceus.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(arceus);

        /*51*/Pokemon darkrai=new Pokemon("Darkrai",15,125, 70, 5000,"./pokemonSprites/darkrai.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(darkrai);

        /*52*/Pokemon deoxys=new Pokemon("Deoxys",15,150, 70,5000 ,"./pokemonSprites/deoxys.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(deoxys);

        /*53*/Pokemon dialga=new Pokemon("Dialga",15,90,70 ,5000 ,"./pokemonSprites/dialga.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(dialga);
        
        /*54*/Pokemon giratina=new Pokemon("Giratina",15,90,70 , 5000,"./pokemonSprites/giratina.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(giratina);
        
        /*55*/Pokemon groudon=new Pokemon("Groudon",15,90,70 , 5000,"./pokemonSprites/groudon.png",list.get(28),list.get(2),list.get(32),list.get(57));
        pokList.add(groudon);
        
        /*56*/Pokemon hoopa=new Pokemon("Hoopa",15,70,70 ,5000 ,"./pokemonSprites/hoopa.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(hoopa);
        
        /*57*/Pokemon kyogre=new Pokemon("Kyogre",15,90,70 ,5000 ,"./pokemonSprites/kyogre.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(kyogre);
        
        /*58*/Pokemon kyurem=new Pokemon("Kyurem",15,95,70 ,5000 ,"./pokemonSprites/kyurem.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(kyurem);

        /*59*/Pokemon latios=new Pokemon("Latios",15,110, 70, 5000,"./pokemonSprites/latios.png",list.get(64),list.get(57),list.get(50),list.get(45));
        pokList.add(latios);
        
        /*60*/Pokemon lugia=new Pokemon("Lugia",15,110, 70, 5000,"./pokemonSprites/lugia.png",list.get(35),list.get(13),list.get(52),list.get(56));
        pokList.add(lugia);
        
        /*61*/Pokemon mewtwo=new Pokemon("Mewtwo",15,130, 70, 5000,"./pokemonSprites/mewtwo.png",list.get(27),list.get(34),list.get(24),list.get(57));
        pokList.add(mewtwo);
        
        /*62*/Pokemon palkia=new Pokemon("Palkia",15,100,70 , 5000,"./pokemonSprites/palkia.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(palkia);

        /*63*/Pokemon rayquaza=new Pokemon("Rayquaza",15,95,70 ,5000 ,"./pokemonSprites/rayquaza.png",list.get(65),list.get(50),list.get(35),list.get(27));
        pokList.add(rayquaza);
        
        /*64*/Pokemon reshiram=new Pokemon("Reshiram",15,90, 70,5000 ,"./pokemonSprites/reshiram.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(reshiram);
        
        /*65*/Pokemon xerneas=new Pokemon("Xerneas",15,99, 70,5000 ,"./pokemonSprites/xerneas.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(xerneas);
        
        /*66*/Pokemon yveltal=new Pokemon("Yveltal",15,99,70 ,5000 ,"./pokemonSprites/yveltal.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(yveltal);
        
        /*67*/Pokemon zekrom=new Pokemon("Zekrom",15,90,70 , 5000,"./pokemonSprites/zekrom.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(zekrom);
        
        /*68*/Pokemon zygrade=new Pokemon("Zygrade",15,95, 70,5000,"./pokemonSprites/zygrade.png",list.get(0),list.get(2),list.get(55),list.get(35));
        pokList.add(zygrade);

    }
}