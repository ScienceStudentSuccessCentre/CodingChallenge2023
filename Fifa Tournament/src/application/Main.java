package application;

public class Main {

    public static void main(String[] args){

        // The purpose of this program is to generate 16 teams of 4 players from a list of 64 players. Each player
        // has a rating ranging from 0 to 100.
        // The average team rating for each team must fall between 45 and 55.
        // Bonus points are given for achieving average team ratings between 49 and 51.


        Tournament tournament = new Tournament();
        tournament.getPlayers();
        tournament.generateTeams(); // implement this function
        tournament.outputTeams();

    }
}
