package com.company;

import java.util.ArrayList;
import java.util.List;

public class Club {
    private User user;
    private String clubName;
    private List<Player> players;

    public Club(User user, String clubName, List<Player> players) {
        this.user = user;
        this.clubName = clubName;
        this.players = players;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player) {
        for(Player el : players) {
            if(player.getName().equals(el.getName())) {
                System.out.println("Player already exist!");
                return;
            }
        }
        players.add(player);
        System.out.println("Player successfully added!");
    }

    public void removePlayer(String name) {
        for(Player el : players) {
            if(el.getName().equals(name)) {
                players.remove(el);
                System.out.println("Player successfully removed!");
                return;
            }
        }
        System.out.println("Player not found!");
    }

    @Override
    public String toString() {
        return clubName + " (" + user.getLevel() + ')';
    }
}
