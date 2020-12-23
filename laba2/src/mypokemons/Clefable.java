package mypokemons;

import mymoves.clefable.Swagger;
import mymoves.clefable.DreamEater;
import mymoves.clefable.MeteorMash;
import mymoves.clefable.Psychic;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Clefable extends Clefairy{


    public Clefable(String name, int level){
        super(name, level);

        super.setType(Type.FAIRY);
        super.setStats(70, 45, 48, 60, 65, 35);

        Swagger swagger = new Swagger(0, 85);
        DreamEater dreamEater = new DreamEater(100, 100);
        MeteorMash meteorMash = new MeteorMash(90, 90);
        Psychic psychic = new Psychic(90, 100);




        super.setMove(swagger, dreamEater, meteorMash, psychic);


    }

}