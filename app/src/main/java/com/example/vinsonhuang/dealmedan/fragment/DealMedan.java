package com.example.vinsonhuang.dealmedan.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.SearchView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.vinsonhuang.dealmedan.view.Dashboard;
import com.example.vinsonhuang.dealmedan.view.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 1/9/2018.
 */

public class DealMedan extends Fragment {
    CharSequence[] Titles;
    ViewPager viewPager;
    static ListDeal listDeal;
    static VoucherMakanan voucherMakanan;
    static TopProduct topProduct;
    int lastposition=0;
     SearchView searchView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dealmedan_tab, container, false);
        setHasOptionsMenu(true);
        List<String> listItems = new ArrayList<String>();
        listItems.add("All Deals");
        listItems.add("Voucher Makanan");
        listItems.add("Top Product");
        Titles = listItems.toArray(new CharSequence[listItems.size()]);
        DesignDemoPagerAdapter adapter = new DesignDemoPagerAdapter(getChildFragmentManager(), Titles);
        viewPager = (ViewPager)view.findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(Titles.length);
        TabLayout tabLayout = (TabLayout)view.findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
        float myTabLayoutSize = 360;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width = displayMetrics.widthPixels;
        if (width >= myTabLayoutSize ){
            tabLayout.setTabMode(TabLayout.MODE_FIXED);
        } else {
            tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        }
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                lastposition = tab.getPosition();


            }


            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        return view;
    }



    static class DesignDemoPagerAdapter extends FragmentStatePagerAdapter {
        CharSequence Titles[];
        public DesignDemoPagerAdapter(FragmentManager fm, CharSequence mTitles[]) {
            super(fm);
            this.Titles = mTitles;

        }

        @Override
        public Fragment getItem(int position) {

            if(position == 0)
            {

                 listDeal = new ListDeal();
                return listDeal;
            }
            else if(position == 1){
                voucherMakanan= new VoucherMakanan();
                return voucherMakanan;
            }
            else
            {
                 topProduct = new TopProduct();
                return topProduct;
            }
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return Titles[position];
        }


        @Override
        public int getCount() {
            return Titles.length;
        }
    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        // TODO Add your menu entries here
        super.onCreateOptionsMenu(menu, inflater);
        menu.clear();
        inflater.inflate(R.menu.search, menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIdStatement
        if (id == R.id.action_search) {


             searchView = new SearchView(((Dashboard) getActivity()).getSupportActionBar().getThemedContext());
            searchView.setQueryHint("Cari berdasarkan title");
            MenuItemCompat.setShowAsAction(item, MenuItemCompat.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW | MenuItemCompat.SHOW_AS_ACTION_IF_ROOM);
            MenuItemCompat.setActionView(item, searchView);
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    // buat disini
                    if(lastposition==0){
                        listDeal.QueryTextSubmit(query);
                    }else if(lastposition==1){
                        voucherMakanan.QueryTextSubmit(query);
                    }else{
                        topProduct.QueryTextSubmit(query);
                    }


                    return false;
                }


                @Override
                public boolean onQueryTextChange(String newText) {
                    if(lastposition==0){
                        listDeal.QueryTextChange(newText);
                    }else if(lastposition==1){
                        voucherMakanan.QueryTextChange(newText);
                    }else{
                        topProduct.QueryTextChange(newText);
                    }

                    return false;
                }
            });
            return true;

        }
        return super.onOptionsItemSelected(item);
    }



}
