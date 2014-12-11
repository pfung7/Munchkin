package com.pfung.munchkin.components;

import java.util.*;

/**
 * Created by pfung on 12/9/2014.
 */
public class RoomList {
    private int NumRoom;
    private List<String> ListofGames;

    public int getNumRoom() {
        return NumRoom;
    }

    public RoomList(int numRoom) {
        NumRoom = numRoom;
        ListofGames = new LinkedList<String>();
        for (int i = 0; i<NumRoom; i++){
            ListofGames.add("Game room " + i);
        }
    }

    public void PrintGameList(){
        System.out.println("Num of rooms: " + NumRoom );
        System.out.println("Games: " + ListofGames );

    }
}
