package GUIMechanics;

import static_database.*;
import GUI.*;
import mechanics.*;

public class GUImech {
    public static void setPok(int i,int j){
        Pokemon gymPok[]=AllGyms.getGym(j).gymPok;
        Pokemon myPok[]=SelectPokemon.pokemonSet[i];
        for(int k=0;k<3;k++){
            int a[] = BattleMechanics.changeData(myPok[k]);
            myPok[k].pokHealth = a[0];
            myPok[k].move1.moveDamage = a[1];
            myPok[k].move2.moveDamage = a[2];
            myPok[k].move3.moveDamage = a[3];
            myPok[k].move4.moveDamage = a[4];
        }
        for(int k=0;k<3;k++){
            int a[] = BattleMechanics.changeData(gymPok[k]);
            gymPok[k].pokHealth = a[0];
            gymPok[k].move1.moveDamage = a[1];
            gymPok[k].move2.moveDamage = a[2];
            gymPok[k].move3.moveDamage = a[3];
            gymPok[k].move4.moveDamage = a[4];
        }
        BattleWindow.a=0;
        BattleWindow.b=0;
        BattleWindow.set(gymPok, myPok);
    }
}
