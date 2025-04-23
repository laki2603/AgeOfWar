package model;

import java.util.List;

public abstract class Unit {
    protected final int size;

    public Unit(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public abstract String getTypeName();
    public abstract List<String> getAdvantages();

    public boolean hasAdvantageOver(Unit opponent) {
        return getAdvantages().stream()
            .anyMatch(adv -> adv.equalsIgnoreCase(opponent.getTypeName()));
    }


    public int getEffectiveStrengthAgainst(Unit opponent) {
        return hasAdvantageOver(opponent) ? size * 2 : size;
    }

    public boolean beats(Unit opponent) {
        return getEffectiveStrengthAgainst(opponent) > opponent.getSize();
    }

    @Override
    public String toString() {
        return getTypeName() + "#" + size;
    }
}