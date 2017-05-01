package com.saae.mvpexamplenew;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Saae on 4/9/2017.
 */

public class MainPresenterImpl implements MainPresenter,Model.OnLoginFinishedListener {



    MainView mainView;

    Model model;



   // Model model;



    MainPresenterImpl(MyApplication myApplication)
    {

       // this.mainView=mainView;

        model=new ModelImpl(myApplication);

      //  model=new ModelImpl()
    }



    @Override
    public void retrive(MainView mainView) {

        this.mainView=mainView;
       model.onGet(this);

    }

    @Override
    public void onFail() {

    }

    @Override
    public void onSuccess(List<Post> postList) {

        mainView.setList(postList);
    }

    @Override
    public void onSuccess(String data) {

        mainView.setData(data);

    }

//    @Override
//    public void onFail() {
//
//    }
//
//    @Override
//    public void onSuccess(String data) {
//
//        mainView.setData(data);
//
//    }


//    @Override
//    public void load() {
//
//       // mainView.setData(post.getTitle());
//
//
//    }


}
