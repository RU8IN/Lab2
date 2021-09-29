package movesets.thundurus;

import ru.ifmo.se.pokemon.*;

public class Leer extends StatusMove {

    public Leer() {
        super(Type.NORMAL, 0.0, 100.0);
    }

    @Override
    public void applyOppEffects(Pokemon pokemon) {
        int random_turns_factor = (int) (Math.random() * 10);

        // Stats can be lowered to a minimum of -6 stages each
        if (random_turns_factor > 6) {
            random_turns_factor = 6;
        }

        Effect[] effects = {new Effect().stat(Stat.HP, -random_turns_factor).turns(2),
                new Effect().stat(Stat.ATTACK, -random_turns_factor).turns(2),
                new Effect().stat(Stat.DEFENSE, -random_turns_factor).turns(2),
                new Effect().stat(Stat.ACCURACY, -random_turns_factor).turns(2)};
        for (int i = 1; i < 4; i++) {
            pokemon.addEffect(effects[i]);
        }
    }

    @Override
    public String describe() {
        return "использует Leer!";
    }

}
