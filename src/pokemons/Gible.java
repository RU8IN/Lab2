package pokemons;

import movesets.gible.DragonBreath;
import movesets.gible.SandAttack;
import movesets.gible.SandTomb;
import movesets.gible.Tackle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Gible extends Pokemon {

    public Gible(String name, int level) {
        super(name, level);
        double HP = 58.0d;
        double ATTACK = 70.0d;
        double DEFENCE = 45.0d;
        double SPEED = 42.0d;
        double SPECIAL_ATTACK = 40.0d;
        double SPECIAL_DEFENCE = 45.0d;

        setStats(HP, ATTACK, DEFENCE, SPEED, SPECIAL_ATTACK, SPECIAL_DEFENCE);
        setType(Type.DRAGON, Type.GROUND);
        setMove(new DragonBreath(), new SandAttack(), new SandTomb(), new Tackle());
    }
}
