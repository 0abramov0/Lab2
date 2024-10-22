package moves;

import ru.ifmo.se.pokemon.*;

public final class Submission extends PhysicalMove {
    public Submission() {
        super(Type.FIGHTING, 80, 80);
    }

    @Override
    protected void applySelfDamage(Pokemon p, double damage) {
        p.setMod(Stat.HP, -20);
    }

    @Override
    protected String describe() {
        return "использует Submission";
    }
}
