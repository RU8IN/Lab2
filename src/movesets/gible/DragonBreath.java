package movesets.gible;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DragonBreath extends SpecialMove {

    public DragonBreath() {
        super(Type.DRAGON, 60.0d, 100.0d);
    }

    @Override
    public void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.3) {
            Effect.paralyze(pokemon);
        }
    }

    @Override
    public String describe() {
        return "использует Dragon Breath!";
    }
}
