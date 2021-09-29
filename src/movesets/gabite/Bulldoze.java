package movesets.gabite;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {

    public Bulldoze() {
        super(Type.GROUND, 60.0d, 100.0d);
    }

    @Override
    public void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().stat(Stat.SPEED, -1);

        pokemon.addEffect(effect);
    }

    @Override
    public String describe() {
        return "использует Bulldoze!";
    }
}
