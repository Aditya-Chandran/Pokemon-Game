package static_database;
import java.util.*;

public class Moves {
        public String moveName;
        public int moveDamage,minLevel,moveType,accuracy;

        //to store moves as a list of objects
        public static ArrayList<Moves> moveList=new ArrayList<>();
        
        //initializes the object of move data
        Moves(String moveName, int moveType, int moveDamage,int accuracy){
            this.moveName=moveName;
            this.moveType=moveType;
            this.moveDamage=moveDamage;
            this.accuracy = accuracy;
        }
        
        public static void addMoves(){

            // ************************             FIRE TYPE            *************************

            /*0*/Moves Ember=new Moves("Ember",1,40,100);
            moveList.add(Ember);

            /*1*/Moves Incinerate =new Moves("Incinerate",1,60,100);
            moveList.add(Incinerate);

            /*2*/Moves Flamethrower =new Moves("Flamethrower",1,80,100);
            moveList.add(Flamethrower);

            /*3*/Moves Heat_Wave =new Moves("Heat Wave",1,95,90);
            moveList.add(Heat_Wave);

            /*4*/Moves Magma_Storm =new Moves("Magma Storm",1,100,75);
            moveList.add(Magma_Storm);

            /*5*/Moves Fusion_Flare =new Moves("Fusion Flare",1,100,95);
            moveList.add(Fusion_Flare);

            /*6*/Moves Eruption =new Moves("Eruption",1,150,100);
            moveList.add(Eruption);



            // ************************             WATER TYPE            *************************
            /*7*/Moves Water_Gun=new Moves("Water Gun",2,40,100);
            moveList.add(Water_Gun);

            /*8*/Moves Bubble=new Moves("Bubble",2,40,100);
            moveList.add(Bubble);

            /*9*/Moves Water_Pulse=new Moves("Water Pulse",2,60,100);
            moveList.add(Water_Pulse);

            /*10*/Moves Waterfall=new Moves("Waterfall",2,40,80);
            moveList.add(Waterfall);

            /*11*/Moves Muddy_Water=new Moves("Muddy Water",2,90,85);
            moveList.add(Muddy_Water);

            /*12*/Moves Surf=new Moves("Surf",2,90,100);
            moveList.add(Surf);

            /*13*/Moves Hydro_Pump=new Moves("Hydro Pump",2,110,80);
            moveList.add(Hydro_Pump);

            /*14*/Moves Hydro_Cannon=new Moves("Hydro Cannon",2,150,90);
            moveList.add(Hydro_Cannon);

            /*15*/Moves Water_Sprout=new Moves("Water Sprout",2,150,100);
            moveList.add(Water_Sprout);

        

            // ************************             GRASS TYPE            *************************
            /*16*/Moves Vine_Whip=new Moves("Vine Whip",3,40,100);
            moveList.add(Vine_Whip);
            
            /*17*/Moves Razor_Leaf=new Moves("Razor leaf",3,55,95);
            moveList.add(Razor_Leaf);
            
            /*18*/Moves Giga_Drain=new Moves("Giga Drain",3,75,100);
            moveList.add(Giga_Drain);

            /*19*/Moves Leaf_Blade=new Moves("Leaf Blade",3,90,100);
            moveList.add(Leaf_Blade);

            /*20*/Moves Petal_Blizzard=new Moves("Petal Blizzard",3,90,100);
            moveList.add(Petal_Blizzard);

            /*21*/Moves Solar_Beam=new Moves("Solar Beam",3,120,100);
            moveList.add(Solar_Beam);

            /*22*/Moves Solar_Blade=new Moves("Solar Blade",3,120,100);
            moveList.add(Solar_Blade);

            // ************************             ELECTRIC TYPE            *************************
            /*23*/Moves Thundershock=new Moves("Thundershock",4,46,100);
            moveList.add(Thundershock);
            
            /*24*/Moves ThunderBolt=new Moves("ThunderBolt",4,90,100);
            moveList.add(ThunderBolt);

            /*25*/Moves Volt_Tackle=new Moves("Volt_Tackle",4,120,100);
            moveList.add(Volt_Tackle);

            // ************************             GROUND TYPE            *************************
            /*26*/Moves bonemerang=new Moves("Bonemerang",5,50,90);
            moveList.add(bonemerang);

            /*27*/Moves earthquake=new Moves("Earthquake",5,100,100);
            moveList.add(earthquake);
            
            /*28*/Moves dig=new Moves("Dig",5,100,100);
            moveList.add(dig);
            
            /*29*/Moves fissure=new Moves("Fissure",5,999999,30);
            moveList.add(fissure);

            // ************************             PSYCHIC TYPE            *************************

            /*30*/Moves confusion=new Moves("Confusion",6,50,100);
            moveList.add(confusion);

            /*31*/Moves dreameater=new Moves("Dreameater",6,100,100);
            moveList.add(dreameater);
            
            /*32*/Moves expandingforce=new Moves("Expanding Force",6,100,100);
            moveList.add(expandingforce);
            
            /*33*/Moves extrasensory=new Moves("Extrasensory",6,80,100);
            moveList.add(extrasensory);

            /*34*/Moves futuresight=new Moves("Future Sight",6,120,100);
            moveList.add(futuresight);

            /*35*/Moves psychic=new Moves("Psychic",6,90,100);
            moveList.add(psychic);

            /*36*/Moves psystrike=new Moves("Psystrike",6,100,100);
            moveList.add(psystrike);

            // ************************             FIGHTING TYPE            *************************

            /*37*/Moves aurasphere=new Moves("Aura Sphere",7,50,100);
            moveList.add(aurasphere);

            /*38*/Moves bodypress=new Moves("Body Press",8,80,100);
            moveList.add(bodypress);
            
            /*39*/Moves closecombat=new Moves("Close Combat",7,100,100);
            moveList.add(closecombat);
            
            /*40*/Moves crosschop=new Moves("Cross Chop",7,100,80);
            moveList.add(crosschop);

            /*41*/Moves doublekick=new Moves("Double Kick",7,60,100);
            moveList.add(doublekick);
            
            /*42*/Moves focusblast=new Moves("Focus Blast",7,120,70);
            moveList.add(focusblast);
            
            /*43*/Moves focuspunch=new Moves("Focus Punch",7,75,100);
            moveList.add(focuspunch);

            // ************************             POISON TYPE            *************************
            
            /*44*/Moves acid=new Moves("Acid",8,40,100);
            moveList.add(acid);
            
            /*45*/Moves gunkshot=new Moves("Gunk Shot",8,120,80);
            moveList.add(gunkshot);
            
            /*46*/Moves poisonfang=new Moves("Poison Fang",8,50,100);
            moveList.add(poisonfang);
            
            /*47*/Moves crosspoison=new Moves("Cross Poison",8,70,100);
            moveList.add(crosspoison);

            /*48*/Moves poisonjab=new Moves("Poison Jab",8,80,100);
            moveList.add(poisonjab);

            /*49*/Moves sludgebomb=new Moves("Sludge Bomb",8,90,100);
            moveList.add(sludgebomb);

            // ************************             NORMAL TYPE            *************************

            /*50*/Moves hyperbeam=new Moves("Hyper Beam",9,150,90);
            moveList.add(hyperbeam);
            
            /*51*/Moves multiattack=new Moves("Multi Attack",9,120,80);
            moveList.add(multiattack);
            
            /*52*/Moves takedown=new Moves("Take Down",9,90,85);
            moveList.add(takedown);
            
            /*53*/Moves hypervoice=new Moves("Hyper Voice",9,70,100);
            moveList.add(hypervoice);

            /*54*/Moves megapunch=new Moves("Mega Punch",9,80,85);
            moveList.add(megapunch);

            /*55*/Moves headbutt=new Moves("Headbutt",9,70,100);
            moveList.add(headbutt);

            // ************************             ROCK TYPE            *************************

            /*56*/Moves meteorbeam=new Moves("Meteor Beam",10,120,90);
            moveList.add(meteorbeam);
            
            /*57*/Moves stoneedge=new Moves("Stone Edge",10,100,80);
            moveList.add(stoneedge);
            
            /*58*/Moves rockslide=new Moves("Rock Slide",10,75,90);
            moveList.add(rockslide);
            
            /*59*/Moves powergem=new Moves("Power Gem",10,80,100);
            moveList.add(powergem);

            /*60*/Moves rocktomb=new Moves("Rock Tomb",10,60,95);
            moveList.add(rocktomb);

            // ************************             DARK TYPE            *************************

            /*56*/Moves foulplay=new Moves("Foul Play",11,95,100);
            moveList.add(foulplay);
            
            /*57*/Moves darkpulse=new Moves("Dark Pulse",11,80,100);
            moveList.add(darkpulse);
            
            /*58*/Moves bite=new Moves("Bite",11,60,100);
            moveList.add(bite);
            
            // ************************             DRAGON TYPE            *************************

            /*56*/Moves dracometeor=new Moves("Draco Meteor",12,130,90);
            moveList.add(dracometeor);
            
            /*57*/Moves outrage=new Moves("Outrage",12,120,100);
            moveList.add(outrage);
            
            /*58*/Moves dragonpulse=new Moves("Dragon Pulse",12,85,100);
            moveList.add(dragonpulse);

            // ************************             GHOST TYPE            *************************

            /*56*/Moves poltergeist=new Moves("Poltergeist",13,110,90);
            moveList.add(poltergeist);
            
            /*57*/Moves shadowball=new Moves("Shadow Ball",13,80,100);
            moveList.add(shadowball);
            
            /*58*/Moves shadowclaw=new Moves("Shadow Claw",13,70,100);
            moveList.add(shadowclaw);
        }
}