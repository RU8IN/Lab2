package pokemons;

import movesets.trubbish.AcidSpray;
import movesets.trubbish.Amnesia;
import movesets.trubbish.PoisonGas;
import movesets.trubbish.Pound;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Trubbish extends Pokemon {


    public Trubbish(String name, int level) {
        super(name, level);
        double HP = 50.0d;
        double ATTACK = 50.0d;
        double DEFENCE = 62.0d;
        double SPEED = 65.0d;
        double SPECIAL_ATTACK = 40.0d;
        double SPECIAL_DEFENCE = 62.0d;

        setStats(HP, ATTACK, DEFENCE, SPEED, SPECIAL_ATTACK, SPECIAL_DEFENCE);
        setType(Type.POISON);
        setMove(new Amnesia(), new AcidSpray(), new PoisonGas(), new Pound());
    }
}
