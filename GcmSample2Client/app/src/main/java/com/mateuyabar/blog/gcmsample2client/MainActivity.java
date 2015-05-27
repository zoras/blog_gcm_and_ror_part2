package com.mateuyabar.blog.gcmsample2client;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    /**
     * Substitute you own sender ID here. This is the project number you got
     * from the API Console, as described in "Getting Started."
     */
    String SENDER_ID = UPDATE_WITH.SENDER_ID;

    GCMRegistration gcmRegistration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gcmRegistration = new GCMRegistration(this, SENDER_ID);
        gcmRegistration.register();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // You need to do the Play Services APK check here too.
        gcmRegistration.checkPlayServices(this);
    }
}
