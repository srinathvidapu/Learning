package com.saae.mvpexamplenew;

import com.saae.mvpexamplenew.model.Post;

import java.util.List;

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



