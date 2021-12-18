package com.example.del.techclass;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;
import java.util.Vector;

public class FormatAdapter extends FragmentStatePagerAdapter {
    private static int NUM_Items = 8;


    public FormatAdapter(FragmentManager fm) {

        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        if(position==0){
            FormatFragment1 crimp1 = new FormatFragment1();
            return crimp1;
        }
        else if(position==1){
            FormatFragment2 crimp2 = new FormatFragment2();
            return crimp2;
        }
        else if(position==2){
            FormatFragment3 crimp3 = new FormatFragment3();
            return crimp3;
        }
        else if(position==3){
            FormatFragment4 crimp4 = new FormatFragment4();
            return crimp4;
        }
        else if(position==4){
            FormatFragment5 crimp5 = new FormatFragment5();
            return crimp5;
        }
        else if(position==5){
            FormatFragment6 crimp6 = new FormatFragment6();
            return crimp6;
        }
        else if(position==6){
            FormatFragment7 crimp7 = new FormatFragment7();
            return crimp7;
        }
        else if(position==7){
            FormatFragment8 crimp8 = new FormatFragment8();
            return crimp8;
        }
        else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_Items;
    }
}
