package movesets.trubbish;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class PoisonGas extends StatusMove {

    public PoisonGas() {
        super(Type.POISON, 0.0d, 90.0d);
    }

    @Override
    public void applyOppEffects(Pokemon pokemon) {
        Effect.poison(pokemon);
    }

    @Override
    public String describe() {
        return "использует Poison Gas!";
    }
}
