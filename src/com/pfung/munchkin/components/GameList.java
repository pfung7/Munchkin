package com.pfung.munchkin.components;

import java.util.*;

/**
 * Created by pfung on 12/9/2014.
 */
public class GameList {
    private int NumGame;
    private List<String> ListofGames;

    public int getNumGame() {
        return NumGame;
    }

    public GameList(int numGame) {
        NumGame = numGame;
        ListofGames = new LinkedList<String>();
        for (int i = 0; i<NumGame; i++){
            ListofGames.add("game" + i);
        }
    }

    public void PrintGameList(){
        System.out.println("NumGame: " + NumGame );
        System.out.println("Games: " + ListofGames );

    }
}
