package model;

import java.util.Arrays;
import java.util.List;

public class HeavyCavalry extends Unit {
    public HeavyCavalry(int size) {
        super(size);
    }

    @Override
    public String getTypeName() {
        return "HeavyCavalry";
    }

    @Override
    public List<String> getAdvantages() {
        return Arrays.asList("Militia", "FootArcher", "LightCavalry");
    }
}