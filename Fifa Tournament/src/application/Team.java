package application;

import java.util.ArrayList;

public class Team{

    public ArrayList<Player> players;
    private double teamRating;
    public Team(){
        players = new ArrayList<>();
        teamRating = 0;
    }

    public void addPlayer(Player p){
        players.add(p);
        teamRating += p.getRating();
    }

    public long getRating(){
        return Math.round(teamRating / players.size());
    }

}
