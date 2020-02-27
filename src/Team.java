import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    private final int id;
    private static int teamCounter;
    private int wins = 0;
    private int losses = 0;
    private int ties = 0;
    private int gamesPlayed = 0;
    private List roster = new ArrayList<T>();

    public Team(String name) {
        this.name = name;
        teamCounter++;
        id = teamCounter;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static int getTeamCounter() {
        return teamCounter;
    }

    public boolean addPlayer(T player){
        if(roster.contains(player)) {
            System.out.println(player.getName() + " is already on the team.");
            return false;
        } else {
            System.out.println(player.getName() + " has been added to " + this.getName());
            return true;
        }
    }

    public void gameResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if(ourScore > theirScore) {
            wins++;
            message = " beat ";
        } else if(ourScore < theirScore) {
            losses++;
            message = " was defeated by ";
        } else {
            ties++;
            message = " tied with ";
        }
        gamesPlayed++;
        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.gameResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (wins * 2) + ties;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
            return -1;
        } else if(this.ranking() < team.ranking()){
            return 1;
        } else {
            return 0;
        }
    }
}
