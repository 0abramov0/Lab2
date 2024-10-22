package moves;

import ru.ifmo.se.pokemon.*;

public final class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        Status currentCondition = att.getCondition();
        if (currentCondition.equals(Status.BURN) || currentCondition.equals(Status.PARALYZE) || currentCondition.equals(Status.POISON)) {
            return 2.0;
        }
        return 1.0;
    }

    @Override
    protected String describe() {
        return "использует Facade";
    }
}
