package moves;

import ru.ifmo.se.pokemon.*;

import java.util.Random;

public final class DoubleSlap extends PhysicalMove {
    static protected Random r = new Random();

    public DoubleSlap() {
        super(Type.NORMAL, 15, 85, 0, r.nextInt(2, 5));
    }

    @Override
    protected String describe() {
        return "использует Double Slap";
    }
}
