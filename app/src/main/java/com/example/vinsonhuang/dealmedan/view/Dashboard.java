package com.example.vinsonhuang.dealmedan.view;

/**
 * Created by User on 11/30/2017.
 */

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.vinsonhuang.dealmedan.fragment.Account;
import com.example.vinsonhuang.dealmedan.fragment.DealMedan;
import com.example.vinsonhuang.dealmedan.fragment.FavoriteList;
import com.example.vinsonhuang.dealmedan.fragment.Notification;


public class Dashboard extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.navigation);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment = null;
                        switch (item.getItemId()) {
                            case R.id.action_item1:
                                toolbar.setTitle(item.getTitle());
                                selectedFragment = new DealMedan();
                                break;
                            case R.id.action_item2:
                                toolbar.setTitle(item.getTitle());
                                selectedFragment = new FavoriteList();
                                break;
                            case R.id.action_item3:
                                toolbar.setTitle(item.getTitle());
                                selectedFragment = new Notification();
                                break;
                            case R.id.action_item4:
                                toolbar.setTitle(item.getTitle());
                                selectedFragment = new Account();
                                break;
                        }
                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_layout, selectedFragment);
                        transaction.commit();
                        return true;
                    }
                });

        //Manually displaying the first fragment - one time only
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, new DealMedan());
        transaction.commit();

        //Used to select an item programmatically
        //bottomNavigationView.getMenu().getItem(2).setChecked(true);
    }
}