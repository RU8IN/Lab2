package movesets.gible;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Tackle extends PhysicalMove {

    public Tackle() {
        super(Type.NORMAL, 40.0d, 100.0d);
    }

    @Override
    public String describe() {
        return "использует Tackle!";
    }
}
