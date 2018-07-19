package com.example.android.musi;

/**
 * Created by Meenakshi on 7/9/2018.
 */

public class Song {
    private String mFirstItem;
    private String mSecondItem;

    public Song(String firstItem, String secondItem) {
        this.mFirstItem = firstItem;
        this.mSecondItem = secondItem;
    }

    public String getFirstItem() {
        return mFirstItem;
    }

    public String getSecondItem() {
        return mSecondItem;
    }

}
