package udemy;

interface Player{

    String name();
}
record BasketballPlayer(String name, String position) implements Player{}
record FootballPlayer(String name, String position) implements Player{}


public class Mama {

    public static void scoreResult(Team Phillies, int score,
                                   Team Astros, int score2) 
    {    
        String message=Phillies.setScore(score, score2);
        Astros.setScore(score2, score);
        System.out.printf("%s %s %s %n", Phillies, message, Astros);

    }
    
    public static void main(String[] args) {

        var aff = new place( "City", "Phedelfia", "US");
        var affo = new place( "Urban", "Atanta", "US");
        var affot = new place( "City", "Paris", "EU");

        Team<BasketballPlayer, place> Phillies = new Team<>("Philedelfia",affo);
        Team<BasketballPlayer, place> Astros = new Team<>("Astros",affot);

        var player = new BasketballPlayer("Suarez", "a1");
        var player2 = new BasketballPlayer("Messi","a2");

        scoreResult(Phillies, 3, Astros, 5);
        scoreResult(Phillies, 5, Astros, 5);
        scoreResult(Phillies, 3, Astros, 1);

        Team<FootballPlayer,place> asf = new Team<>("Beşiktas", aff);
        var tex = new FootballPlayer("Alex", "Quorterback");
        asf.addTeamMember(tex);
        asf.listTeamMembers();
        
        Phillies.addTeamMember(player);
        Phillies.addTeamMember(player2);
        Phillies.listTeamMembers();
        

        

    }
}
