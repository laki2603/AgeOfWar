package model;

import java.util.Arrays;
import java.util.List;

public class CavalryArcher extends Unit {
    public CavalryArcher(int size) {
        super(size);
    }

    @Override
    public String getTypeName() {
        return "CavalryArcher";
    }

    @Override
    public List<String> getAdvantages() {
        return Arrays.asList("Spearmen", "HeavyCavalry");
    }
}