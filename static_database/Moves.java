package static_database;
import java.util.*;

public class Moves {
        public String moveName;
        public int moveDamage,minLevel,moveType,accuracy;

        //to store moves as a list of objects
        public static ArrayList<Moves> moveList=new ArrayList<>();
        
        //initializes the object of move data
        Moves(String moveName, int moveType, int moveDamage,int accuracy,int minLevel){
            this.moveName=moveName;
            this.moveType=moveType;
            this.moveDamage=moveDamage;
            this.accuracy = accuracy;
            this.minLevel=minLevel;
        }
        
        public static void addMoves(){

            // ************************             FIRE TYPE            *************************

            /*0*/Moves Ember=new Moves("Ember",1,40,100,0);
            moveList.add(Ember);

            /*1*/Moves Incinerate =new Moves("Incinerate",1,60,100,7);
            moveList.add(Incinerate);

            /*2*/Moves Flamethrower =new Moves("Flamethrower",1,80,100,14);
            moveList.add(Flamethrower);

            /*3*/Moves Heat_Wave =new Moves("Heat Wave",1,95,90,20);
            moveList.add(Heat_Wave);

            /*1*/Moves Magma_Storm =new Moves("Magma Storm",1,100,75,30);
            moveList.add(Magma_Storm);

            Moves Fusion_Flare =new Moves("Fusion Flare",1,100,95,45);
            moveList.add(Fusion_Flare);

            Moves Eruption =new Moves("Eruption",1,150,100,65);
            moveList.add(Eruption);



            // ************************             WATER TYPE            *************************
            Moves Water_Gun=new Moves("Water Gun",2,40,100,0);
            moveList.add(Water_Gun);

            Moves Bubble=new Moves("Bubble",2,40,100,0);
            moveList.add(Bubble);

            Moves Water_Pulse=new Moves("Water Pulse",2,60,100,6);
            moveList.add(Water_Pulse);

            Moves Waterfall=new Moves("Waterfall",2,40,80,13);
            moveList.add(Waterfall);

            Moves Muddy_Water=new Moves("Muddy Water",2,90,85,21);
            moveList.add(Muddy_Water);

            Moves Surf=new Moves("Surf",2,90,100,32);
            moveList.add(Surf);

            Moves Hydro_Pump=new Moves("Hydro Pump",2,110,80,45);
            moveList.add(Hydro_Pump);

            Moves Hydro_Cannon=new Moves("Hydro Cannon",2,150,90,60);
            moveList.add(Hydro_Cannon);

            Moves Water_Sprout=new Moves("Water Sprout",2,150,100,80);
            moveList.add(Water_Sprout);

        

            // ************************             GRASS TYPE            *************************
            Moves Vine_Whip=new Moves("Vine Whip",3,40,100,0);
            moveList.add(Vine_Whip);
            
            Moves Razor_Leaf=new Moves("Razor leaf",3,55,95,5);
            moveList.add(Razor_Leaf);
            
            Moves Giga_Drain=new Moves("Giga Drain",3,75,100,15);
            moveList.add(Giga_Drain);

            Moves Leaf_Blade=new Moves("Leaf Blade",3,90,100,30);
            moveList.add(Leaf_Blade);

            Moves Petal_Blizzard=new Moves("Petal Blizzard",3,90,100,48);
            moveList.add(Petal_Blizzard);

            Moves Solar_Beam=new Moves("Solar Beam",3,120,100,65);
            moveList.add(Solar_Beam);

            Moves Solar_Blade=new Moves("Solar Blade",3,120,100,85);
            moveList.add(Solar_Blade);

            // ************************             ELECTRIC TYPE            *************************
            Moves Thundershock=new Moves("Thundershock",4,46,100,0);
            moveList.add(Thundershock);
            
            Moves ThunderBolt=new Moves("ThunderBolt",4,90,100,15);
            moveList.add(ThunderBolt);

            Moves Volt_Tackle=new Moves("Volt_Tackle",4,120,100,40);
            moveList.add(Volt_Tackle);

            // ************************             GROUND TYPE            *************************
            Moves bonemerang=new Moves("Bonemerang",2,50,90,32);
            moveList.add(bonemerang);

            Moves earthquake=new Moves("Earthquake",2,100,100,32);
            moveList.add(earthquake);
            
            Moves dig=new Moves("Dig",2,100,100,32);
            moveList.add(dig);
            
            Moves fissure=new Moves("Fissure",2,999999,30,32);
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