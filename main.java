class pokemonAttributes {
    public int damageGiven, damageTaken, level=1, health, pokemonType;
    private void increaseHealth(){
        health+=level*0.25*health;
    }
}

class mechanics extends pokemonAttributes{
    float ct, cg;
    {
        damageTaken *= ct;
        damageGiven *= cg;
    }
}

class fireType extends mechanics {
    {
        if (pokemonType == 1)
        {
            cg = 1;
            ct = 1;
        }
        else if (pokemonType == 2)
        {
            cg = 0.75f;
            ct = 1.25f;
        }
        else if (pokemonType == 3)
        {
            cg = 1.25f;
            ct = 0.75f;
        }
    }
}

class waterType extends mechanics {
    {
        if (pokemonType == 1)
        {
            cg = 1.25f;
            ct = 0.75f;
        }
        else if (pokemonType == 2)
        {
            cg = 1;
            ct = 1;
        }
        else if (pokemonType == 3)
        {
            ct = 1.25f;
            cg = 0.75f;
        }
    }

}

class grassType extends mechanics {
    {
        if (pokemonType == 1)
        {
            cg = 0.75f;
            ct = 1.25f;
        }
        else if (pokemonType == 2)
        {
            ct = 0.75f;
            cg = 1.25f;
        }
        else if (pokemonType == 3)
        {
            cg = 1;
            ct = 1;
        }
    }

}

