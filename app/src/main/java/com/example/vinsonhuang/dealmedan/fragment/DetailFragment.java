package com.example.vinsonhuang.dealmedan.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vinsonhuang.dealmedan.view.R;

/**
 * Created by User on 12/2/2017.
 */

public class DetailFragment extends Fragment {
    TextView text;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.detail_txt, container, false);
        text = (TextView)rootView.findViewById(R.id.text);

            Bundle a  = getArguments();
            String txt = a.getString("txt");
        Log.d("txt",txt);
        text.setText(txt);


    return rootView;
    }
    }
