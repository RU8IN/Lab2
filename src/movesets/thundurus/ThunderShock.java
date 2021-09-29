package movesets.thundurus;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class ThunderShock extends SpecialMove {

    public ThunderShock()
    {
        super(Type.ELECTRIC, 40.0, 100.0);
    }

    @Override
    public void applyOppEffects(Pokemon pokemon)
    {
        if (Math.random() <= 0.1)
        {
            Effect.paralyze(pokemon);
        }
    }

    @Override
    public String describe()
    {
        return "использует Thunder Shock!";
    }
}
