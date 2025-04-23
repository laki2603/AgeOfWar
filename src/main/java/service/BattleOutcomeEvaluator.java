package service;

import core.Platoon;

public class BattleOutcomeEvaluator {
    public static boolean isWinning(Platoon a, Platoon b) {
        return a.beats(b);
    }
}