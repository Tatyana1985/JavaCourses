package ru.reksoft.lesson5;

import java.util.ArrayList;

public class lesson5 {
    public static void main(String[] args) throws Exception {
        Trainer trainer = new Trainer("Trainer","Treinerovich","Trainerov", 35);
        PlayerType attack = PlayerType.ATTACK;

        Player player = new Player("Ivan","Ivanovich","Ivanov",
                21, true, 15, attack);

        ArrayList<Player> players = new ArrayList<Player>();
        Team team = new Team("Team",trainer, players);
        team.addPlayer(player);
    }
}
