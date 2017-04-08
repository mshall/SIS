package com.sis.network;

import android.app.Application;

import com.sis.network.data.component.DaggerNetComponent;
import com.sis.network.data.component.NetComponent;
import com.sis.network.data.module.AppModule;
import com.sis.network.data.module.NetModule;

/**
 * Created by Mohamed S. El-Shall on 4/8/2017.
 */

public class App extends Application {
    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://experttk.com/student_app_query/"))
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}