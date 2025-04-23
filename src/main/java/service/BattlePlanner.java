package service;

import core.Platoon;
import java.util.*;
import java.util.stream.Collectors;

public class BattlePlanner {

    public Optional<List<Platoon>> findWinningArrangement(List<Platoon> own, List<Platoon> enemy) {
        // Sort platoons by size, you can add more sorting logic here to prioritize advantages
        List<Platoon> sortedOwnPlatoons = own.stream()
                .sorted(Comparator.comparingInt(p -> p.getUnit().getSize())) // Sort by size (ascending)
                .collect(Collectors.toList());

        List<Platoon> sortedEnemyPlatoons = enemy.stream()
                .sorted(Comparator.comparingInt(p -> p.getUnit().getSize())) // Sort by size (ascending)
                .collect(Collectors.toList());

        // Try matching platoons greedily
        List<Platoon> arrangement = new ArrayList<>();
        int wins = 0;

        for (int i = 0; i < 5; i++) {
            Platoon ownPlatoon = sortedOwnPlatoons.get(i);
            Platoon enemyPlatoon = sortedEnemyPlatoons.get(i);

            if (BattleOutcomeEvaluator.isWinning(ownPlatoon, enemyPlatoon)) {
                wins++;
            }

            arrangement.add(ownPlatoon);
        }

        // If we have at least 3 wins, return this arrangement
        if (wins >= 3) {
            return Optional.of(arrangement);
        } else {
            return Optional.empty();
        }
    }
}
