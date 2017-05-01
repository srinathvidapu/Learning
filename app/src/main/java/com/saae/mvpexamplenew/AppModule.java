package com.saae.mvpexamplenew;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {


    MyApplication mApplication;

    public AppModule(MyApplication mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @Singleton
    MyApplication provideApplication() {
        return mApplication;
    }
}