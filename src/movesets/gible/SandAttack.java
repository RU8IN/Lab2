package movesets.gible;

import ru.ifmo.se.pokemon.*;

public class SandAttack extends StatusMove {

    public SandAttack() {
        super(Type.GROUND, 0.0d, 100.0d);
    }

    @Override
    public void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().stat(Stat.ACCURACY, -1);
        pokemon.addEffect(effect);
    }

    @Override
    public String describe() {
        return "использует Sand Attack!";
    }
}

