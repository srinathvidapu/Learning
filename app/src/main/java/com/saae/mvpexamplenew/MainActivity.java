package com.saae.mvpexamplenew;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ListViewCompat;
import android.widget.TextView;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainView {


    TextView textView;


    @Inject
    MainPresenter mainPresenter;

    ListViewCompat listViewCompat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         ((MyApplication) getApplication()).getNetComponent().inject(this);

        listViewCompat= (ListViewCompat) findViewById(R.id.lv);



        mainPresenter.retrive(this);

        //Create textview and findViewByID
        textView = (TextView) findViewById(R.id.tv1);
        //Create a retrofit call object


    }

    @Override
    public void setData(String data) {

        textView.setText(data);

    }


    @Override
    public void setList(List<Post> postList) {

        listViewCompat.setAdapter(new Adapter(postList,this));

    }
}