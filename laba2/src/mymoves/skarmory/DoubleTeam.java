package mymoves.skarmory;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {

    public DoubleTeam(double pow, double acc){

        super(Type.NORMAL, pow, acc);




    }


    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);



    }

    @Override
    protected  void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);

        Effect e = new Effect().stat(Stat.EVASION, 1);

        p.addEffect(e);

    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }

}
