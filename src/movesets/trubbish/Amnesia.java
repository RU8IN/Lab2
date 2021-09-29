package movesets.trubbish;

import ru.ifmo.se.pokemon.*;

public class Amnesia extends StatusMove {

    public Amnesia() {
            super(Type.PSYCHIC, 0.0d, 0.0d);
    }

    @Override
    public void applySelfEffects(Pokemon pokemon) {
        Effect effect = new Effect().stat(Stat.SPECIAL_DEFENSE, 2);

        pokemon.addEffect(effect);
    }

    @Override
    public String describe() {
        return "использует Amnesia!";
    }
}
