import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Program {
    public static void main(String[] args){


        Battle b = new Battle();
        Skarmory p1 = new Skarmory("1", 1);
        Zorua p2 = new Zorua("2", 1);
        Zoroark p3 = new Zoroark("3", 1);
        Cleffa p4 = new Cleffa("4", 1);
        Clefairy p5 = new Clefairy("5", 1);
        Clefable p6 = new Clefable("6", 1);



        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);

        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);

        b.go();




    }

}
