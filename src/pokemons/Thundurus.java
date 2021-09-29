package pokemons;

import movesets.thundurus.Astonish;
import movesets.thundurus.Leer;
import movesets.thundurus.Swagger;
import movesets.thundurus.ThunderShock;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Thundurus extends Pokemon {


    public Thundurus(String name, int level) {
        super(name, level);
        double HP = 79.0d;
        double ATTACK = 115.0d;
        double DEFENCE = 70.0d;
        double SPEED = 125.0d;
        double SPECIAL_ATTACK = 80.0d;
        double SPECIAL_DEFENCE = 111.0d;

        setStats(HP, ATTACK, DEFENCE, SPEED, SPECIAL_ATTACK, SPECIAL_DEFENCE);
        setType(Type.ELECTRIC, Type.FLYING);
        setMove(new Astonish(), new Swagger(), new ThunderShock(), new Leer());
    }
}
