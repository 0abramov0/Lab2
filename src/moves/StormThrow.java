package moves;

import ru.ifmo.se.pokemon.*;

public final class StormThrow extends PhysicalMove {
    public StormThrow() {
        super(Type.FIGHTING, 40, 100);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return 2.0;
    }

    @Override
    protected String describe() {
        return "использует StormThrow";
    }
}
