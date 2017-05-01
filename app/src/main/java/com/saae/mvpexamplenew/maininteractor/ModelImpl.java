package com.saae.mvpexamplenew.maininteractor;

import com.saae.mvpexamplenew.Model;
import com.saae.mvpexamplenew.MyApplication;
import com.saae.mvpexamplenew.model.Post;
import com.saae.mvpexamplenew.Restapi;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by Saae on 4/9/2017.
 */

public class ModelImpl implements Model, Callback<List<Post>> {


    @Inject
    Retrofit retrofit;

    OnLoginFinishedListener onLoginFinishedListener;


    public ModelImpl(MyApplication myApplication) {

        myApplication.getNetComponent().inject(this);
    }


    @Override
    public void onGet(final OnLoginFinishedListener onLoginFinishedListener) {

        Call<Post> posts = retrofit.create(Restapi.class).getPosts();


        Call<List<Post>> po = retrofit.create(Restapi.class).getListPosts();

        po.enqueue(this);

        this.onLoginFinishedListener = onLoginFinishedListener;
        //   posts.enqueue(this);

        //Enque the call
//        posts.enqueue(new Callback<Post>() {
//            @Override
//            public void onResponse(Call<Post> call, Response<Post> response) {
//                //Set the response to the textview
//
//
//
//            }
//
//            @Override
//            public void onFailure(Call<Post> call, Throwable t) {
//
//
//
//
//
//            }
//        });


    }

//    @Override
//    public void onResponse(Call<Post> call, Response<Post> response) {
//
//
//        try {
//            Thread.sleep(50);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        Log.e("data",response.body().getTitle());
//        if(onLoginFinishedListener!=null)
//            onLoginFinishedListener.onSuccess(response.body().getTitle());
//    }
//
//    @Override
//    public void onFailure(Call<Post> call, Throwable t) {
//
//
//        onLoginFinishedListener.onFail();
//
//    }


    @Override
    public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {


//        try {
//            Thread.sleep(50);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        onLoginFinishedListener.onSuccess(response.body());
    }

    @Override
    public void onFailure(Call<List<Post>> call, Throwable t) {


        onLoginFinishedListener.onFail();

    }
}
