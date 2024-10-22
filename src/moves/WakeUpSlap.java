package moves;

import ru.ifmo.se.pokemon.*;

public final class WakeUpSlap extends PhysicalMove {
    public WakeUpSlap() {
        super(Type.FIGHTING, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        Status currentStatus = def.getCondition();

        if (currentStatus.equals(Status.SLEEP)) {
            Effect eff = new Effect().condition(Status.NORMAL);
            def.setCondition(eff);
            def.setMod(Stat.HP, (int) Math.round(damage) * 2);
        } else {
            def.setMod(Stat.HP, (int) Math.round(damage));
        }
    }

    @Override
    protected String describe() {
        return "использует Wake Up Slap";
    }
}
