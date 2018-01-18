package com.example.vinsonhuang.dealmedan.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.vinsonhuang.dealmedan.utilities.Shared;

/**
 * Created by User on 11/30/2017.
 */

public class SplashScreen extends AppCompatActivity{

    private Shared shared;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        shared = new Shared(this);
        // disini saya check jika cache hp boolean isloggenin true maka dia masuk ke dashboard kalo g maka dia mau login dul
        if(shared.isLoggedIn()){
            Intent i = new Intent(SplashScreen.this, Dashboard.class);
            startActivity(i);
            finish();
        }else{
            Intent i = new Intent(SplashScreen.this, Login.class);
            startActivity(i);
            finish();
        }

    }
}
