package com.example.vinsonhuang.dealmedan.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.vinsonhuang.dealmedan.model.NotificationData;
import com.example.vinsonhuang.dealmedan.model.President;
import com.example.vinsonhuang.dealmedan.utilities.Utility;
import com.example.vinsonhuang.dealmedan.view.DetailDeal;
import com.example.vinsonhuang.dealmedan.view.R;

import java.util.ArrayList;

/**
 * Created by Ericnataa on 30/11/2017.
 */

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.CategoryViewHolder> {
    private int myPosition;
    private Context context;
    private ArrayList<NotificationData> listPresident;

    public ArrayList<NotificationData> getListPresident() {
        return listPresident;
    }
    public void setListPresident(ArrayList<NotificationData> listPresident) { this.listPresident = listPresident; }
    public NotificationAdapter(Context context) {
        this.context = context;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.notifitem, parent, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(NotificationAdapter.CategoryViewHolder holder, final int position) {
        this.myPosition = position;
        holder.name.setText(getListPresident().get(position).getName());
        holder.desk.setText(getListPresident().get(position).getDesk());
        holder.tgl.setText(getListPresident().get(position).getTgl());
        Resources res = context.getResources();
        int resID = res.getIdentifier(getListPresident().get(position).getPhoto(), "drawable", context.getPackageName());
        Drawable drawable = res.getDrawable(resID);

        holder.imgPhoto.setImageDrawable(drawable);
        holder.myLl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent i = new Intent(context, DetailDeal.class);
                i.putExtra("index", getListPresident().get(position).getId());
                context.startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return getListPresident().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView desk;
        TextView tgl;
        ImageView imgPhoto;
        LinearLayout myLl;


        public CategoryViewHolder(View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.name);
            desk = (TextView)itemView.findViewById(R.id.desk);
            tgl = (TextView)itemView.findViewById(R.id.tgl);
            imgPhoto = (ImageView)itemView.findViewById(R.id.gbr);
            myLl = (LinearLayout)itemView.findViewById(R.id.myItem);



        }
    }
}

