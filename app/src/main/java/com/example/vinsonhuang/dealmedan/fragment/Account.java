package com.example.vinsonhuang.dealmedan.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.vinsonhuang.dealmedan.utilities.Shared;
import com.example.vinsonhuang.dealmedan.view.Login;
import com.example.vinsonhuang.dealmedan.view.R;

/**
 * Created by vinsonhuang on 30/11/2017.
 */

public class Account extends Fragment {
    TextView name, email, nomor;
    Button logout;
    Shared shared;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.account, container, false);
        shared = new Shared(getActivity());
        name = (TextView)rootView.findViewById(R.id.name);
        email = (TextView)rootView.findViewById(R.id.email);
        nomor = (TextView)rootView.findViewById(R.id.nomor);
        logout = (Button)rootView.findViewById(R.id.logout);
        name.setText(shared.getSession(Shared.KEY_NAMA));
        email.setText(shared.getSession(Shared.KEY_EMAIL));
        nomor.setText(shared.getSession(Shared.KEY_PHONE));
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shared.clearSession();
                Intent i = new Intent(getActivity(), Login.class);
                startActivity(i);
                getActivity().finish();
            }
        });
        return rootView;
    }
}
