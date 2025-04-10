package week7;

public class SportsTest {
    public static void main(String[] args) {
        FootballStats f = new FootballStats("Messi", 100, 80);
        CricketStats c = new CricketStats("Virat", 250, 12000, 50);

        f.displayStats();
        System.out.println();
        c.displayStats();
    }
}

