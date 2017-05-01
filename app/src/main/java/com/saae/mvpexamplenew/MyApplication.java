package com.saae.mvpexamplenew;

import android.app.Application;

/**
 * Created by Saae on 4/9/2017.
 */

public class MyApplication extends Application {


    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://jsonplaceholder.typicode.com"))
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}
