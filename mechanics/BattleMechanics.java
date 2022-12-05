package mechanics;

import static_database.*;
import java.util.*;
import java.util.concurrent.*;

public class BattleMechanics{
    public static int[] changeData(Pokemon pok){
        pok.pokHealth*=pok.pokLevel/5f;
        pok.move1.moveDamage*=pok.pokLevel/50f;
        pok.move2.moveDamage*=pok.pokLevel/50f;
        pok.move3.moveDamage*=pok.pokLevel/50f;
        pok.move4.moveDamage*=pok.pokLevel/50f;
        int a[]={pok.pokHealth,pok.move1.moveDamage,pok.move2.moveDamage,pok.move3.moveDamage,pok.move4.moveDamage};
        return a;
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
        Scanner input=new Scanner(System.in);
        int i=0,j=0,k=1;

        System.out.print("\n  ---------------------------- BATTLE SEQUENCE ----------------------------");
        System.out.print("\n    xxxxxxxxx "+myPok[i].pokName+" VS "+gym[j].pokName+" xxxxxxxxx\n");
        System.out.print("\n    HEALTH\n");
        System.out.println("\n    "+myPok[i].pokName+" : "+myPok[i].pokHealth);
        System.out.println("\n    "+gym[j].pokName+" : "+gym[j].pokHealth);
        
        while(true){
            
            System.out.println("\n  ______________ TURN "+k+" _______________");
            k++;
            
            int damage=0;
            Moves currMove=myPok[i].move1;
            
            System.out.print("\n    (1) "+myPok[i].move1.moveName+"  (2) "+myPok[i].move2.moveName+"  (3) "+myPok[i].move3.moveName+"  (4) "+myPok[i].move4.moveName+"  (S) Switch Pokemon");
            while(true){
                System.out.print("\n  >>> ");
                String opt=input.next();
                if(opt.equalsIgnoreCase("S")){
                    i=switchPok(myPok); 
                    System.out.print("\n   xxxxxxxxx "+myPok[i].pokName+" VS "+gym[j].pokName+" xxxxxxxxx\n");
                    System.out.print("\n    HEALTH\n");
                    System.out.println("\n     "+myPok[i].pokName+" : "+myPok[i].pokHealth);
                    if(gym[j].pokHealth<=0) System.out.println("\n     "+gym[j].pokName+" : "+0);
                    else System.out.println("\n     "+gym[j].pokName+" : "+gym[j].pokHealth);
                    
                    break;
                }
                else if(opt.equals("1")){
                    currMove=myPok[j].move1;
                    damage=doDamage(myPok[i].move1, gym[j]);
                    gym[j].pokHealth-=damage;
                    System.out.println("\n    "+myPok[j].pokName+" used "+currMove.moveName+" and did "+damage+" damage to "+gym[i].pokName);
                    System.out.print("\n    HEALTH\n");
                    System.out.println("\n    "+myPok[i].pokName+" : "+myPok[i].pokHealth);
                    if(gym[j].pokHealth<=0) System.out.println("\n     "+gym[j].pokName+" : "+0);
                    else System.out.println("\n     "+gym[j].pokName+" : "+gym[j].pokHealth);
                    break;
                }    
                else if(opt.equals("2")){
                    currMove=myPok[j].move2;
                    damage=doDamage(myPok[i].move2, gym[j]);
                    gym[j].pokHealth-=damage;
                    System.out.println("\n    "+myPok[j].pokName+" used "+currMove.moveName+" and did "+damage+" damage to "+gym[i].pokName);
                    System.out.print("\n    HEALTH\n");
                    System.out.println("\n    "+myPok[i].pokName+" : "+myPok[i].pokHealth);
                    if(gym[j].pokHealth<=0) System.out.println("\n     "+gym[j].pokName+" : "+0);
                    else System.out.println("\n     "+gym[j].pokName+" : "+gym[j].pokHealth);
                    break;
                }
                else if(opt.equals("3")){
                    currMove=myPok[j].move3;
                    damage=doDamage(myPok[i].move3, gym[j]);
                    gym[j].pokHealth-=damage;
                    System.out.println("\n    "+myPok[j].pokName+" used "+currMove.moveName+" and did "+damage+" damage to "+gym[i].pokName);
                    System.out.print("\n    HEALTH\n");
                    System.out.println("\n    "+myPok[i].pokName+" : "+myPok[i].pokHealth);
                    if(gym[j].pokHealth<=0) System.out.println("\n     "+gym[j].pokName+" : "+0);
                    else System.out.println("\n     "+gym[j].pokName+" : "+gym[j].pokHealth);
                    break;
                }
                else if(opt.equals("4")){
                    currMove=myPok[j].move4;
                    damage=doDamage(myPok[i].move4, gym[j]);
                    gym[j].pokHealth-=damage;
                    System.out.println("\n    "+myPok[j].pokName+" used "+currMove.moveName+" and did "+damage+" damage to "+gym[i].pokName);
                    System.out.print("\n    HEALTH\n");
                    System.out.println("\n    "+myPok[i].pokName+" : "+myPok[i].pokHealth);
                    if(gym[j].pokHealth<=0) System.out.println("\n     "+gym[j].pokName+" : "+0);
                    else System.out.println("\n     "+gym[j].pokName+" : "+gym[j].pokHealth);
                    break;
                }
            }
            
        
            int x=j;
            if(gym[j].pokHealth<=0) x=checkPok(j,gym);
            if(x==4){
                System.out.print("\n\n  ********** YOU WON ! *********\n");
                break;
            }
            else if(x!=j){
                j=x;
                System.out.print("\n   xxxxxxxxx "+myPok[i].pokName+" VS "+gym[j].pokName+" xxxxxxxxx\n");
                System.out.print("\n    HEALTH\n");
                System.out.println("\n    "+myPok[i].pokName+" : "+myPok[i].pokHealth);
                System.out.println("\n    "+gym[j].pokName+" : "+gym[j].pokHealth);
            }

            System.out.println("\n  ............ ");

            Random rand=new Random();
            int m=rand.nextInt(4);


            if(m==0){
                currMove=gym[j].move1;
                damage=doDamage(gym[j].move1,myPok[i]);
            }
            else if(m==1){
                currMove=gym[j].move2;
                damage=doDamage(gym[j].move2,myPok[i]);
            }
            else if(m==2){
                currMove=gym[j].move3;
                damage=doDamage(gym[j].move3,myPok[i]);
            }
            else if(m==3){
                currMove=gym[j].move4;
                damage=doDamage(gym[j].move4,myPok[i]);
            }
            myPok[i].pokHealth-=damage;

            System.out.println("\n    "+gym[j].pokName+" used "+currMove.moveName+" and did "+damage+" damage to "+myPok[i].pokName);
            System.out.print("\n    HEALTH\n");
            if(myPok[i].pokHealth<=0) System.out.println("\n     "+myPok[i].pokName+" : "+0);
            else System.out.println("\n     "+myPok[i].pokName+" : "+myPok[i].pokHealth);
            System.out.println("\n    "+gym[j].pokName+" : "+gym[j].pokHealth);

            if(myPok[i].pokHealth<=0) x=checkPok(i,myPok);
            x=i;
            if(x==4){
                System.out.print("\n\n  **********  YOU LOST  *********\n");
                break;
            }
            else if(x!=i){
                i=x;
                System.out.print("\n   xxxxxxxxx "+myPok[i].pokName+" VS "+gym[j].pokName+" xxxxxxxxx\n");
                System.out.print("\n    HEALTH\n");
                System.out.println("\n    "+myPok[i].pokName+" : "+myPok[i].pokHealth);
                System.out.println("\n    "+gym[j].pokName+" : "+gym[j].pokHealth);
            }
            
        }
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
