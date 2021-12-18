package com.example.del.techclass.Fragments;

import android.content.Context;
import android.graphics.PorterDuff;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.del.techclass.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Del on 1/15/2017.
 */

public class MyPagerAdapter extends FragmentStatePagerAdapter {


    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();
    private final List<Integer> mFragmentIconList = new ArrayList<>();
    private Context context;

    public MyPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(Fragment f, String title, int tabIcon){
        mFragmentList.add(f);
        mFragmentTitleList.add(title);
        mFragmentIconList.add(tabIcon);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        mFragmentTitleList.get(position);
        return null;
    }

    public View getTabView(int position){
        View view = LayoutInflater.from(context).inflate(R.layout.custom_tab,null);
        TextView tabTextView = view.findViewById(R.id.tabTextView);
        tabTextView.setText(mFragmentTitleList.get(position));
        ImageView tabImageView = view.findViewById(R.id.tabImageView);
        tabImageView.setImageResource(mFragmentIconList.get(position));
        return view;
    }

    public View getSelectedTabView(int position){
        View view = LayoutInflater.from(context).inflate(R.layout.custom_tab, null);
        TextView tabTextView = view.findViewById(R.id.tabTextView);
        tabTextView.setText(mFragmentTitleList.get(position));
        tabTextView.setTextColor(ContextCompat.getColor(context, R.color.SeaGreen));
        ImageView tabImageView = view.findViewById(R.id.tabImageView);
        tabImageView.setImageResource(mFragmentIconList.get(position));
        tabImageView.setColorFilter(ContextCompat.getColor(context, R.color.SeaGreen), PorterDuff.Mode.SRC_ATOP);
        return view;
    }
}
