package pokemons;

import moves.Facade;
import moves.FlameCharge;
import moves.NastyPlot;
import moves.WillOWisp;

import ru.ifmo.se.pokemon.*;

public class Ninetales extends Pokemon {
    public Ninetales(String name, int level) {
        super(name, level);
        setType(Type.FIRE);
        setStats(73, 76, 75, 81, 100, 100);
        setMove(new WillOWisp(), new FlameCharge(), new Facade(), new NastyPlot());
    }
}
