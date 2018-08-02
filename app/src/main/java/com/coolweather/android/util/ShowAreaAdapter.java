package com.coolweather.android.util;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.coolweather.android.ShowArea;

import java.util.List;

/**
 * Created by liuchao on 18-8-2.
 */

public class ShowAreaAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<ShowArea> showAreaList;

    class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(View view){
            super(view);
        }
    }


    public ShowAreaAdapter(List<ShowArea> showAreaList){
        this.showAreaList=showAreaList;
    }



    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }



}
