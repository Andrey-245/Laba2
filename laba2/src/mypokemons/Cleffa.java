package mypokemons;

import mymoves.cleffa.Swagger;
import mymoves.cleffa.DreamEater;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cleffa extends Pokemon{


    public Cleffa(String name, int level){
        super(name, level);

        super.setType(Type.FAIRY);
        super.setStats(50, 25, 28, 45, 55, 15);

        Swagger swagger = new Swagger(0, 85);
        DreamEater dreamEater = new DreamEater(100, 100);




        super.setMove(swagger, dreamEater);


    }

}