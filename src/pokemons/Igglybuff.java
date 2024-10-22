package pokemons;

import moves.ShadowBall;
import moves.ThunderWave;

import ru.ifmo.se.pokemon.*;

public final class Igglybuff extends Pokemon {
    public Igglybuff(String name, int level) {
        super(name, level);
        setType(Type.FAIRY);
        setStats(90, 30, 15, 40, 20, 15);
        setMove(new ThunderWave(), new ShadowBall());
    }
}
