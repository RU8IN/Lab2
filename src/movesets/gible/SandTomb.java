package movesets.gible;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class SandTomb extends PhysicalMove {

    public SandTomb() {
        super(Type.GROUND, 35.0d, 85.0d);
    }

    @Override
    public void applyOppEffects(Pokemon pokemon) {

        Effect effect = new Effect().attack(pokemon.getHP() * 0.16).turns(4);

        pokemon.addEffect(effect);
    }

    @Override
    public String describe() {
        return "использует Sand Tomb!";
    }
}
