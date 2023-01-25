package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Tournament {

    public ArrayList<Team> teams;
    public ArrayList<Player> players;


    public Tournament(){
        teams = new ArrayList<>();
        players = new ArrayList<>();
    }


    //Given: 64 players each with different ratings ranging from 0-100. The players are stored in the array called 'players' in a random order.
    //The player's ratings are completely random and do not reflect anything. 
    //You are also given an arraylist, called 'teams' which is empty at the moment. 

    public void generateTeams(){
        //TO-DO: generate 16 teams of 4 players so that the teams are fairly balanced. 
        //Team ratings are calculated by adding the individual rating of each player on the team
        //Team ratings should be between 45 and 55 inclusive. Ideally between 49-51.

   }


    public void getPlayers(){
        File f = new File("src/results.txt");

        String []info;
        String line;
        try{
            //Read from a comma-delimited text file if it is not null
            if (f != null) {
                BufferedReader br = new BufferedReader(new BufferedReader
                        (new FileReader(f)));

                line = br.readLine();
                while (line != null) {
                    info = line.split(", ");

                    // Set the player's data to the data read from the file
                    Player p = new Player(info[0], Integer.parseInt(info[1]));

                    // Add the player to the tournament list
                    players.add(p);

                    // Read the next line
                    line = br.readLine();
                }
                br.close();
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public String outputTeams(){
        StringBuilder sb = new StringBuilder();
        int numPlayers = 4;

        StringBuilder[] grids = new StringBuilder[4];
        for (int i = 0; i < grids.length; i++) { // initialize string builders for each grid
            grids[i] = new StringBuilder();
        }

        for (int i = 0; i < numPlayers; i++){
            for (int j = 0; j < teams.size(); j++){
                int index = j / numPlayers;

                grids[index].append(String.format("%-20s%5s | ",
                        teams.get(j).players.get(i).getName(),
                        teams.get(j).players.get(i).getRating()));

                if ((j+1) % 4 == 0 || j == teams.size()-1){
                    grids[index].append("\n");
                    if (i == 3){
                        grids[index].append("\n");
                    }
                }
            }
        }
                File f = new File("src/results.txt");

        String []info;
        String line;
        try{
            //Read from a comma-delimited text file if it is not null
            if (f != null) {
                BufferedReader br = new BufferedReader(new BufferedReader
                        (new FileReader(f)));

                line = br.readLine();
                while (line != null) {
                    info = line.split(", ");

                    // Set the player's data to the data read from the file
                    Player p = new Player(info[0], Integer.parseInt(info[1]));

                    // Add the player to the tournament list
                    players.add(p);

                    // Read the next line
                    line = br.readLine();
                }
                br.close();
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }

        //ArrayList<String> soccerTeams = new ArrayList<>();
        String[] soccerTeams = new String[16];
        try {
            FileReader fr = new FileReader("src/soccerTeams.txt");
            BufferedReader br = new BufferedReader(fr);

            String lin;
            int i = 0;
            while ((lin = br.readLine()) != null) {
                soccerTeams[i] = lin;
                i++;
            }

            br.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        for (int i = 0; i < teams.size(); i++) { // add team rating
            int index = i / 4;
            grids[index].append(String.format("%-20s%5s | ",
                    soccerTeams[i], teams.get(i).getRating()));
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < numPlayers;i++){
            System.out.println(grids[i].toString());
            System.out.println("---------------------------------------------------------------------------------------------------------------");
        }

        return sb.toString();
    }
}
