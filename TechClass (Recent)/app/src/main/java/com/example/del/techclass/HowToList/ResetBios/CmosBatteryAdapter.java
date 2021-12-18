package com.example.del.techclass.HowToList.ResetBios;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class CmosBatteryAdapter extends FragmentStatePagerAdapter {
    private static int counts = 8;
    public CmosBatteryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new CmosBattery1();
        }
        else if(position==1){
            return new CmosBattery2();
        }
        else if(position==2){
            return new CmosBattery3();
        }
        else if(position==3){
            return new CmosBattery4();
        }
        else if(position==4){
            return new CmosBattery5();
        }
        else if(position==5){
            return new CmosBattery6();
        }
        else if(position==6){
            return new CmosBattery7();
        }
        else if(position==7){
            return new CmosBattery8();
        }
        else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return counts;
    }
}
