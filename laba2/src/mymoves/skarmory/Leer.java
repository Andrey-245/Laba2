package mymoves.skarmory;

import ru.ifmo.se.pokemon.*;

public class Leer extends StatusMove {

    public Leer(double pow, double acc){

        super(Type.NORMAL, pow, acc);




    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);




    }

    @Override
    protected  void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);

        Effect e = new Effect().stat(Stat.DEFENSE, -1);


    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }

}
