package com.example.vinsonhuang.dealmedan.view;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vinsonhuang.dealmedan.fragment.DetailFragment;
import com.example.vinsonhuang.dealmedan.model.President;
import com.example.vinsonhuang.dealmedan.utilities.DataPresiden;
import com.example.vinsonhuang.dealmedan.utilities.Shared;
import com.example.vinsonhuang.dealmedan.utilities.Utility;

import java.util.ArrayList;

import xyz.santeri.wvp.WrappingFragmentStatePagerAdapter;
import xyz.santeri.wvp.WrappingViewPager;

/**
 * Created by User on 11/30/2017.
 */

public class DetailDeal extends AppCompatActivity{
    Toolbar toolbar;
    ImageView gbr,maps;
    TextView name, harga;
    Menu menu;
    Shared shared;
    String index;
    TabLayout tabLayout;
    WrappingViewPager pager;
    boolean save =false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        shared = new Shared(this);
        NestedScrollView scrollView = (NestedScrollView) findViewById (R.id.nest_scrollview);
        scrollView.setFillViewport (true);
        pager = (WrappingViewPager) findViewById(R.id.pager);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        name = (TextView)findViewById(R.id.tv_item_name);
        harga = (TextView)findViewById(R.id.tv_item_harga);
        gbr = (ImageView) findViewById(R.id.tv_item_gambar);
        maps = (ImageView) findViewById(R.id.maps);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        Intent i = getIntent();
         index = i.getStringExtra("index");
        Resources res = getResources();
        President data = DataPresiden.getListDataDetail(index);
        getSupportActionBar().setTitle(data.getName());
        name.setText(data.getName());
        harga.setText("Rp. "+Utility.getInstance().convertPrice(data.getRemarks()));
        int resID = res.getIdentifier(data.getPhoto(), "drawable", getPackageName());
        Drawable drawable = res.getDrawable(resID);
        Log.d("asd","map_"+String.valueOf(index));
        int resMapsId = res.getIdentifier("map_"+String.valueOf(Integer.parseInt(index)+1), "drawable", getPackageName());
        Drawable mapsDrawable = res.getDrawable(resMapsId);


        String promo=DataPresiden.getPromodata().get(Integer.parseInt(index));
        String high=DataPresiden.getHighdata().get(Integer.parseInt(index));;
        String condi=DataPresiden.getConditiondata().get(Integer.parseInt(index));;

        DesignDemoPagerAdapter adapter = new DesignDemoPagerAdapter(getSupportFragmentManager(),promo,high,condi);
        pager.setAdapter(adapter);
        tabLayout.setupWithViewPager(pager);
        pager.setOffscreenPageLimit(3);
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        gbr.setImageDrawable(drawable);
        maps.setImageDrawable(mapsDrawable);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //this add items to the actionbar
        getMenuInflater().inflate(R.menu.menu_save,menu);
        this.menu = menu;

        return true;
    }
    @Override
    public boolean onPrepareOptionsMenu(Menu menu){

        if(shared.getFavDetail(String.valueOf(index))){
            save=true;
            menu.findItem(R.id.fav).setIcon(getResources().getDrawable(R.mipmap.heart_red));
        }
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.fav){
            if(save){
                menu.findItem(R.id.fav).setIcon(getResources().getDrawable(R.mipmap.heart_gray));
                shared.insertFavorite(index,"delete");
                save =false;
            }else{
                menu.findItem(R.id.fav).setIcon(getResources().getDrawable(R.mipmap.heart_red));
                shared.insertFavorite(index,"insert");
                save =true;
            }


        }
        return super.onOptionsItemSelected(item);
    }


    private class DesignDemoPagerAdapter extends WrappingFragmentStatePagerAdapter {
        private final String[] Titles = {"Promo","Highlights","Condition"};
        private String promo,
                high,condi;
        public DesignDemoPagerAdapter(FragmentManager fm, String promo, String high, String condi) {
            super(fm);

            this.promo = promo;
            this.high = high;
            this.condi = condi;


        }

        @Override
        public Fragment getItem(int position) {

            if(position == 0)
            {
                DetailFragment frg = new DetailFragment();
                Bundle bundle = new Bundle();
                bundle.putString("txt", promo);
                frg.setArguments(bundle);
                return frg;
            }

            else  if(position == 1)
            {
                DetailFragment frg = new DetailFragment();
                Bundle bundle = new Bundle();
                bundle.putString("txt", high);
                frg.setArguments(bundle);
                return frg;
            }
            else
            {
                DetailFragment frg = new DetailFragment();
                Bundle bundle = new Bundle();
                bundle.putString("txt", condi);
                frg.setArguments(bundle);
                return frg;
            }


        }

        @Override
        public CharSequence getPageTitle(int position) {
            return Titles[position];
        }


        @Override
        public int getCount() {
            return 3;
        }


    }
}
