package week7;

class PlayerStats {
    protected String playerName;
    protected int matchesPlayed;

    public PlayerStats(String name, int matches) {
        playerName = name;
        matchesPlayed = matches;
    }

    public void displayStats() {
        System.out.println("Player: " + playerName + ", Matches Played: " + matchesPlayed);
    }
}

class FootballStats extends PlayerStats {
    private int goals;

    public FootballStats(String name, int matches, int goals) {
        super(name, matches);
        this.goals = goals;
    }

    public void displayStats() {
        super.displayStats();
        System.out.println("Goals Scored: " + goals);
    }
}

class CricketStats extends PlayerStats {
    private int runs;
    private int wickets;

    public CricketStats(String name, int matches, int runs, int wickets) {
        super(name, matches);
        this.runs = runs;
        this.wickets = wickets;
    }

    public void displayStats() {
        super.displayStats();
        System.out.println("Runs: " + runs + ", Wickets: " + wickets);
    }
}

