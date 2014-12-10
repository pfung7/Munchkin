package com.pfung.munchkin.components;

import com.pfung.munchkin.components.Card;

/**
 * Created by pfung on 12/9/2014.
 */
public class Deck {
    private int NumCards;

    public int getNumCards() {
        return NumCards;
    }

    public Card getCard()
    {
        Card aCard;
        aCard = new Card();
        return aCard;
    }
}
