package static_database;

public class AllGyms {
    public static GymDiff getGym(int num){
        GymDiff gym=new GymDiff();
        if(num==1){
            GymDiff1 obj=new GymDiff1();
            gym.gymName="Gym 1";
            gym.gymPok=obj.addGymPokemons();
        }
        else if(num==2){
            GymDiff2 obj=new GymDiff2();
            gym.gymName="Gym 2";
            gym.gymPok=obj.addGymPokemons();
        }
        else if(num==3){
            GymDiff3 obj=new GymDiff3();
            gym.gymName="Gym 3";
            gym.gymPok=obj.addGymPokemons();
        }
        else if(num==4){
            GymDiff4 obj=new GymDiff4();
            gym.gymName="Gym 4";
            gym.gymPok=obj.addGymPokemons();
        }
        else if(num==5){
            GymDiff5 obj=new GymDiff5();
            gym.gymName="Gym 5";
            gym.gymPok=obj.addGymPokemons();
        }
        return gym;
    }
    public static void main(String[] args) {

    }
}