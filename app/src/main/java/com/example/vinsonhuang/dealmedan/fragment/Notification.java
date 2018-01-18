package com.example.vinsonhuang.dealmedan.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vinsonhuang.dealmedan.adapter.MyAdapter;
import com.example.vinsonhuang.dealmedan.adapter.NotificationAdapter;
import com.example.vinsonhuang.dealmedan.utilities.DataPresiden;
import com.example.vinsonhuang.dealmedan.view.R;

/**
 * Created by vinsonhuang on 30/11/2017.
 */

public class Notification extends Fragment {
    RecyclerView list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.notiflist, container, false);

        list = (RecyclerView)rootView.findViewById(R.id.list);
        list.setHasFixedSize(true);

        list.setLayoutManager(new LinearLayoutManager(getActivity()));
        NotificationAdapter listPresidentAdapter = new NotificationAdapter(getActivity());
        listPresidentAdapter.setListPresident(DataPresiden.getNotifData());
        list.setAdapter(listPresidentAdapter);
        return rootView;
    }
}
