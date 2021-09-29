package movesets.garbodor;

import ru.ifmo.se.pokemon.*;

public class AcidSpray extends SpecialMove {

    public AcidSpray() {
        super(Type.POISON, 40.0d, 100.0d);
    }

    @Override
    public void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().stat(Stat.SPECIAL_DEFENSE, -2);
    }

    @Override
    public String describe() {
        return "использует Acid Spray!";
    }
}
