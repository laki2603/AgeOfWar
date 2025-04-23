package model;

import java.util.Arrays;
import java.util.List;

public class Militia extends Unit {
    public Militia(int size) {
        super(size);
    }

    @Override
    public String getTypeName() {
        return "Militia";
    }

    @Override
    public List<String> getAdvantages() {
        return Arrays.asList("Spearmen", "LightCavalry");
    }
}