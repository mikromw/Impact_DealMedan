package com.example.vinsonhuang.dealmedan.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 11/30/2017.
 */

public class Favorite {
    private List<FavoriteData> favData = new ArrayList<FavoriteData>();

    public List<FavoriteData> getFavData() {
        return favData;
    }

    public void setFavData(List<FavoriteData> favData) {
        this.favData = favData;
    }
}
