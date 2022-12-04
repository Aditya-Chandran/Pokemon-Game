package static_database;

public class GymDiff{
    public String gymName;
    public Pokemon gymPok[]=new Pokemon[3];
}
class GymDiff1 extends GymDiff{
    public Pokemon[] addGymPokemons(){
        Pokemon.addPokemons();
        
        Pokemon magmar=Pokemon.pokList.get(4);
        magmar.pokLevel=50;

        Pokemon ponyta=Pokemon.pokList.get(3);
        ponyta.pokLevel=50;

        Pokemon vulpix=Pokemon.pokList.get(1);
        vulpix.pokLevel=50;

        gymPok[0]=vulpix;
        gymPok[1]=ponyta;
        gymPok[2]=magmar;

        return gymPok;
    }
}

class GymDiff2 extends GymDiff{
    public Pokemon[] addGymPokemons(){
        Pokemon.addPokemons();
        
        Pokemon krabby=Pokemon.pokList.get(11);
        krabby.pokLevel=50;

        Pokemon mudkip=Pokemon.pokList.get(13);
        mudkip.pokLevel=50;

        Pokemon froakie=Pokemon.pokList.get(14);
        froakie.pokLevel=50;

        gymPok[0]=krabby;
        gymPok[1]=mudkip;
        gymPok[2]=froakie;

        return gymPok;
    }

}

class GymDiff3 extends GymDiff{
    public Pokemon[] addGymPokemons(){
        Pokemon.addPokemons();
        
        Pokemon bulbasaur=Pokemon.pokList.get(16);
        bulbasaur.pokLevel=50;

        Pokemon treecko=Pokemon.pokList.get(18);
        treecko.pokLevel=50;

        Pokemon chikorita=Pokemon.pokList.get(17);
        chikorita.pokLevel=50;

        gymPok[0]=bulbasaur;
        gymPok[1]=treecko;
        gymPok[2]=chikorita;
        
        return gymPok;
    }
}

class GymDiff4 extends GymDiff{
    public Pokemon[] addGymPokemons(){
        Pokemon.addPokemons();
        
        Pokemon pikachu=Pokemon.pokList.get(59);
        pikachu.pokLevel=50;

        Pokemon electabuzz=Pokemon.pokList.get(23);
        electabuzz.pokLevel=50;

        Pokemon electrike=Pokemon.pokList.get(24);
        electrike.pokLevel=50;

        gymPok[0]=pikachu;
        gymPok[1]=electabuzz;
        gymPok[2]=electrike;


        return gymPok;
    }
}

class GymDiff5 extends GymDiff{
    public Pokemon[] addGymPokemons(){
        Pokemon.addPokemons();
        
        Pokemon latios=Pokemon.pokList.get(22);
        latios.pokLevel=55;
     
        Pokemon rayquaza=Pokemon.pokList.get(63);
        rayquaza.pokLevel=55;

        Pokemon mewtwo=Pokemon.pokList.get(61);
        mewtwo.pokLevel=55;

        gymPok[0]=latios;
        gymPok[1]=rayquaza;
        gymPok[2]=mewtwo;

        return gymPok;
    }
}

