package com.mateuyabar.blog.gcmsample2client.datasource;

import android.content.Context;

import com.mateuyabar.android.pillow.data.rest.IRestMapping;
import com.mateuyabar.android.pillow.data.singleinstance.ISynchLocalSingleInstanceDataSource;
import com.mateuyabar.android.pillow.data.sync.singleinstance.SynchSingleInstanceDataSource;
import com.mateuyabar.blog.gcmsample2client.models.Device;

/**
 * Device storage operations
 */
public class DeviceDataSource extends SynchSingleInstanceDataSource<Device> {
    public DeviceDataSource(ISynchLocalSingleInstanceDataSource<Device> dbSource, IRestMapping<Device> restMap, Context context) {
        super(Device.class, dbSource, restMap, context);
    }
}
