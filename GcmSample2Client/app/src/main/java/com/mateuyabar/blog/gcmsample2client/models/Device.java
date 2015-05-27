package com.mateuyabar.blog.gcmsample2client.models;


import com.mateuyabar.android.pillow.data.models.AbstractIdentificableModel;

/**
 * Stores information about a device GCM registration
 */
public class Device extends AbstractIdentificableModel {
    String registrationId;
    int appVersion;

    public Device(){}

    public Device(String registrationId, int appVersion) {
        this.registrationId = registrationId;
        this.appVersion = appVersion;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public int getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(int appVersion) {
        this.appVersion = appVersion;
    }
}
