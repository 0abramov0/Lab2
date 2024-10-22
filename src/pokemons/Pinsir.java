package pokemons;

import moves.Confide;
import moves.DoubleTeam;
import moves.StormThrow;
import moves.Submission;

import ru.ifmo.se.pokemon.*;

public class Pinsir extends Pokemon {
    public Pinsir(String name, int level) {
        super(name, level);
        setType(Type.BUG);
        setStats(65, 125, 100, 55, 70, 85);
        setMove(new DoubleTeam(), new Confide(), new Submission(), new StormThrow());
    }
}
