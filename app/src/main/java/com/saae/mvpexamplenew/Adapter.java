package com.saae.mvpexamplenew;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.saae.mvpexamplenew.model.Post;

import java.util.List;

/**
 * Created by Srinath on 10/04/17.
 */

public class Adapter extends BaseAdapter {



    public List<Post> posts;
    public Context context;


    public Adapter(List<Post> posts,Context context)
    {

        this.context=context;
        this.posts=posts;
    }


    @Override
    public int getCount() {
        return posts.size();
    }

    @Override
    public Object getItem(int i) {
        return posts.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        View v= LayoutInflater.from(context).inflate(R.layout.simple_list_item_1,null);


        TextView tv= (TextView) v.findViewById(R.id.tv);


        tv.setText(posts.get(i).getBody());

        return v;
    }
}
