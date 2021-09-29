package movesets.thundurus;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Astonish extends PhysicalMove {

    public Astonish() {
        super(Type.GHOST, 30.0d, 100.0d);
    }

    @Override
    public void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.3) {
            Effect.flinch(pokemon);
        }
    }

    @Override
    public String describe() {
        return "использует Astonish!";
    }
}
