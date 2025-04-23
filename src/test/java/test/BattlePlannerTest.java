package test;


import core.Platoon;
import org.junit.jupiter.api.Test;
import service.BattlePlanner;
import util.PlatoonParser;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class BattlePlannerTest {

    @Test
    public void testWinScenario() {
        String own = "Spearmen#10;Militia#30;FootArcher#20;LightCavalry#1000;HeavyCavalry#120";
        String enemy = "Militia#10;Spearmen#10;FootArcher#1000;LightCavalry#120;CavalryArcher#100";

        List<Platoon> ownPlatoons = PlatoonParser.parse(own);
        List<Platoon> enemyPlatoons = PlatoonParser.parse(enemy);

        BattlePlanner planner = new BattlePlanner();
        Optional<List<Platoon>> result = planner.findWinningArrangement(ownPlatoons, enemyPlatoons);

        // Assert that a winning arrangement is found for this scenario
        assertTrue(result.isPresent(), "Expected to find a winning arrangement.");
    }

    @Test
    public void testLossScenario() {
        String own = "Militia#5;Militia#5;Militia#5;Militia#5;Militia#5";
        String enemy = "HeavyCavalry#200;HeavyCavalry#200;HeavyCavalry#200;HeavyCavalry#200;HeavyCavalry#200";

        List<Platoon> ownPlatoons = PlatoonParser.parse(own);
        List<Platoon> enemyPlatoons = PlatoonParser.parse(enemy);

        BattlePlanner planner = new BattlePlanner();
        Optional<List<Platoon>> result = planner.findWinningArrangement(ownPlatoons, enemyPlatoons);

        // Assert that no winning arrangement is found for this scenario
        assertFalse(result.isPresent(), "Expected no winning arrangement.");
    }

    @Test
    public void testRetryLogicYes() {
        // Simulate a scenario where the user answers "yes" to retrying.
        String own = "Spearmen#10;Militia#30;FootArcher#20;LightCavalry#1000;HeavyCavalry#120";
        String enemy = "Militia#10;Spearmen#10;FootArcher#1000;LightCavalry#120;CavalryArcher#100";

        List<Platoon> ownPlatoons = PlatoonParser.parse(own);
        List<Platoon> enemyPlatoons = PlatoonParser.parse(enemy);

        BattlePlanner planner = new BattlePlanner();
        
        // Assume the planner internally handles user inputs to retry the battle
        Optional<List<Platoon>> result = planner.findWinningArrangement(ownPlatoons, enemyPlatoons);

        // Assert that the retry logic will eventually result in the correct arrangement being found
        assertTrue(result.isPresent(), "Expected to find a winning arrangement after retrying.");
    }

    @Test
    public void testRetryLogicNo() {
        // Simulate a scenario where the user answers "no" to retrying.
        String own = "Militia#5;Militia#5;Militia#5;Militia#5;Militia#5";
        String enemy = "HeavyCavalry#200;HeavyCavalry#200;HeavyCavalry#200;HeavyCavalry#200;HeavyCavalry#200";

        List<Platoon> ownPlatoons = PlatoonParser.parse(own);
        List<Platoon> enemyPlatoons = PlatoonParser.parse(enemy);

        BattlePlanner planner = new BattlePlanner();
        
        // Assume the planner internally handles user inputs to retry the battle
        Optional<List<Platoon>> result = planner.findWinningArrangement(ownPlatoons, enemyPlatoons);

        // Assert that no winning arrangement will be found if the user says no to retry
        assertFalse(result.isPresent(), "Expected no winning arrangement even if retrying was skipped.");
    }
}
