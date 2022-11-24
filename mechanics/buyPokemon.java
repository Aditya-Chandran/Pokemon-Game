package mechanics;

import static_database.*;
import mainData.*;

public class buyPokemon {
    public void buyMech(UserData user,Pokemon pok){
        if(user.userMoney>=pok.pokCost){
            user.userMoney-=pok.pokCost;
            user.userPokemonList.add(pok);
        }
        else{
            System.out.println("\n  Not enough money");
        }
    }
}
