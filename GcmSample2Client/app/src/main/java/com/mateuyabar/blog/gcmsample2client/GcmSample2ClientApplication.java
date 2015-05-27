package com.mateuyabar.blog.gcmsample2client;

import android.app.Application;

import com.mateuyabar.android.pillow.Pillow;

/**
 * Created by mateuyabar on 15/05/15.
 */
public class GcmSample2ClientApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Pillow.setConfigurationFile(R.xml.android_pillow);
    }
}
