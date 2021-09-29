package movesets.garbodor;

import ru.ifmo.se.pokemon.*;

public class MetalClaw extends PhysicalMove {

    public MetalClaw() {
        super(Type.STEEL, 50.0d, 95.0d);
    }

    @Override
    public void applySelfEffects(Pokemon pokemon) {
        if (Math.random() <= 0.1) {
            Effect effect = new Effect().stat(Stat.ATTACK, 1);

            pokemon.addEffect(effect);
        }
    }

    @Override
    public String describe() {
        return "использует Metal Claw!";
    }
}
