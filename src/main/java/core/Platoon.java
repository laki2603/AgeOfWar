package core;

import model.Unit;

public class Platoon {
    private final Unit unit;

    public Platoon(Unit unit) {
        this.unit = unit;
    }

    public boolean beats(Platoon opponent) {
        return unit.beats(opponent.unit);
    }

    @Override
    public String toString() {
        return unit.toString();
    }

    public Unit getUnit() {
        return unit;
    }
}