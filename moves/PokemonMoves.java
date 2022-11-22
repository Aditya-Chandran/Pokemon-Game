package moves;
import java.util.*;

public class PokemonMoves {
        public String moveName;
        public int moveDamage,minLevel,moveType,accuracy;

        //to store moves as a list of objects
        public static ArrayList<PokemonMoves> moveList=new ArrayList<>();
        
        //initializes the object of move data
        PokemonMoves(String moveName, int moveType, int moveDamage,int accuracy,int minLevel){
            this.moveName=moveName;
            this.moveType=moveType;
            this.moveDamage=moveDamage;
            this.accuracy = accuracy;
            this.minLevel=minLevel;
        }
        
        public static void addMoves(){

            // ************************             FIRE TYPE            *************************

            PokemonMoves Ember=new PokemonMoves("Ember",1,40,100,0);
            moveList.add(Ember);

            PokemonMoves Incinerate =new PokemonMoves("Incinerate",1,60,100,7);
            moveList.add(Incinerate);

            PokemonMoves Flamethrower =new PokemonMoves("Flamethrower",1,80,100,14);
            moveList.add(Flamethrower);

            PokemonMoves Heat_Wave =new PokemonMoves("Heat Wave",1,95,90,20);
            moveList.add(Heat_Wave);

            PokemonMoves Magma_Storm =new PokemonMoves("Magma Storm",1,100,75,30);
            moveList.add(Magma_Storm);

            PokemonMoves Fusion_Flare =new PokemonMoves("Fusion Flare",1,100,95,45);
            moveList.add(Fusion_Flare);

            PokemonMoves Eruption =new PokemonMoves("Eruption",1,150,100,65);
            moveList.add(Eruption);



            // ************************             WATER TYPE            *************************
            PokemonMoves Water_Gun=new PokemonMoves("Water Gun",2,40,100,0);
            moveList.add(Water_Gun);

            PokemonMoves Bubble=new PokemonMoves("Bubble",2,40,100,0);
            moveList.add(Bubble);

            PokemonMoves Water_Pulse=new PokemonMoves("Water Pulse",2,60,100,6);
            moveList.add(Water_Pulse);

            PokemonMoves Waterfall=new PokemonMoves("Waterfall",2,40,80,13);
            moveList.add(Waterfall);

            PokemonMoves Muddy_Water=new PokemonMoves("Muddy Water",2,90,85,21);
            moveList.add(Muddy_Water);

            PokemonMoves Surf=new PokemonMoves("Surf",2,90,100,32);
            moveList.add(Surf);

            PokemonMoves Hydro_Pump=new PokemonMoves("Hydro Pump",2,110,80,45);
            moveList.add(Hydro_Pump);

            PokemonMoves Hydro_Cannon=new PokemonMoves("Hydro Cannon",2,150,90,60);
            moveList.add(Hydro_Cannon);

            PokemonMoves Water_Sprout=new PokemonMoves("Water Sprout",2,150,100,80);
            moveList.add(Water_Sprout);

        

            // ************************             GRASS TYPE            *************************
            PokemonMoves Vine_Whip=new PokemonMoves("Vine Whip",3,40,100,0);
            moveList.add(Vine_Whip);
            
            PokemonMoves Razor_Leaf=new PokemonMoves("Razor leaf",3,55,95,5);
            moveList.add(Razor_Leaf);
            
            PokemonMoves Giga_Drain=new PokemonMoves("Giga Drain",3,75,100,15);
            moveList.add(Giga_Drain);

            PokemonMoves Leaf_Blade=new PokemonMoves("Leaf Blade",3,90,100,30);
            moveList.add(Leaf_Blade);

            PokemonMoves Petal_Blizzard=new PokemonMoves("Petal Blizzard",3,90,100,48);
            moveList.add(Petal_Blizzard);

            PokemonMoves Solar_Beam=new PokemonMoves("Solar Beam",3,120,100,65);
            moveList.add(Solar_Beam);

            PokemonMoves Solar_Blade=new PokemonMoves("Solar Blade",3,120,100,85);
            moveList.add(Solar_Blade);

            // ************************             ELECTRIC TYPE            *************************
            PokemonMoves Thundershock=new PokemonMoves("Thundershock",4,46,100,0);
            moveList.add(Thundershock);
            
            PokemonMoves ThunderBolt=new PokemonMoves("ThunderBolt",4,90,100,15);
            moveList.add(ThunderBolt);

            PokemonMoves Volt_Tackle=new PokemonMoves("Volt_Tackle",4,120,100,40);
            moveList.add(Volt_Tackle);

            // ************************             GROUND TYPE            *************************
            PokemonMoves bonemerang=new PokemonMoves("Bonemerang",2,50,90,32);
            moveList.add(bonemerang);

            PokemonMoves earthquake=new PokemonMoves("Earthquake",2,100,100,32);
            moveList.add(earthquake);
            
            PokemonMoves dig=new PokemonMoves("Dig",2,100,100,32);
            moveList.add(dig);
            
            PokemonMoves fissure=new PokemonMoves("Fissure",2,999999,30,32);
            moveList.add(fissure);

            // ************************             PSYCHIC TYPE            *************************
            // ************************             FIGHTING TYPE            *************************
            // ************************             POISON TYPE            *************************
            // ************************             NORMAL TYPE            *************************
            // ************************             ROCK TYPE            *************************
            // ************************             DARK TYPE            *************************
            // ************************             DRAGON TYPE            *************************
            // ************************             GHOST TYPE            *************************


        }
}
