package movesets.thundurus;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {

    public Swagger()
    {
        super(Type.NORMAL, 0.0, 85.0);
    }

    @Override
    public void applyOppEffects(Pokemon pokemon)
    {
        Effect.confuse(pokemon);

        Effect e = new Effect().stat(Stat.ATTACK, 2);
        pokemon.addEffect(e);
    }

    @Override
    public String describe(){
        return "использует Swagger!";
    }
}
