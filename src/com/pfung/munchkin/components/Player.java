package com.pfung.munchkin.components;

/**
 * Created by pfung on 12/3/2014.
 */
public class Player {
    private int PlayerID;
    private String PlayerName;
    private int Age;
    private String Gender;

    public int getPlayerID() {
        return PlayerID;
    }

    public void setPlayerID(int playerID) {
        PlayerID = playerID;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

    public int getAge() {
        return Age;
    }

    public String getGender() {
        return Gender;
    }

    public String getPlayerName() {
        return PlayerName;
    }
}
