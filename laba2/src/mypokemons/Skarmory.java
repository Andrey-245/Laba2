package mypokemons;

import mymoves.skarmory.Agility;
import mymoves.skarmory.DoubleTeam;
import mymoves.skarmory.Leer;
import mymoves.skarmory.MetalSound;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Skarmory extends Pokemon {

    public Skarmory(String name, int level){
        super(name, level);

        super.setType(Type.FLYING, Type.STEEL);
        super.setStats(65, 80, 140, 40, 70, 70);

        MetalSound metalSound = new MetalSound(0, 85);
        Leer leer = new Leer(0, 100);
        Agility agility = new Agility(0, 0);
        DoubleTeam doubleTeam = new DoubleTeam(0, 0);


        super.setMove(metalSound, leer, agility, doubleTeam);


    }

}
