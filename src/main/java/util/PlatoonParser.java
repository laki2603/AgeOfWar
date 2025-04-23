package util;

import core.Platoon;
import model.*;

import java.util.*;

public class PlatoonParser {

	public static List<Platoon> parse(String input) {
	    List<Platoon> platoons = new ArrayList<>();
	    for (String entry : input.split(";")) {
	        String[] parts = entry.trim().split("#");
	        String type = parts[0].trim();
	        int size = Integer.parseInt(parts[1].trim());
	        platoons.add(new Platoon(createUnit(type, size)));
	    }
	    return platoons;
	}


    private static Unit createUnit(String type, int size) {
        return switch (type.toLowerCase()) {
            case "militia" -> new Militia(size);
            case "spearmen" -> new Spearmen(size);
            case "lightcavalry" -> new LightCavalry(size);
            case "heavycavalry" -> new HeavyCavalry(size);
            case "cavalryarcher" -> new CavalryArcher(size);
            case "footarcher" -> new FootArcher(size);
            default -> throw new IllegalArgumentException("Unknown type: " + type);
        };
    }

    public static String format(List<Platoon> platoons) {
        return String.join(";", platoons.stream().map(Platoon::toString).toArray(String[]::new));
    }
}