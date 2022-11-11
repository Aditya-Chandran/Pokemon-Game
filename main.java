class pokemonAttributes {
    public int damageGiven, damageTaken, level=0, maxHealth, pokemonType;
    private void increaseHealth(){
        maxHealth += level*0.25*maxHealth ;
    }
}

class mechanics extends pokemonAttributes{
    float constantTaken, constantGiven;
    {
        damageTaken *= constantTaken;
        damageGiven *= constantGiven;
    }
}

class fireType extends mechanics {
    {
        if (pokemonType == 1)
        {
            constantGiven = 1;
            constantTaken = 1;
        }
        else if (pokemonType == 2)
        {
            constantGiven = 0.75f;
            constantTaken = 1.25f;
        }
        else if (pokemonType == 3)
        {
            constantGiven = 1.25f;
            constantTaken = 0.75f;
        }
    }
}

class waterType extends mechanics {
    {
        if (pokemonType == 1)
        {
            constantGiven = 1.25f;
            constantTaken = 0.75f;
        }
        else if (pokemonType == 2)
        {
            constantGiven = 1;
            constantTaken = 1;
        }
        else if (pokemonType == 3)
        {
            constantTaken = 1.25f;
            constantGiven = 0.75f;
        }
    }

}

class grassType extends mechanics {
    {
        if (pokemonType == 1)
        {
            constantGiven = 0.75f;
            constantTaken = 1.25f;
        }
        else if (pokemonType == 2)
        {
            constantTaken = 0.75f;
            constantGiven = 1.25f;
        }
        else if (pokemonType == 3)
        {
            constantGiven = 1;
            constantTaken = 1;
        }
    }
}

