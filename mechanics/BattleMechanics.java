package mechanics;

import static_database.*;
import java.util.*;
import java.util.concurrent.*;

public class BattleMechanics{
    static int i=0,j=0;
    public static void changeData(Pokemon pok){
        Pokemon poki=pok;
        poki.pokHealth*=poki.pokLevel/5;
        poki.move1.moveDamage*=poki.pokLevel/60;
        poki.move2.moveDamage*=poki.pokLevel/60;
        poki.move3.moveDamage*=poki.pokLevel/60;
        poki.move4.moveDamage*=poki.pokLevel/60;
    }

    public static int doDamage(Moves move, Pokemon pok){
        int damageGiven=move.moveDamage;
        if(move.moveType==1){
            if(pok.pokType==3) damageGiven*=1.5;
            else if(pok.pokType==2||pok.pokType==6||pok.pokType==11||pok.pokType==13) damageGiven*=0.5;
        }
        else if(move.moveType==2){
            if(pok.pokType==1||pok.pokType==6||pok.pokType==11) damageGiven*=1.5;
            else if(pok.pokType==3||pok.pokType==5||pok.pokType==13) damageGiven*=0.5;
        }
        else if(move.moveType==3){
            if(pok.pokType==2||pok.pokType==6||pok.pokType==11) damageGiven*=1.5;
            else if(pok.pokType==1||pok.pokType==4||pok.pokType==13) damageGiven*=0.5;
        }
        else if(move.moveType==4){
            if(pok.pokType==6||pok.pokType==3||pok.pokType==8) damageGiven*=1.5;
            else if(pok.pokType==5||pok.pokType==11) damageGiven*=0.5;
        }
        else if(move.moveType==5){
            if(pok.pokType==2||pok.pokType==4) damageGiven*=1.5;
            else if(pok.pokType==6||pok.pokType==11||pok.pokType==3||pok.pokType==13) damageGiven*=0.5;
        }
        else if(move.moveType==6){
            if(pok.pokType==1||pok.pokType==5||pok.pokType==11) damageGiven*=1.5;
            else if(pok.pokType==2||pok.pokType==3) damageGiven*=0.5;
            else if(pok.pokType==4) damageGiven=0;
        }
        else if(move.moveType==7){
            if(pok.pokType==8) damageGiven*=1.5;
            else if(pok.pokType==7||pok.pokType==14) damageGiven*=0.5;
        }
        else if(move.moveType==8){
            if(pok.pokType==11) damageGiven*=1.5;
            else if(pok.pokType==4||pok.pokType==7) damageGiven*=0.5;
            else if(pok.pokType==14) damageGiven=0;
        }
        else if(move.moveType==13){
            if(pok.pokType==11) damageGiven*=1.5;
            else if(pok.pokType==4||pok.pokType==7) damageGiven*=0.5;
            else if(pok.pokType==14) damageGiven=0;
        }
        else if(move.moveType==8){
            if(pok.pokType==11) damageGiven*=1.5;
            else if(pok.pokType==4||pok.pokType==7) damageGiven*=0.5;
            else if(pok.pokType==14) damageGiven=0;
        }
        else if(move.moveType==13){
            if(pok.pokType==13) damageGiven*=1.5;
        }
        else if(move.moveType==14){
            if(pok.pokType==7||pok.pokType==14) damageGiven*=1.5;
        }
        return damageGiven;
    }

    public static void round(Pokemon gym[],Pokemon myPok[]){
        System.out.print("\n  ---------------------------- BATTLE SEQUENCE ----------------------------");
        System.out.print("\n    xxxxxxxxx "+myPok[i].pokName+" VS "+gym[j].pokName+" xxxxxxxxx");
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.print("\n    (1) "+myPok[i].move1.moveName+"  (2) "+myPok[i].move2.moveName+"  (3) "+myPok[i].move3.moveName+"  (4) "+myPok[i].move4.moveName+"  (S) Switch Pokemon");
            while(true){
                System.out.print("\n  >>> ");
                String opt=input.next();
                if(opt.equalsIgnoreCase("S")){
                    i=switchPok(myPok); 
                    System.out.print("\n   xxxxxxxxx "+myPok[i].pokName+" VS "+gym[j].pokName+" xxxxxxxxx");
                    break;
                }
                else if(opt.equals("1")){
                    gym[j].pokHealth-=doDamage(myPok[i].move1, gym[j]);
                    break;
                }    
                else if(opt.equals("2")){
                    gym[j].pokHealth-=doDamage(myPok[i].move2, gym[j]);
                    break;
                }
                else if(opt.equals("3")){
                    gym[j].pokHealth-=doDamage(myPok[i].move3, gym[j]);
                    break;
                }
                else if(opt.equals("4")){
                    gym[j].pokHealth-=doDamage(myPok[i].move4, gym[j]);
                    break;
                }
            }
            Random rand=new Random();
            int m=rand.nextInt(4);
            int damage=0;

            if(m==0) damage=doDamage(gym[j].move1,myPok[i]);
            else if(m==0) damage=doDamage(gym[j].move2,myPok[i]);
            else if(m==0) damage=doDamage(gym[j].move3,myPok[i]);
            else if(m==0) damage=doDamage(gym[j].move4,myPok[i]);
            myPok[i].pokHealth-=damage;
            if(myPok[i].pokHealth<=0) i=checkPok(i,myPok);
            if(i==4){
                System.out.print("\n\n  **********  YOU LOST  *********");
                break;
            }
            else{
                System.out.print("\n   xxxxxxxxx "+myPok[i].pokName+" VS "+gym[j].pokName+" xxxxxxxxx");
            }
            if(gym[j].pokHealth<=0) i=checkPok(j,gym);
            if(j==4){
                System.out.print("\n\n  ********** YOU WON ! *********");
                break;
            }
            else{
                System.out.print("\n   xxxxxxxxx "+myPok[i].pokName+" VS "+gym[j].pokName+" xxxxxxxxx");
            }
        }
        input.close();
    }

    public static int switchPok(Pokemon myPok[]){
        int i;
        Scanner input=new Scanner(System.in);
        System.out.print("\n    Choose your Pokemon : (1) "+myPok[0].pokName+"  (2)"+myPok[1].pokName+"  (3) "+myPok[2].pokName);
        while(true){
            System.out.print("\n  >>> ");
            String opt=input.next();
            if(opt.equals("1")){
                i=0;
                break;
            }
            else if(opt.equals("2")){
                i=1;
                break;
            }
            else if(opt.equals("3")){
                i=2;
                break;
            } 
        }    
        input.close();
        return i;
    }

    public static int checkPok(int i,Pokemon pok[]){
        int ct=0;
        while(true){
            if(ct==3) break;
            if(i==2) i=0;
            else i++;
            if(pok[i].pokHealth<=0){
                ct++;
            }
            else break;
        }
        if(ct>=3) return 4;
        return i;
    }
}
