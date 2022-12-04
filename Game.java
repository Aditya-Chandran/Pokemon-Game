import java.util.*;
import mainData.*;
import static_database.*;
import mechanics.*;

public class Game{
    public static void options(){
        Scanner input=new Scanner(System.in);
        System.out.print("\n  --------------------------- MAIN MENU --------------------------------");
        System.out.print("\n                 (P) Play Game       (E) Exit");
        while(true){
            System.out.print("\n   >>> ");
            String opt=input.next();
            if(opt.equalsIgnoreCase("P")){
                AllFunctions.selectSides();
                break;
            }
            else if(opt.equalsIgnoreCase("E")) System.exit(0);
        }
        input.close();
    }
    public static void main(String[] args) {
        options();
    }
}

class AllFunctions{
    public static void selectSides(){
        Pokemon gym[]=selectGym();
        Pokemon myPok[]=selectPokSet();
        BattleMechanics.round(gym, myPok);
    }

    public static Pokemon[] selectGym(){
        Pokemon gym[]=new Pokemon[3];;
        Scanner input=new Scanner(System.in);
        System.out.println("\n  --------------------- SELECT YOUR OPPONENT GYM -----------------------");
        System.out.println("\n  (1) Gym 1   (2) Gym 2  (3) Gym 3  (4) Gym 4  (5) Gym 5  (M) Main Menu");
        while(true){
            System.out.print("\n   >>> ");
            String opt=input.next();
            if(opt.equalsIgnoreCase("M")){
                Game.options();
                break;
            }
            else if(opt.equals("1")){
                gym = AllGyms.getGym(1).gymPok;
                break;
            }
            else if(opt.equals("2")){
                gym = AllGyms.getGym(2).gymPok;
                break;
            }
            else if(opt.equals("3")){
                gym = AllGyms.getGym(3).gymPok;
                break;
            }
            else if(opt.equals("4")){
                gym = AllGyms.getGym(4).gymPok;
                break;
            }
            else if(opt.equals("5")){
                gym = AllGyms.getGym(5).gymPok;
                break;
            }          
        }
        input.close();
        return gym;
    }

    public static Pokemon[] selectPokSet(){
        Pokemon myPok[];
        Scanner input=new Scanner(System.in);
        System.out.print("\n  ------------------------ SELECT YOUR POKEMON GROUP -------------------------- ");
        for(int i=0;i<6;i++){
            System.out.println("\n  ("+(i+1)+") "+SelectPokemon.pokemonSet[i][0].pokName+", "+SelectPokemon.pokemonSet[i][1].pokName+", "+SelectPokemon.pokemonSet[i][2].pokName);
        }
        while(true){
            System.out.print("\n   >>> ");
            String opt=input.next();
            if(opt.equals("1")){
                myPok=SelectPokemon.pokemonSet[0];
                break;
            }
            else if(opt.equals("2")){
                myPok=SelectPokemon.pokemonSet[1];
                break;
            }
            else if(opt.equals("3")){
                myPok=SelectPokemon.pokemonSet[2];
                break;
            }
            else if(opt.equals("4")){
                myPok=SelectPokemon.pokemonSet[3];
                break;
            }
            else if(opt.equals("5")){
                myPok=SelectPokemon.pokemonSet[4];
                break;
            }
            else if(opt.equals("6")){
                myPok=SelectPokemon.pokemonSet[5];
                break;
            }
        }
        input.close();
        return myPok;
    }
}



