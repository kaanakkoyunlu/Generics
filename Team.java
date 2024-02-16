package udemy;

import java.util.ArrayList;
import java.util.List;

record place(String name, String type, String code) {

    public String toString() {

        return name + "(" + type + " in " + code + ")";
    }
}

public class Team<T extends Player, S> {

    private String teamName;
    private List<T> list = new ArrayList<>();
    private int wins=0;
    private int losses=0;
    private int ties=0;
    private S place;

    public Team(String teamName) {

        this.teamName=teamName;
    }
    public Team(String teamName, S place) {

        this.teamName=teamName;
        this.place=place;

    }

    public void addTeamMember(T tex) {

        if(!list.contains(tex))
        {
            list.add(tex);
        }
    }
    public void listTeamMembers() {

        System.out.print(teamName + " Roster: ");
        System.out.println(place==null ? "" : "Place: " + place);
        for(T i:list)
        {
            System.out.println(i.name());
        }
    }
    public int ranking() {

        return losses*2 + ties + 1;
    }
    public String setScore(int ourScore, int theirScore) {

        String message = "lost to";
        if(ourScore>theirScore)
        {
            wins++;
            message = "beat";
        }
        else if(ourScore==theirScore)
        {
            ties++;
            message="tied";
        }
        else
        {
            losses++;
        }
        return message;
    }
    public String toString() {

        return teamName + " (Ranked " + ranking() + ")";
    }

}
