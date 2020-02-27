import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FantasyLeague<T extends Team> {
    private final int id;
    private static int leagueCounter;
    public String name;
    private List<T> teams = new ArrayList<T>();

    public FantasyLeague(String name) {
        this.name = name;
        leagueCounter++;
        id = leagueCounter;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static int getLeagueCounter() {
        return leagueCounter;
    }

    public boolean addTeam(T team) {
        if(teams.contains(team)){
            System.out.println(team.getName() + " is already in the league.");
            return false;
        }
        else {
            teams.add(team);
            System.out.println(team.getName() + " has been added to " + this.getName());
            return true;
        }
    }

    public void showStandings(){
        Collections.sort(teams);
        for(T t : teams) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }

}
