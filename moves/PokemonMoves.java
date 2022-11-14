package moves;
import java.util.*;

public class PokemonMoves {
        public String moveName;
        public int moveDamage,minLevel,moveType;
        
        public static ArrayList<PokemonMoves> moveList=new ArrayList<>();
        
        PokemonMoves(String moveName, int moveType, int moveDamage,int minLevel){
            this.moveName=moveName;
            this.moveType=moveType;
            this.moveDamage=moveDamage;
            this.minLevel=minLevel;
        }
        public static void addMoves(){
            PokemonMoves ember=new PokemonMoves("Ember",1,40,0);
            moveList.add(ember);
            PokemonMoves flamethrower =new PokemonMoves("Flamethrower",1,80,7);
            moveList.add(flamethrower);
        }
}
