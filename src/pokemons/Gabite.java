package pokemons;

import movesets.gabite.Bulldoze;
import ru.ifmo.se.pokemon.Type;

public class Gabite extends Gible{

    public Gabite(String name, int level) {
        super(name, level);
        double HP = 68.0d;
        double ATTACK = 90.0d;
        double DEFENCE = 65.0d;
        double SPEED = 82.0d;
        double SPECIAL_ATTACK = 50.0d;
        double SPECIAL_DEFENCE = 55.0d;

        setStats(HP, ATTACK, DEFENCE, SPEED, SPECIAL_ATTACK, SPECIAL_DEFENCE);
        setType(Type.DRAGON, Type.GROUND);
        addMove(new Bulldoze());
    }
}
