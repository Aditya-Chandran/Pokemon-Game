package static_database;

public class GymDiff{
    public String gymName;
    public Pokemon gymPok[]=new Pokemon[3];
}

class GymDiff1 extends GymDiff{
    public Pokemon[] addGymPokemons(){
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

        return gymPok;
    }
}

class GymDiff2 extends GymDiff{
    public Pokemon[] addGymPokemons(){
        Pokemon.addPokemons();
        
        Pokemon sandshrew=Pokemon.pokList.get(25);
        sandshrew.pokLevel=9;

        Pokemon squirtle=Pokemon.pokList.get(9);
        squirtle.pokLevel=11;

        Pokemon pidgey=Pokemon.pokList.get(20);
        pidgey.pokLevel=13;

        gymPok[0]=sandshrew;
        gymPok[1]=squirtle;
        gymPok[2]=pidgey;

        return gymPok;
    }

}

class GymDiff3 extends GymDiff{
    public Pokemon[] addGymPokemons(){
        Pokemon.addPokemons();
        
        Pokemon poochyena=Pokemon.pokList.get(41);
        poochyena.pokLevel=25;

        Pokemon electrike=Pokemon.pokList.get(24);
        electrike.pokLevel=27;

        Pokemon tauros=Pokemon.pokList.get(35);
        tauros.pokLevel=18;

        gymPok[0]=poochyena;
        gymPok[1]=electrike;
        gymPok[2]=tauros;
        
        return gymPok;
    }
}

class GymDiff4 extends GymDiff{
    public Pokemon[] addGymPokemons(){
        Pokemon.addPokemons();
        
        Pokemon gastly=Pokemon.pokList.get(48);
        gastly.pokLevel=30;

        Pokemon roggenrola=Pokemon.pokList.get(39);
        roggenrola.pokLevel=40;

        Pokemon magmar=Pokemon.pokList.get(4);
        magmar.pokLevel=49;

        gymPok[0]=gastly;
        gymPok[1]=roggenrola;
        gymPok[2]=magmar;

        return gymPok;
    }
}

class GymDiff5 extends GymDiff{
    public Pokemon[] addGymPokemons(){
        Pokemon.addPokemons();
        
        Pokemon bagon=Pokemon.pokList.get(43);
        bagon.pokLevel=60;

        Pokemon snorlax=Pokemon.pokList.get(36);
        snorlax.pokLevel=65;

        Pokemon absol=Pokemon.pokList.get(42);
        absol.pokLevel=80;

        gymPok[0]=bagon;
        gymPok[1]=snorlax;
        gymPok[2]=absol;

        return gymPok;
    }
}
