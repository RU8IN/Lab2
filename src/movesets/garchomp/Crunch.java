package movesets.garchomp;

import ru.ifmo.se.pokemon.*;

import java.security.spec.ECField;

public class Crunch extends PhysicalMove {

    public Crunch() {
        super(Type.DARK, 80.0d, 100.0d);
    }

    @Override
    public void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.2) {
            Effect effect = new Effect().stat(Stat.DEFENSE, -1);
            pokemon.addEffect(effect);
        }
    }

    @Override
    public String describe() {
        return "использует Crunch!";
    }
}
