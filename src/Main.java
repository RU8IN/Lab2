import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Pokemon[] team_1 = {
                new Thundurus("Саня", 18),
                new Garchomp("Федя", 17),
                new Gible("Наум", 18)
        };

        Pokemon[] team_2 = {
                new Garbodor("Егор", 18),
                new Gabite("Вася", 18),
                new Trubbish("Юра", 18)
        };

        Battle battle = new Battle();

        for (int i = 0; i < 3; i++) {
            battle.addAlly(team_1[i]);
        }

        for (int i = 0; i < 3; i++) {
            battle.addFoe(team_2[i]);
        }

        battle.go();
    }
}
