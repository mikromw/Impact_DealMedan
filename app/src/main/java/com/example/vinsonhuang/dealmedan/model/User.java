package com.example.vinsonhuang.dealmedan.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 11/30/2017.
 */

public class User {

    private List<UserData> userData = new ArrayList<UserData>();

    public List<UserData> getUserData() {
        return userData;
    }

    public void setUserData(List<UserData> userData) {
        this.userData = userData;
    }
}
