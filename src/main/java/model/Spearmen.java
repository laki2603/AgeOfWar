package model;

import java.util.Arrays;
import java.util.List;

public class Spearmen extends Unit {
    public Spearmen(int size) {
        super(size);
    }

    @Override
    public String getTypeName() {
        return "Spearmen";
    }

    @Override
    public List<String> getAdvantages() {
        return Arrays.asList("LightCavalry", "HeavyCavalry");
    }
}