package model;

import java.util.Arrays;
import java.util.List;

public class LightCavalry extends Unit {
    public LightCavalry(int size) {
        super(size);
    }

    @Override
    public String getTypeName() {
        return "LightCavalry";
    }

    @Override
    public List<String> getAdvantages() {
        return Arrays.asList("FootArcher", "CavalryArcher");
    }
}