package mypokemons;

import mymoves.zoroark.NastyPlot;
import mymoves.zoroark.ScaryFace;
import mymoves.zoroark.Swagger;
import mymoves.zoroark.HoneClaws;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Zoroark extends Zorua {

    public Zoroark(String name, int level){
        super(name, level);

        super.setType(Type.DARK);
        super.setStats(60, 105, 60, 120, 60, 105);

        Swagger swagger = new Swagger(0, 85);
        ScaryFace scaryFace = new ScaryFace(0, 100);
        NastyPlot nastyPlot = new NastyPlot(0, 0);
        HoneClaws honeClaws = new HoneClaws(0, 0);



        super.setMove(swagger, scaryFace, nastyPlot, honeClaws);


    }

}
