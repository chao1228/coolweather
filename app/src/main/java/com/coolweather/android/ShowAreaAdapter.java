package com.coolweather.android;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.coolweather.android.gson.Weather;

import java.util.List;

/**
 * Created by Administrator on 2018/8/2.
 */

public class ShowAreaAdapter extends RecyclerView.Adapter<ShowAreaAdapter.ViewHolder>{

    private List<Weather> mWeatherList;

    public ShowAreaAdapter (List<String> weatherList){
        mWeatherList=weatherList;
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView cityName;
        public ViewHolder(View view){
            super(view);
            cityName=(TextView)view.findViewById(R.id.city_name);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.wether_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Weather weather=mWeatherList.get(position);
        holder.cityName.setText(weather.basic.cityName);

    }

    @Override
    public int getItemCount() {
        return mWeatherList.size();
    }


}
