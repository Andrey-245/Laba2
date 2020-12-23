package mypokemons;

import mymoves.clefairy.Swagger;
import mymoves.clefairy.DreamEater;
import mymoves.clefairy.MeteorMash;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Clefairy extends Cleffa{


    public Clefairy(String name, int level){
        super(name, level);

        super.setType(Type.FAIRY);
        super.setStats(70, 45, 48, 60, 65, 35);

        Swagger swagger = new Swagger(0, 85);
        DreamEater dreamEater = new DreamEater(100, 100);
        MeteorMash meteorMash = new MeteorMash(90, 90);




        super.setMove(swagger, dreamEater, meteorMash);


    }

}