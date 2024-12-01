package com.example.sports.dto;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private String city;
    private String division;
    private List<Player> players;  

    
    public Team(String teamName, String city, String division) {
        this.teamName = teamName;
        this.city = city;
        this.division = division;
        this.players = new ArrayList<>();  
    }

   
    public void playGame() {
        System.out.println(teamName + " is playing a game.");
    }

    public void hireCoach() {
        System.out.println(teamName + " has hired a new coach.");
    }

    public void addPlayer(Player player) {
        players.add(player); 
    }

    public List<Player> getPlayers() {
        return players;  
    }

   
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
}
