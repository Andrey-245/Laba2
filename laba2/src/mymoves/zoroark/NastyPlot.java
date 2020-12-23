package mymoves.zoroark;

import ru.ifmo.se.pokemon.*;

public class NastyPlot extends StatusMove {

    public NastyPlot(double pow, double acc){

        super(Type.DARK, pow, acc);




    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);


    }

    @Override
    protected  void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);

        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, 2);


    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }

}
