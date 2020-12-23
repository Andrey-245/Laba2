package mypokemons;

import mymoves.zorua.Swagger;
import mymoves.zorua.ScaryFace;
import mymoves.zorua.NastyPlot;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Zorua extends Pokemon{


    public Zorua(String name, int level){
        super(name, level);

        super.setType(Type.DARK);
        super.setStats(40, 65, 40, 80, 40, 65);

        Swagger swagger = new Swagger(0, 85);
        ScaryFace scaryFace = new ScaryFace(0, 100);
        NastyPlot nastyPlot = new NastyPlot(0, 0);



        super.setMove(swagger, scaryFace, nastyPlot);


    }

}
