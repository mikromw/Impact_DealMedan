package com.example.vinsonhuang.dealmedan.adapter;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.vinsonhuang.dealmedan.model.President;
import com.example.vinsonhuang.dealmedan.utilities.Utility;
import com.example.vinsonhuang.dealmedan.view.DetailDeal;
import com.example.vinsonhuang.dealmedan.view.R;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.CategoryViewHolder> {
    private int myPosition;
    private Context context;
    private ArrayList<President>listPresident;

    public ArrayList<President> getListPresident() {
        return listPresident;
    }
    public void setListPresident(ArrayList<President> listPresident) { this.listPresident = listPresident; }
    public MyAdapter(Context context) {
        this.context = context;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_wor_president, parent, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, final int position) {
        this.myPosition = position;
        holder.tvName.setText(getListPresident().get(position).getName());
        holder.tvRemarks.setText("Rp. "+ Utility.getInstance().convertPrice(getListPresident().get(position).getRemarks()));
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
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;
        LinearLayout myLl;


        public CategoryViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvRemarks = (TextView)itemView.findViewById(R.id.tv_item_harga);
            imgPhoto = (ImageView)itemView.findViewById(R.id.tv_item_gambar);
            myLl = (LinearLayout)itemView.findViewById(R.id.myItem);



        }
    }
}
