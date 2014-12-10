package com.pfung.munchkin.components;

/**
 * Created by pfung on 12/9/2014.
 */
public class Card {
    private boolean FaceDown;
    private boolean InUse;
    private int CharacterID;
    private int CardID;

     public boolean isInUse() {
        return InUse;
    }

    public void setInUse(boolean inUse) {
        InUse = inUse;
    }

    public boolean isFaceDown() {
        return FaceDown;
    }

    public void setFaceDown(boolean faceDown) {
        FaceDown = faceDown;
    }

    public void setCardID(int cardID) {
        CardID = cardID;
    }

    public int getCardID() {
        return CardID;
    }

    public void beDrawn() {

    }

}
