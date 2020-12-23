package mymoves.skarmory;


import ru.ifmo.se.pokemon.*;

public class MetalSound extends StatusMove {

    public MetalSound(double pow, double acc){

        super(Type.STEEL, pow, acc);




    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);


    }

    @Override
    protected  void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -2);
    }


    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does "  + pieces[pieces.length-1];
    }

}
