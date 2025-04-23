package model;

import java.util.Arrays;
import java.util.List;

public class FootArcher extends Unit {
    public FootArcher(int size) {
        super(size);
    }

    @Override
    public String getTypeName() {
        return "FootArcher";
    }

    @Override
    public List<String> getAdvantages() {
        return Arrays.asList("Militia", "CavalryArcher");
    }
}