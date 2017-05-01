package com.saae.mvpexamplenew;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Restapi {

    @GET("/posts/1")
    Call<Post> getPosts();

    @GET("/posts")
    Call<List<Post>> getListPosts();




}