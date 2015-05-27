package com.mateuyabar.blog.gcmsample2client.pillow;


import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.reflect.TypeToken;
import com.mateuyabar.android.pillow.PillowConfigXml;
import com.mateuyabar.android.pillow.conf.DefaultModelConfiguration;
import com.mateuyabar.android.pillow.conf.IModelConfigurations;
import com.mateuyabar.android.pillow.conf.ModelConfiguration;
import com.mateuyabar.android.pillow.data.singleinstance.SingleInstanceKeyValueDataSource;
import com.mateuyabar.blog.gcmsample2client.datasource.DeviceDataSource;
import com.mateuyabar.blog.gcmsample2client.models.Device;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PillowConfiguration implements IModelConfigurations {
    public static final String PREFERENCES_KEY = "PillowModelsPreferencesKey";
    @Override
    public List<ModelConfiguration<?>> getModelConfigurators(Context context, PillowConfigXml config) {
        String url = config.getUrl();
        List<ModelConfiguration<?>> configurations = new ArrayList<>();

        SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_KEY, Context.MODE_PRIVATE);
        //Device model configuration
        DefaultModelConfiguration<Device> deviceConfiguration = new DefaultModelConfiguration<Device>(context, Device.class, new TypeToken<Collection<Device>>(){}, url);
        SingleInstanceKeyValueDataSource<Device> deviceLocalDataSource = new SingleInstanceKeyValueDataSource<Device>(Device.class, preferences);
        deviceConfiguration.setDataSource(new DeviceDataSource(deviceLocalDataSource, deviceConfiguration.getRestMapping(), context));
        configurations.add(deviceConfiguration);

        return configurations;
    }
}
