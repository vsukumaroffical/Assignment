package com.sports.dto;


public class Player {
    private String playerName;
    private String position;
    private int jerseyNumber;

    
    public Player(String playerName, String position, int jerseyNumber) {
        this.playerName = playerName;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    
    public void playGame() {
        System.out.println(playerName + " is playing in position " + position + " with jersey number " + jerseyNumber + ".");
    }

    public void train() {
        System.out.println(playerName + " is training.");
    }

    
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }
}
