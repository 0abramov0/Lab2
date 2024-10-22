package pokemons;

import moves.ShadowBall;
import moves.ThunderWave;
import moves.WakeUpSlap;

import ru.ifmo.se.pokemon.*;

public final class Jigglypuff extends Pokemon {
    public Jigglypuff(String name, int level) {
        super(name, level);
        setType(Type.FAIRY);
        setStats(115, 45, 20, 45, 25, 20);
        setMove(new ThunderWave(), new ShadowBall(), new WakeUpSlap());
    }
}
