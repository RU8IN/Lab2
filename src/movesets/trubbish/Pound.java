package movesets.trubbish;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Pound extends PhysicalMove {

    public Pound() {
        super(Type.NORMAL, 40.0d, 100.0d);
    }

    @Override
    public String describe(){
        return "использует Pound!";
    }
}
