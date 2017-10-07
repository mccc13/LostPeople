package com.distribuidos.lostpeople;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;


import java.util.logging.LogRecord;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if ( savedInstanceState==null){
                   Intent sd=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(sd);
                    SplashScreen.this.finish();
                }
            }
        }, 2000);

    }
}
