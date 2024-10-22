package pokemons;

import moves.Facade;
import moves.FlameCharge;
import moves.WillOWisp;

import ru.ifmo.se.pokemon.*;

public class Vulpix extends Pokemon {
    public Vulpix(String name, int level) {
        super(name, level);
        setType(Type.FIRE);
        setStats(38, 41, 40, 50, 65, 65);
        setMove(new WillOWisp(), new FlameCharge(), new Facade());
    }
}
