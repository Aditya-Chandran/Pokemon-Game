package static_database;

import java.util.*;

class GymDiff1{
    static public String gymName="Difficulty 1";
    static public Pokemon gymPok[]=new Pokemon[3];
    static{
        Pokemon.addPokemons();
        
        Pokemon krabby=Pokemon.pokList.get(11);
        krabby.pokLevel=3;

        Pokemon gothita=Pokemon.pokList.get(30);
        gothita.pokLevel=4;

        Pokemon vulpix=Pokemon.pokList.get(1);
        vulpix.pokLevel=2;

        gymPok[0]=krabby;
        gymPok[1]=gothita;
        gymPok[2]=vulpix;
    }
}

class GymDiff2{
    static public String gymName="Difficulty 2";
    static public Pokemon gymPok[]=new Pokemon[3];
    static{
        Pokemon.addPokemons();
        
        Pokemon krabby=Pokemon.pokList.get(11);
        krabby.pokLevel=3;

        Pokemon gothita=Pokemon.pokList.get(30);
        gothita.pokLevel=4;

        Pokemon vulpix=Pokemon.pokList.get(1);
        vulpix.pokLevel=2;

        gymPok[0]=krabby;
        gymPok[1]=gothita;
        gymPok[2]=vulpix;
    }

}

class GymDiff3{
    static public String gymName="Difficulty 1";
    static public Pokemon gymPok[]=new Pokemon[3];
    static{
        Pokemon.addPokemons();
        
        Pokemon poochyena=Pokemon.pokList.get(41);
        poochyena.pokLevel=3;

        Pokemon gothita=Pokemon.pokList.get(30);
        gothita.pokLevel=4;

        Pokemon vulpix=Pokemon.pokList.get(1);
        vulpix.pokLevel=2;

        gymPok[0]=krabby;
        gymPok[1]=gothita;
        gymPok[2]=vulpix;
    }
}

class GymDiff4{

}

class GymDiff5{
    static public String gymName="Difficulty 1";
    static public Pokemon gymPok[]=new Pokemon[3];
    static{
        Pokemon.addPokemons();
        
        Pokemon krabby=Pokemon.pokList.get(11);
        krabby.pokLevel=3;

        Pokemon gothita=Pokemon.pokList.get(30);
        gothita.pokLevel=4;

        Pokemon vulpix=Pokemon.pokList.get(1);
        vulpix.pokLevel=2;

        gymPok[0]=krabby;
        gymPok[1]=gothita;
        gymPok[2]=vulpix;
    }
}

public class Gyms {

}