import core.Platoon;
import service.BattlePlanner;
import util.PlatoonParser;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) { // Start an infinite loop to ask for input again after each round
            System.out.println("Enter your platoons:");
            String own = sc.nextLine();

            System.out.println("Enter enemy platoons:");
            String enemy = sc.nextLine();

            List<Platoon> ownPlatoons = PlatoonParser.parse(own);
            List<Platoon> enemyPlatoons = PlatoonParser.parse(enemy);

            BattlePlanner planner = new BattlePlanner();
            Optional<List<Platoon>> winningArrangement = planner.findWinningArrangement(ownPlatoons, enemyPlatoons);

            if (winningArrangement.isPresent()) {
                System.out.println("Winning Arrangement:");
                System.out.println(PlatoonParser.format(winningArrangement.get()));
            } else {
                System.out.println("There is no chance of winning");
            }

            // Ask the user if they want to try again
            System.out.println("Do you want to enter new platoons? (yes/no)");
            String response = sc.nextLine().toLowerCase();

            if (response.equals("no")) {
                break; // Exit the loop if the user says "no"
            } else if (!response.equals("yes")) {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }

        sc.close();
    }
}
