package ru.reksoft.lesson5;

import java.util.ArrayList;

public class Team {
    String teamName;
    Trainer trainer = null;
    ArrayList<Player> players = new ArrayList<Player>();

    public Team(String teamName, Trainer trainer, ArrayList<Player> players) {
        this.teamName = teamName;
        this.trainer = trainer;
        this.players = players;
    }


    public void addPlayer(Player newPlayer) throws Exception {
        if(players.size() <= 20) {
            players.add(newPlayer);
        }
        else {
            throw new Exception("Go to Hell!!!");
        }
    }

    public void removePlayer(Player player) throws Exception {
        if(players.size() > 11) {
            players.remove(player);
        }
        else {
            throw new Exception("Co to Hell!");
        }
    }
}
