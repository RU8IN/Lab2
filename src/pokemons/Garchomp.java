package pokemons;

import movesets.garchomp.Crunch;
import ru.ifmo.se.pokemon.Type;

public class Garchomp extends Gible{

    public Garchomp(String name, int level) {
        super(name, level);
        double HP = 108.0d;
        double ATTACK = 130.0d;
        double DEFENCE = 95.0d;
        double SPEED = 102.0d;
        double SPECIAL_ATTACK = 80.0d;
        double SPECIAL_DEFENCE = 85.0d;

        setStats(HP, ATTACK, DEFENCE, SPEED, SPECIAL_ATTACK, SPECIAL_DEFENCE);
        setType(Type.DRAGON, Type.GROUND);
        addMove(new Crunch());
    }
}
