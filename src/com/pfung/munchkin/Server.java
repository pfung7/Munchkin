package com.pfung.munchkin;

import com.pfung.munchkin.components.RoomList;

/**
 * Created by pfung on 12/9/2014.
 */
public class Server {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Munchkin!");
        RoomList gameList;
        gameList = new RoomList(3);
        gameList.PrintGameList();
    }
}
