package com.saae.mvpexamplenew;

import com.saae.mvpexamplenew.model.Post;

import java.util.List;

/**
 * Created by Saae on 4/9/2017.
 */

public interface MainView   {

    public void setData(String data);
    public void setList(List<Post> postList);
}
