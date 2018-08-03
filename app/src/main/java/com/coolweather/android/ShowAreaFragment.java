package com.coolweather.android;

import android.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.coolweather.android.db.Province;
import com.coolweather.android.gson.Weather;
import com.coolweather.android.util.Utility;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.litepal.crud.DataSupport;

import java.util.List;

/**
 * Created by liuchao on 18-8-2.
 */

public class ShowAreaFragment extends Fragment {

    private TextView cityName;

    private List<String> weatherList;

    private RecyclerView recyclerView;

    private Button chooseAreaButton;

    private ShowAreaAdapter showAreaAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.show_area,container,false);
        cityName = (TextView)view.findViewById(R.id.city_name);

        RecyclerView recyclerView=(RecyclerView)view.findViewById(R.id.recycler_view);
        LinearLayoutManager manager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(manager);
        showAreaAdapter = new ShowAreaAdapter(weatherList);
        recyclerView.setAdapter(showAreaAdapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        queryWeathers();
        super.onActivityCreated(savedInstanceState);
    }

    /*
    *查询多个城市天气
     */
    private void queryWeathers(){
        chooseAreaButton.setVisibility(View.GONE);
        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(getActivity());
        String weatherString=prefs.getString("selectedCityNameList",null);
        if(weatherString != null){
            Gson gson = new Gson();
            weatherList= gson.fromJson(weatherString,new TypeToken<List<String>>(){}.getType());
            if (weatherList.size()>0){
                showAreaAdapter.notifyDataSetChanged();
                //recyclerView.setSelectio
            }
        }

    }
}
