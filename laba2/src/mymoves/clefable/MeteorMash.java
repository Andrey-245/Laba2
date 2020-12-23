package mymoves.clefable;

import ru.ifmo.se.pokemon.*;


public class MeteorMash extends SpecialMove {


    public MeteorMash(double pow, double acc){

        super(Type.PSYCHIC, pow, acc);




    }


    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect.confuse(p);




    }


    @Override
    protected  void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        if(chance(0.2)){
            Effect e = new Effect().stat(Stat.ATTACK, 1);
            p.addEffect(e);

        }


    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
    public static boolean chance(double d) {

        return d > Math.random();
    }

}
