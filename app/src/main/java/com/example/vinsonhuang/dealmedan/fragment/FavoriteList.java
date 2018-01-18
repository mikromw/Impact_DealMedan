package com.example.vinsonhuang.dealmedan.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.vinsonhuang.dealmedan.adapter.MyAdapter;
import com.example.vinsonhuang.dealmedan.model.President;
import com.example.vinsonhuang.dealmedan.utilities.DataPresiden;
import com.example.vinsonhuang.dealmedan.utilities.Shared;
import com.example.vinsonhuang.dealmedan.view.R;

import java.util.ArrayList;

/**
 * Created by vinsonhuang on 01/12/2017.
 */

public class FavoriteList extends Fragment {
    private RecyclerView rvCategory;
    private ArrayList<President> list;
    RelativeLayout loading,noitem;
    TextView txt;
    Shared shared;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.listdeal, container, false);

        shared = new Shared(getActivity());
        rvCategory = (RecyclerView)rootView.findViewById(R.id.rv_category);

        txt = (TextView)rootView.findViewById(R.id.txt);
        loading = (RelativeLayout)rootView.findViewById(R.id.loading);
        noitem = (RelativeLayout)rootView.findViewById(R.id.noitem);
        rvCategory.setHasFixedSize(true);
        setvisibility(View.GONE,View.VISIBLE,View.GONE);
        if(shared.getFavList().length==0){
            txt.setText("Belum ada favorite");
            setvisibility(View.GONE,View.GONE,View.VISIBLE);
        }else{
            list = new ArrayList<>();


            list.addAll(DataPresiden.getFavData(shared.getFavList()));

            showRecyclerList();

        }

        return rootView;
    }
    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(getActivity()));
        MyAdapter listPresidentAdapter = new MyAdapter(getActivity());
        listPresidentAdapter.setListPresident(list);
        rvCategory.setAdapter(listPresidentAdapter);
        setvisibility(View.VISIBLE,View.GONE,View.GONE);
    }
    private void setvisibility(int list, int load, int no){
        rvCategory.setVisibility(list);
        noitem.setVisibility(no);
        loading.setVisibility(load);
    }
}
