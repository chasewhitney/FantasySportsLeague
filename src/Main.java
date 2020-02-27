public class Main {

    public static void main(String[] args) {

        FantasyLeague<Team<FootballPlayer>> winterIsComing= new FantasyLeague<>("Winter is Coming");

        Team<FootballPlayer> chase = new Team<>("Picks McGee");
        Team<FootballPlayer> jason = new Team<>("Club Zilla");
        Team<FootballPlayer> ben = new Team<>("Team Becker");
        Team<FootballPlayer> pete = new Team<>("PathFinder");

        FootballPlayer cmc = new FootballPlayer("Christian McCaffrey");
        chase.addPlayer(cmc);
        FootballPlayer dWat = new FootballPlayer("Deshaun Watson");
        jason.addPlayer(dWat);
        FootballPlayer lamar = new FootballPlayer("Lamar Jackson");
        ben.addPlayer(lamar);
        FootballPlayer zeke = new FootballPlayer("Ezekiel Elliot");
        pete.addPlayer(zeke);

        BaseballPlayer billy = new BaseballPlayer("Billy Baseball");
//        pete.addPlayer(billy);
        Team<BaseballPlayer> bball = new Team<>("Baseball Team");

        winterIsComing.addTeam(chase);
        winterIsComing.addTeam(jason);
        winterIsComing.addTeam(ben);
        winterIsComing.addTeam(pete);
//        winterIsComing.addTeam(bball);

        chase.gameResult(jason, 100, 81);
        ben.gameResult(pete, 76, 81);

        chase.gameResult(ben, 91, 114);
        pete.gameResult(jason, 111, 105);

        chase.gameResult(pete, 132, 119);
        jason.gameResult(ben, 120, 115);

        winterIsComing.showStandings();

        System.out.println("chase id: " + chase.getId());
        System.out.println("pete id: " + pete.getId());
        System.out.println("jason id: " + jason.getId());
        System.out.println("ben id: " + ben.getId());

        System.out.println("chase teamCounter: " + chase.getTeamCounter());
        System.out.println("pete teamCounter: " + pete.getTeamCounter());

        System.out.println("winterIsComing id: " + winterIsComing.getId());
        System.out.println("winterIsComing leagueCounter: " + winterIsComing.getLeagueCounter());

    }
}
