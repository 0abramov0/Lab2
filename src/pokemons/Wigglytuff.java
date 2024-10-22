package pokemons;

import moves.DoubleSlap;
import moves.ShadowBall;
import moves.ThunderWave;
import moves.WakeUpSlap;

import ru.ifmo.se.pokemon.*;

public final class Wigglytuff extends Pokemon {
    public Wigglytuff(String name, int level) {
        super(name, level);
        setType(Type.FAIRY);
        setStats(140, 70, 45, 85, 50, 45);
        setMove(new ThunderWave(), new ShadowBall(), new WakeUpSlap(), new DoubleSlap());
    }
}
