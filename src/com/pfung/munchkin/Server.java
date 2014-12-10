package com.pfung.munchkin;

import com.pfung.munchkin.components.GameList;

/**
 * Created by pfung on 12/9/2014.
 */
public class Server {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Munchkin!");
        GameList gameList;
        gameList = new GameList(3);
        gameList.PrintGameList();
    }
}
