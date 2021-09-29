package pokemons;

import movesets.garbodor.AcidSpray;
import movesets.garbodor.MetalClaw;
import movesets.garbodor.PoisonGas;
import movesets.garbodor.Pound;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Garbodor extends Pokemon {

    public Garbodor(String name, int level) {
        super(name, level);
        double HP = 80.0d;
        double ATTACK = 95.0d;
        double DEFENCE = 82.0d;
        double SPEED = 75.0d;
        double SPECIAL_ATTACK = 60.0d;
        double SPECIAL_DEFENCE = 82.0d;

        setStats(HP, ATTACK, DEFENCE, SPEED, SPECIAL_ATTACK, SPECIAL_DEFENCE);
        setType(Type.POISON);
        setMove(new AcidSpray(), new PoisonGas(), new Pound(), new MetalClaw());
    }
}
