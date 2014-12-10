package com.pfung.munchkin.components;

/**
 * Created by pfung on 12/9/2014.
 */
public class Character {
    private int CharacterID;
    private int PlayerID;
    private int GameID;
    private String Gender;
    private int Level;
    private boolean HasHeadGear;
    private boolean HasArmor;
    private boolean HasFootGear;
    private boolean RHandUsed;
    private boolean LHandUsed;
    private int Race1;
    private int Race2;
    private int Class1;
    private int Class2;


    public Character(Player player) {
        setPlayerID(player.getPlayerID());
        setGender(player.getGender());
        setLevel(0);
        setClass1(0);
        setClass2(0);
        setRace1(0);
        setRace2(0);
        setHasHeadGear(false);
        setHasArmor(false);
        setHasFootGear(false);
        setRHandUsed(false);
        setLHandUsed(false);
     }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getCharacterID() {
        return CharacterID;
    }

    public void setCharacterID(int characterID) {
        CharacterID = characterID;
    }

    public int getPlayerID() {
        return PlayerID;
    }

    public void setPlayerID(int playerID) {
        PlayerID = playerID;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public int getRace1() {
        return Race1;
    }

    public void setRace1(int race1) {
        Race1 = race1;
    }

    public int getRace2() {
        return Race2;
    }

    public void setRace2(int race2) {
        Race2 = race2;
    }

    public int getClass1() {
        return Class1;
    }

    public void setClass1(int class1) {
        Class1 = class1;
    }

    public int getClass2() {
        return Class2;
    }

    public void setClass2(int class2) {
        Class2 = class2;
    }

    public boolean getHasArmor() {
        return HasArmor;
    }

    public void setHasArmor(boolean hasArmor) {
        HasArmor = hasArmor;
    }

    public boolean getHasFootGear() {
        return HasFootGear;
    }

    public void setHasFootGear(boolean hasFootGear) {
        HasFootGear = hasFootGear;
    }

    public boolean getHasHeadGear(){
        return HasHeadGear;
    }

    public void setHasHeadGear(boolean hasHeadGear) {
        HasHeadGear = hasHeadGear;
    }

    public boolean isLHandUsed() {
        return LHandUsed;
    }

    public void setLHandUsed(boolean lHandUsed) {
        LHandUsed = lHandUsed;
    }

       public boolean isRHandUsed(){
       return RHandUsed;
   }

    public void setRHandUsed(boolean rHandUsed) {
        RHandUsed = rHandUsed;
    }

    public int getGameID() {
        return GameID;
    }

    public void setGameID(int gameID) {
        GameID = gameID;
    }
}
