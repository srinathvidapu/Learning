package com.saae.mvpexamplenew;

import java.util.List;

import retrofit2.Retrofit;

/**
 * Created by Saae on 4/9/2017.
 */

public interface Model {


    public void onGet(OnLoginFinishedListener onLoginFinishedListener);


    interface OnLoginFinishedListener {

        void onFail();

        void onSuccess(List<Post> postList);

        void onSuccess(String data);
    }


}



