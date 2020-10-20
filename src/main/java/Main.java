import variant_1.*;
import variant_2.*;

public class Main {
    public static void main(String[] args) {

        Obstacleable[] team = {new Cat("Матроскин", 2, 200),
                new Human("Batman", 10, 10000),
                new Robot("Вердер", 10, 1_000_000_000)};

        Obsticle[] tournament = {new Wall(2), new Stadium(100), new Wall(5),
                new Stadium(500), new Wall(10), new Stadium(10000)};

        Object[] team2 = {new Cat_1("Том", 2, 200),
                new Human_1("Усейн Болт", 10, 1_000_000),
                new Robot_1("Федор", 10, 1_000_000_000)};

        Object[] tournament2 = {new Wall_1(2), new Stadium_1(100), new Wall_1(5),
                new Stadium_1(500), new Wall_1(10), new Stadium_1(10000)};

        new Tournament(tournament, team);

        System.out.println("__________________________________________");

        new Tournament(tournament2, team2);
    }
}
