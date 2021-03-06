package com.saae.mvpexamplenew;

import com.saae.mvpexamplenew.maininteractor.ModelImpl;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {

    void inject(MainActivity activity);

    void inject(ModelImpl model);
}